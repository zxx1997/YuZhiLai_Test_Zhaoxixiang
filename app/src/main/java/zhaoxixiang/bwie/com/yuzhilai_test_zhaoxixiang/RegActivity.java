package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Date;

import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.RegBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Presenter.Reg.RegPresenter;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.View.Reg_View;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.util.GetKeyUtil;

public class RegActivity extends AppCompatActivity implements Reg_View{

    private ImageView regBack;
    private EditText regPhone;
    private EditText regYanzhengma;
    private EditText regPassword;
    private Button regReg;

    private String tick;
    private String key;
    private String appid;
    private String mobile;
    private String url;

    private RegPresenter regPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        initView();

        regPresenter=new RegPresenter(this);

        regYanzhengma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mobile=regPhone.getText().toString().trim();
                String k=getSharedPreferences("user",Context.MODE_PRIVATE).getString("key",null);
                StringBuffer buffer=new StringBuffer();
                buffer.append(k);
                buffer.append(appid);
                buffer.append("12345");
                buffer.append("1");
                buffer.append(tick);
                buffer.append(mobile);
                String param = buffer.toString();
                key= GetKeyUtil.getInstance().getKey(param);

                regPresenter.get();
            }
        });

        regReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void initView() {
        regBack = (ImageView) findViewById(R.id.reg_back);
        regPhone = (EditText) findViewById(R.id.reg_phone);
        regYanzhengma = (EditText) findViewById(R.id.reg_yanzhengma);
        regPassword = (EditText) findViewById(R.id.reg_password);
        regReg = (Button) findViewById(R.id.reg_reg);
        Long now=new Date().getTime()/1000;
        tick=now+"";
        appid=getSharedPreferences("user", Context.MODE_PRIVATE).getString("app_id",null);

    }

    @Override
    public void getReg(RegBean bean) {
        String se=bean.getData().getSession();
        Log.i("xxx123",se);
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public String getApp_id() {
        return appid;
    }

    @Override
    public String getTick() {
        return tick;
    }

    @Override
    public String getMobile() {
        return mobile;
    }

    @Override
    public String getSign() {
        return key;
    }
}
