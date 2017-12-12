package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Model;


import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean.PublicKeyBean;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.OnFinishListener;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.util.Api;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.util.ApiService;
import zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.util.RetrofitUtils;

/**
 * Created by admin on 2017/12/05/005.
 */

public class First_HandModel implements FirstHandListenter{

    @Override
    public void getData(final OnFinishListener listener, String tick, String key) {
        ApiService apiService= RetrofitUtils.getInstance().getApiService(Api.url,ApiService.class);

        Observable<PublicKeyBean> observable=apiService.getPublic("ANDROID","12345","1",tick,key);

        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<PublicKeyBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(PublicKeyBean bean) {
                        listener.onSuccess(bean);
                    }
                });
    }
}
