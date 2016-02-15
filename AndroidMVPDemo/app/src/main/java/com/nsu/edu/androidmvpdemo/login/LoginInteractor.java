package com.nsu.edu.androidmvpdemo.login;

/**
 * Created by Anthony on 2016/2/15.
 * Class Note:模拟登陆的操作的接口，实现类为LoginInteractorImpl.相当于MVP模式中的Model层
 */
public interface LoginInteractor {
    void login(String username, String password, OnLoginFinishedListener listener);
}
