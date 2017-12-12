package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.View;

import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.GetHostBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.PublicKeyBean;

/**
 * Created by admin on 2017/12/05/005.
 */

public interface Get_Host_View {
    void getHost(GetHostBean bean);
    String getAppId();
    String getTick();
    String getPrivateKey();
}
