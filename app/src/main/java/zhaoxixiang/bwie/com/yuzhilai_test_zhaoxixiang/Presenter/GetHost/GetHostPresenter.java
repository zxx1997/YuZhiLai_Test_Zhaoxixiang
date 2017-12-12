package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Presenter.GetHost;

import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.BaseBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.GetHostBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Model.GetHostListenter;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Model.GetHostModel;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.OnFinishListener;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Presenter.Presenter;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.View.Get_Host_View;

/**
 * Created by admin on 2017/12/08/008.
 */

public class GetHostPresenter implements Presenter,OnFinishListener{


    GetHostListenter model;

    private Get_Host_View view;


    public GetHostPresenter(Get_Host_View view){
        this.view=view;
        model=new GetHostModel();
    }
    @Override
    public void get() {
        model.getData(this,view.getAppId(),view.getTick(),view.getPrivateKey());
    }

    @Override
    public void onSuccess(BaseBean baseBean) {
        view.getHost((GetHostBean) baseBean);
    }
}
