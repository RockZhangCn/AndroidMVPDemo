package com.nsu.edu.androidmvpdemo.login;

/**
 * Created by Anthony on 2016/2/15.
 * Class Note:登陆时间监听
 */
public interface OnLoginFinishedListener {

    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
