package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean;

/**
 * Created by admin on 2017/12/05/005.
 */

public class PublicKeyBean extends BaseBean{

    /**
     * ret : 0
      data : {"\u201capp_id\u201d":"\u201cB406A2EF\u201d","\u201cprivate_key\u201d":"\u201cAEF63FBAEDD31000F25FAD2E4C3C2974\u201d"}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {

        private String app_id;

        private String private_key;

        public String getApp_id() {
            return app_id;
        }

        public void setApp_id(String app_id) {
            this.app_id = app_id;
        }

        public String getPrivate_key() {
            return private_key;
        }

        public void setPrivate_key(String private_key) {
            this.private_key = private_key;
        }
    }
}
