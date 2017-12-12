package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean;

/**
 * Created by admin on 2017/12/11/011.
 */

public class RegBean extends BaseBean{

    /**
     * data : {"session":"5559936945f96e05efbbf344"}
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
         * session : 5559936945f96e05efbbf344
         */

        private String session;

        public String getSession() {
            return session;
        }

        public void setSession(String session) {
            this.session = session;
        }
    }
}
