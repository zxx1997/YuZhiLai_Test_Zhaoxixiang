package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Date;


import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.GetHostBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.PublicKeyBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Presenter.FirstHand.FirstHandPrestener;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Presenter.GetHost.GetHostPresenter;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.View.First_Hand_View;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.View.Get_Host_View;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.util.GetKeyUtil;

/**
 * Created by admin on 2017/12/05/005.
 */

public class Get_UrlActivity extends AppCompatActivity implements First_Hand_View,Get_Host_View {

    private String privateKey=null;
    private String tick;
    private String key;
    private String appid;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    FirstHandPrestener firstHandPrestener;

    GetHostPresenter getHostPresenter;

    private String pKey;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences=getSharedPreferences("user", Context.MODE_PRIVATE);
        editor=preferences.edit();
        privateKey=getSharedPreferences("user",MODE_PRIVATE).getString("key",null);
        appid=getSharedPreferences("user",MODE_PRIVATE).getString("app_id",null);
        Long now=new Date().getTime()/1000;

        tick=now+"";
        Log.i("xxx",tick);
        if(privateKey==null){
            first();
        }else{
            Log.i("xxx",privateKey);
            Log.i("xxx",appid);
            gethost();
        }
    }

    private void first(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("312045ED9D036BEED16E96F3878E222ED7E58AC9");
        buffer.append("ANDROID");
        buffer.append("12345");
        buffer.append("1");
        buffer.append(tick);
        String param = buffer.toString();
        key=GetKeyUtil.getInstance().getKey(param);
        Log.i("xxx",key);
        firstHandPrestener=new FirstHandPrestener(this);
        firstHandPrestener.get();

    }

    private void gethost(){
        privateKey=getSharedPreferences("user",MODE_PRIVATE).getString("key",null);
        appid=getSharedPreferences("user",MODE_PRIVATE).getString("app_id",null);
        StringBuffer buffer=new StringBuffer();
        buffer.append(privateKey);
        buffer.append(appid);
        buffer.append("12345");
        buffer.append("1");
        buffer.append(tick);
        String param=buffer.toString();
        pKey=GetKeyUtil.getInstance().getKey(param);
        Log.i("xxx",pKey);
        getHostPresenter=new GetHostPresenter(this);
        getHostPresenter.get();

    }
    @Override
    public void getFirst(PublicKeyBean bean) {
        String privatekey=bean.getData().getPrivate_key();
        String app_id=bean.getData().getApp_id();

        editor.putString("key",privatekey);
        editor.putString("app_id",app_id);
        Log.i("xxx123",privatekey);
        editor.commit();

        gethost();
    }

    @Override
    public String getTick() {
        return tick;
    }

    @Override
    public String getPrivateKey() {
        return pKey;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void getHost(GetHostBean bean) {
        String url=bean.getData().getUrl_host();

        editor.putString("url",url);
        Log.i("xxx123",url);
        editor.commit();

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    public String getAppId() {
        return appid;
    }
}
