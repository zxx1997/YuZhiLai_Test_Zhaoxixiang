package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Presenter.FirstHand;


import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.BaseBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.PublicKeyBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Model.FirstHandListenter;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Model.First_HandModel;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.OnFinishListener;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Presenter.Presenter;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.View.First_Hand_View;

/**
 * Created by admin on 2017/12/08/008.
 */

public class FirstHandPrestener implements Presenter,OnFinishListener{


    FirstHandListenter model;

    private First_Hand_View view;


    public FirstHandPrestener(First_Hand_View view){
        this.view=view;
        model=new First_HandModel();
    }
    @Override
    public void get() {
        model.getData(this,view.getTick(),view.getKey());
    }

    @Override
    public void onSuccess(BaseBean baseBean) {
        view.getFirst((PublicKeyBean) baseBean);
    }
}
