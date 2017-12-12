package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.LoginActivity;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.R;

/**
 * Created by admin on 2017/12/11/011.
 */

public class FragMySelf extends Fragment {
    private RelativeLayout myselfLogin;
    private SimpleDraweeView myselfSdv;
    private TextView myselfName;
    private View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_myself, container, false);
        initView();

        myselfLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

    private void initView() {
        myselfLogin = (RelativeLayout) view.findViewById(R.id.myself_login);
        myselfSdv = (SimpleDraweeView) view.findViewById(R.id.myself_sdv);
        myselfName = (TextView) view.findViewById(R.id.myself_name);
    }
}
