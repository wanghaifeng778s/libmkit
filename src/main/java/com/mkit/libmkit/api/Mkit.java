package com.mkit.libmkit.api;

import android.content.Context;

import com.mkit.libmkit.bean.DataCallBack;
import com.mkit.libmkit.bean.DataCallBackBody;
import com.mkit.libmkit.bean.NewsItemBean;
import com.mkit.libmkit.http.Api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by WHF.Javas on 2017/9/28.
 */

public class Mkit {
    /**
     * 接口
     * @param id
     * @param callBack
     */
    public static void getBean(String id, final DataCallBack callBack, Context context){
        Api.getComApi(context).getNewsList(id).enqueue(new Callback<NewsItemBean>() {
            @Override
            public void onResponse(Call<NewsItemBean> call, Response<NewsItemBean> response) {
                callBack.dataCall(response);
            }

            @Override
            public void onFailure(Call<NewsItemBean> call, Throwable throwable) {

            }
        });
    }
    public static void getBody(Context context,final DataCallBackBody body){
        Api.getComApi(context).getSth().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                body.dataCall(response);
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable throwable) {

            }
        });
    }
}
