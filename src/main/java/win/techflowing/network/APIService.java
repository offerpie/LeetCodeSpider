package win.techflowing.network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import win.techflowing.model.GetAllQuestionResponse;
import win.techflowing.model.GetQuestionDetailRequest;
import win.techflowing.model.GetQuestionDetailResponse;

/**
 * API定义
 *
 * @author techflowing
 * @version v1.0
 * @since 2018/7/21
 */
public interface APIService {

    /**
     * 获取题目列表
     */
    @GET("api/problems/all")
    Call<GetAllQuestionResponse> getQuestionList();

    @POST("/graphql")
    Call<GetQuestionDetailResponse> getQuestionDetail(@Body GetQuestionDetailRequest request);
}
