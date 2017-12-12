package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Model.Reg;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.RegBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.OnFinishListener;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.util.ApiService;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.util.RetrofitUtils;

/**
 * Created by admin on 2017/12/11/011.
 */

public class Reg_Model implements Reg_ModelListener{
    @Override
    public void getData(final OnFinishListener listener, String url, String appid, String tick, String mobile, String sign) {
        ApiService apiService= RetrofitUtils.getInstance().getApiService(url,ApiService.class);

        Observable<RegBean> observable=apiService.getUser_reg(appid,"12345","1",tick,mobile,sign);

        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RegBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(RegBean bean) {
                        listener.onSuccess(bean);
                    }
                });
    }
}
