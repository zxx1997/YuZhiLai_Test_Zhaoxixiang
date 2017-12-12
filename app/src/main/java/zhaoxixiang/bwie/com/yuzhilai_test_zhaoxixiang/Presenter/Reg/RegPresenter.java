package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Presenter.Reg;

import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.BaseBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.RegBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Model.Reg.Reg_Model;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Model.Reg.Reg_ModelListener;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.OnFinishListener;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Presenter.Presenter;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.View.Reg_View;

/**
 * Created by admin on 2017/12/11/011.
 */

public class RegPresenter implements Presenter,OnFinishListener{

    Reg_ModelListener model;

    private Reg_View view;

    public RegPresenter(Reg_View view) {
        this.view = view;
        model=new Reg_Model();
    }

    @Override
    public void get() {
        model.getData(this,view.getUrl(),view.getApp_id(),view.getTick(),view.getMobile(),view.getSign());
    }

    @Override
    public void onSuccess(BaseBean baseBean) {
        view.getReg((RegBean) baseBean);
    }
}
