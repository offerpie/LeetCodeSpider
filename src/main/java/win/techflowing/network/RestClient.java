package win.techflowing.network;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import win.techflowing.Config;

import javax.net.ssl.*;
import java.io.*;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * 网络请求Client
 *
 * @author techflowing
 * @version v1.0
 * @since 2018/7/21
 */
public class RestClient {

    /** URL */
    private static final String BASE_URL = "https://leetcode-cn.com/";
    /** API接口 */
    private APIService mAPIService;

    /**
     * 私有构造方法
     */
    private RestClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(getOkHttpClient())
                .build();
        mAPIService = retrofit.create(APIService.class);
    }

    /**
     * 单例
     */
    public static RestClient get() {
        return RestClientHolder.sInstance;
    }

    /**
     * 获取API服务
     */
    public APIService getAPIService() {
        return mAPIService;
    }


    /**
     * OkHttpClient
     */
    private OkHttpClient getOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .addNetworkInterceptor(new Interceptor() {
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request().newBuilder()
                                .header("user-agent", Config.USER_AGENT)
                                .header("referer", "https://leetcode-cn.com/problemset/algorithms/")
                                .header("cookie","_uab_collina=153095290132036588613107; gr_user_id=d57e64cf-6185-47e9-b93d-11d72d675775; Hm_lvt_fa218a3ff7179639febdb15e372f411c=1530953282,1532090915,1532090936,1532154490; csrftoken=Wd8t6BOhCU2EtDLSX8pQDXBXrY1AX3j5ZSVdPQJMVwUC0CYdDU7xxgrdYU0NudBj; gr_session_id_a2873925c34ecbd2=b1bc13e0-c686-4e72-99f2-1dfb69c4f5f2; gr_session_id_a2873925c34ecbd2_b1bc13e0-c686-4e72-99f2-1dfb69c4f5f2=true; Hm_lpvt_fa218a3ff7179639febdb15e372f411c=1532178983")
                                .header("x-csrftoken", "Wd8t6BOhCU2EtDLSX8pQDXBXrY1AX3j5ZSVdPQJMVwUC0CYdDU7xxgrdYU0NudBj")
                                .build();
                        return chain.proceed(request);
                    }
                })
                .connectTimeout(60, TimeUnit.SECONDS);
        try {
            setCertificates(builder, new FileInputStream(Config.CERTIFICATE));
        } catch (FileNotFoundException e) {
            throw new IllegalStateException("Https证书未找到");
        }
        return builder.build();
    }

    /**
     * 设置Https证书
     *
     * @param clientBuilder OkHttpClient.Builder
     * @param certificates  证书流
     */
    private void setCertificates(OkHttpClient.Builder clientBuilder, InputStream... certificates) {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null);
            int index = 0;
            for (InputStream certificate : certificates) {
                String certificateAlias = Integer.toString(index++);
                keyStore.setCertificateEntry(certificateAlias, certificateFactory
                        .generateCertificate(certificate));
                try {
                    if (certificate != null) {
                        certificate.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(
                    TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                throw new IllegalStateException("Unexpected default trust managers:"
                        + Arrays.toString(trustManagers));
            }
            X509TrustManager trustManager = (X509TrustManager) trustManagers[0];
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
            SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
            clientBuilder.sslSocketFactory(sslSocketFactory, trustManager);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 单例静态内部类
     */
    private static class RestClientHolder {
        /** 单例 */
        private static RestClient sInstance = new RestClient();
    }
}
