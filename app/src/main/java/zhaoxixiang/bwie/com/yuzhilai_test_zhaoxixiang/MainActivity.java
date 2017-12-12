package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.hjm.bottomtabbar.BottomTabBar;

import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Fragment.FragDianWu;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Fragment.FragMySelf;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Fragment.FragStudy;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Fragment.FragYiGou;

public class MainActivity extends FragmentActivity {


    private BottomTabBar mainTabbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);

        initView();

        mainTabbar.init(getSupportFragmentManager())
                .setImgSize(50,50)
                .setFontSize(8)
                .setTabPadding(4,6,10)
                .setChangeColor(Color.RED,Color.DKGRAY)
                .addTabItem("学习",R.mipmap.study_red,R.mipmap.study, FragStudy.class)
                .addTabItem("已购",R.mipmap.gouwuche_icon_red,R.mipmap.gouwuche_icon, FragYiGou.class)
                .addTabItem("店务",R.mipmap.dianwu_red,R.mipmap.dianwu, FragDianWu.class)
                .addTabItem("我的",R.mipmap.my_self_icon_red,R.mipmap.my_self_icon, FragMySelf.class)
                .isShowDivider(false);
                /*.setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });*/
    }


    private void initView() {
        mainTabbar = (BottomTabBar) findViewById(R.id.main_tabbar);
    }
}
