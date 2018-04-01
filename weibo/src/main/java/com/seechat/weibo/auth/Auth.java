package com.seechat.weibo.auth;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.sina.weibo.sdk.WbSdk;
import com.sina.weibo.sdk.WeiboAppManager;
import com.sina.weibo.sdk.auth.AccessTokenKeeper;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WbAuthListener;
import com.sina.weibo.sdk.auth.WbConnectErrorMessage;
import com.sina.weibo.sdk.auth.sso.SsoHandler;

/**
 * Created by zcheng on 2018/3/29.
 */

public class Auth {

    private final String TAG = "Auth-util";

    static final String WEIBO_APP_KEY = "3476181460";
    static final String WEIBO_REDIRECT_URL = "https://api.weibo.com/oauth2/default.html";
    static final String WEIBO_SCOPE = "";

    Application application;
    Activity activity;
    SsoHandler ssoHandler;//need to add CallBack on "onActivityResult"


    /**
     * init in application to install weiboSDK
     *
     * @param application
     */
    public void weiboInstall(Application application) {
        this.application = application;
        AuthInfo authInfo = new AuthInfo(this.application, WEIBO_APP_KEY, WEIBO_REDIRECT_URL, WEIBO_SCOPE);
        WbSdk.install(this.application, authInfo);
    }

    private class SelfWbAuthListener implements com.sina.weibo.sdk.auth.WbAuthListener {

        @Override
        public void onSuccess(Oauth2AccessToken oauth2AccessToken) {
            // keep auth infomation
            Log.i(TAG, "Weibo auth success");
            saveWeiboAuthInfo(oauth2AccessToken);
        }

        @Override
        public void cancel() {
            Toast.makeText(activity, "微博登录取消", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onFailure(WbConnectErrorMessage wbConnectErrorMessage) {
            Toast.makeText(activity, "微博登录错误", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onFailure: " + wbConnectErrorMessage.getErrorMessage());
        }
    }

    private void saveWeiboAuthInfo(Oauth2AccessToken token) {
        if (token.isSessionValid()) {
            AccessTokenKeeper.writeAccessToken(activity, token);
            Log.d(TAG, "saveWeiboAuthInfo: write valid token" + AccessTokenKeeper.readAccessToken(activity).getToken().toString());

        } else {
            Log.d(TAG, "saveWeiboAuthInfo: token session is no valid");
        }
    }

    public String getWeiboAccessToken() {
        Oauth2AccessToken oauth2AccessToken = AccessTokenKeeper.readAccessToken(activity);
        if (oauth2AccessToken != null && oauth2AccessToken.isSessionValid()) {
            return oauth2AccessToken.getToken().toString();
        }
        Log.d(TAG, "getWeiboAccessToken: token is valid,return null");
        return null;
    }

    /**
     * get Auth from WeiBo
     *
     * @param activity
     * @param authType 1 by client,2,by web,3 auto select
     */
    public void auth(Activity activity, int authType) {
        this.activity = activity;
        ssoHandler = new SsoHandler(this.activity);
        ssoHandler.authorize(new SelfWbAuthListener());
    }


    public void onAuthResult(int requestCode, int resultCode, Intent data) {
        if (ssoHandler != null) {
            ssoHandler.authorizeCallBack(requestCode, resultCode, data);
        }
    }


}
