package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Model.Reg;

import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.OnFinishListener;

/**
 * Created by admin on 2017/12/11/011.
 */

public interface Reg_ModelListener {
    void getData(OnFinishListener listener,String url,String appid,
                 String tick,String mobile, String sign);
}
