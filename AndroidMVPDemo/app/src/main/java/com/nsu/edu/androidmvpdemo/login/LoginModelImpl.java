package com.nsu.edu.androidmvpdemo.login;

import android.os.Handler;
import android.text.TextUtils;
/**
 * Created by Anthony on 2016/2/15.
 * Class Note:延时模拟登陆（2s），如果名字或者密码为空则登陆失败，否则登陆成功
 */
public class LoginModelImpl implements LoginModel {

    private String userName;
    private String passWord;
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        userName = username;
        passWord = password;

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();//model层里面回调listener
                    return;
                }

                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    return;
                }

                if(!ValidUserCredentials())
                {
                    listener.onPasswordError();
                    return;
                }

                listener.onSuccess();

            }
        }, 2300);
    }

    public boolean ValidUserCredentials()
    {
        if((userName.compareTo("rock") == 0) && (passWord.compareTo("rockzhang") == 0))
            return true;
        else
            return false;

    }
}
