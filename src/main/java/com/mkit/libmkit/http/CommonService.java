package com.mkit.libmkit.http;

import com.mkit.libmkit.bean.NewsItemBean;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by WHF.Javas on 2017/8/22.
 */

public interface CommonService {

    @GET("http://47.91.65.163:17621/recom/doc.do?appid=2&topDocKey=zxTopDoc")
    Call<NewsItemBean> getNewsList(@Query("devid") String devid);

    @GET("https://irrational.cn/lolu/article/pullup")
    Call<ResponseBody> getSth();
}
