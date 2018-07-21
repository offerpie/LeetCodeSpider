package win.techflowing;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import win.techflowing.model.GetAllQuestionResponse;
import win.techflowing.network.RestClient;


/**
 * 类描述
 *
 * @author techflowing
 * @version v1.0
 * @since 2018/7/21
 */
public class Main {

    public static void main(String[] args) {
//        RestClient.get().getAPIService().getHomeHtml().enqueue(new Callback<String>() {
//            public void onResponse(Call<String> call, Response<String> response) {
//                System.out.println(response.code());
//                System.out.println(response.headers().toString());
//                System.out.println(response.body().toString());
//            }
//
//            public void onFailure(Call<String> call, Throwable throwable) {
//                System.out.println(throwable.getMessage());
//            }
//        });

        RestClient.get().getAPIService().getQuestionList().enqueue(new Callback<GetAllQuestionResponse>() {
            public void onResponse(Call<GetAllQuestionResponse> call, Response<GetAllQuestionResponse> response) {
                if (response.code() == 200) {
                    for (GetAllQuestionResponse.StatStatusPairsBean statStatusPairsBean : response.body().getStat_status_pairs()) {
                        if (statStatusPairsBean != null) {
                            System.out.println(statStatusPairsBean.getStat().getQuestion__title());
                        }
                    }
                }
            }

            public void onFailure(Call<GetAllQuestionResponse> call, Throwable throwable) {
                System.out.println(throwable.getMessage());
            }
        });

    }
}
