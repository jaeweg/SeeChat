package com.seechat.weibo.auth;

import android.os.Build;

import java.util.ArrayList;

public class AuthInfo {

    ArrayList<AuthChangeListener> authChangeListeners;

    interface AuthChangeListener {
        void onAnthChangeListener();
    }


    public void getAuthInfo() {

    }

    public void SetAuthInfo() {

        //handle
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            authChangeListeners.stream().forEach(AuthChangeListener::onAnthChangeListener);
        } else {
            for (AuthChangeListener authChangeListener :
                    authChangeListeners) {
                authChangeListener.onAnthChangeListener();
            }
        }
    }

    void addAuthChangeListener(AuthChangeListener listener) {
        authChangeListeners.add(listener);
    }
}
