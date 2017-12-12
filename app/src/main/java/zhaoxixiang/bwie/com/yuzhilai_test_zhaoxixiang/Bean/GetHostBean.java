package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean;

/**
 * Created by admin on 2017/12/05/005.
 */

public class GetHostBean extends BaseBean{


    /**
     * ret : 0
     * data : {"url_host":"https://app.pretty.f8cam.com:17211"}
     */


    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * url_host : https://app.pretty.f8cam.com:17211
         */

        private String url_host;

        public String getUrl_host() {
            return url_host;
        }

        public void setUrl_host(String url_host) {
            this.url_host = url_host;
        }
    }
}
