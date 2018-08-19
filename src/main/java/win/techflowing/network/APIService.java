package win.techflowing.network;

import retrofit2.Call;
import retrofit2.http.*;
import win.techflowing.model.GetAllQuestionResponse;
import win.techflowing.model.GetAnswerResponse;
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

    /**
     * 获取题目详情
     */
    @POST("/graphql")
    Call<GetQuestionDetailResponse> getQuestionDetail(@Body GetQuestionDetailRequest request);

    /**
     * 获取AC的代码
     */
    @GET("/submissions/latest/?qid=1")
    Call<GetAnswerResponse> getAnswer(@Header("referer") String referer, @Query("lang") String lang);
}
