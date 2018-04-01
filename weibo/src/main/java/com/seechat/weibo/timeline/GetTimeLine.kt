package com.seechat.weibo.timeline

import android.util.Log
import com.seechat.commutils.netutil.HttpManager
import com.seechat.weibo.auth.Auth
import com.seechat.weibo.timeline.model.PublicTimeLine
import com.sina.weibo.sdk.auth.AccessTokenKeeper
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.http.GET
import retrofit2.http.Query

class GetTimeLine {

    val TAG = "Get TimeLine"

    var auth: Auth
    var httpClient: Retrofit
    var BASE_URL = "https://api.weibo.com/"

    interface IGetPublicTimeLine {
        @GET("2/statuses/public_timeline.json")
        fun getPublicTimeLine(@Query("access_token") accessToken: String): Observable<String>;

    }

    constructor() {
        auth = Auth();
        httpClient = HttpManager.getHttpClient<PublicTimeLine>(BASE_URL);
    }

    fun getPublicTimeLine() {
        /*
        val create = httpClient.create(IGetPublicTimeLine::class.java)
        //val publicTimeLine = create.getPublicTimeLine(auth.weiboAccessToken)
        val publicTimeLine = create.getPublicTimeLine("2.00BUJX1EuahPnDd0347d558aLnXEdD")
        publicTimeLine.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Log.d("GetPublicTimeLine", "test get public timeline")
                    Log.d("GetPublicTimeLine", it.toString())
                })
        */
        val okHttpBuilder = OkHttpClient.Builder()
        var retrofit = Retrofit
                .Builder()
                .client(okHttpBuilder.build())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(BASE_URL).build()
        var iGetPublicTimeLine = retrofit.create(IGetPublicTimeLine::class.java)
        var observable = iGetPublicTimeLine.getPublicTimeLine("2.00BUJX1EuahPnDd0347d558aLnXEdD")

        observable.observeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.newThread())
                .subscribe { Log.d(TAG, iGetPublicTimeLine.toString()) }
        

    }


}