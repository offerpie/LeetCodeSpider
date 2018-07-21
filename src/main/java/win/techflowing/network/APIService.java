package win.techflowing.network;

import retrofit2.Call;
import retrofit2.http.GET;
import win.techflowing.model.GetAllQuestionResponse;

/**
 * API定义
 *
 * @author techflowing
 * @version v1.0
 * @since 2018/7/21
 */
public interface APIService {

    @GET("/")
    Call<String> getHomeHtml();

    /**
     * 获取题目列表
     */
    @GET("api/problems/all")
    Call<GetAllQuestionResponse> getQuestionList();
}
