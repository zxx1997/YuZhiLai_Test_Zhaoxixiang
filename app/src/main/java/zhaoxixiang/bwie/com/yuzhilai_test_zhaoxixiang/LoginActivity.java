package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private ImageView loginBack;
    private EditText loginPhone;
    private EditText loginPassword;
    private TextView loginWangjiPassword;
    private Button loginLogin;
    private Button loginReg;
    private RadioGroup loginRg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();

        loginReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,RegActivity.class);
                startActivity(intent);
            }
        });


    }

    private void initView() {
        loginBack = (ImageView) findViewById(R.id.login_back);
        loginPhone = (EditText) findViewById(R.id.login_phone);
        loginPassword = (EditText) findViewById(R.id.login_password);
        loginWangjiPassword = (TextView) findViewById(R.id.login_wangji_password);
        loginLogin = (Button) findViewById(R.id.login_login);
        loginReg = (Button) findViewById(R.id.login_reg);
        loginRg = (RadioGroup) findViewById(R.id.login_rg);
    }
}
