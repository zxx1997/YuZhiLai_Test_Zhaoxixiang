package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.util;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.GetHostBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.PublicKeyBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.RegBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.YanZhengMaBean;

/**
 * Created by admin on 2017/12/05/005.
 */

public interface ApiService {
    //首次握手
    @FormUrlEncoded
    @POST("/app/v1/first_hand")
    Observable<PublicKeyBean> getPublic(@Field("type") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code,
                                        @Field("tick") String tick, @Field("sign") String sign);

    //连接导向，获取服务器端口地址
    @FormUrlEncoded
    @POST("/app/v1/get_host")
    Observable<GetHostBean> getPrivate(@Field("app_id") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code,
                                       @Field("tick") String tick, @Field("sign") String sign);

    //获取轮播图列表
    @FormUrlEncoded
    @POST("/app/v1/list_banner")
    Observable<PublicKeyBean> getBanner(@Field("app_id") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code,
                                        @Field("tick") String tick, @Field("sign") String sign);

    //获取试听课程列表
    @FormUrlEncoded
    @POST("/app/v1/list_try")
    Observable<PublicKeyBean> getList_try(@Field("app_id") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code,
                                          @Field("tick") String tick, @Field("session") String session, @Field("category") String category,
                                          @Field("page_size") String page_size, @Field("page_index") String page_index,
                                          @Field("sign") String sign);

    //用户注册
    @FormUrlEncoded
    @POST("/app/v1/user_reg")
    Observable<RegBean> getUser_reg(@Field("app_id") String type, @Field("dev_id") String dev_id,
                                    @Field("ver_code") String ver_code,
                                    @Field("tick") String tick, @Field("mobile") String mobile,
                                    @Field("sign") String sign);

    //获取验证码
    @FormUrlEncoded
    @POST("/app/v1/user_check_rand")
    Observable<YanZhengMaBean> getUser_check_rand(@Field("app_id") String type, @Field("dev_id") String dev_id,
                                                  @Field("ver_code") String ver_code, @Field("tick") String tick,
                                                  @Field("session") String session, @Field("rand") String rand,
                                                  @Field("passwd") String passwd, @Field("sign") String sign);

}
