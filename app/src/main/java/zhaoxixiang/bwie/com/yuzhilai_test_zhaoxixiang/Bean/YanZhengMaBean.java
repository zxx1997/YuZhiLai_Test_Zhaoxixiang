package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.Bean;

/**
 * Created by admin on 2017/12/11/011.
 */

public class YanZhengMaBean extends BaseBean{

    /**
     * data : {"alert":true,"login":true,"message":"","session":"5559936945f96e05efbbf344","uname":"13800000"}
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
         * alert : true
         * login : true
         * message :
         * session : 5559936945f96e05efbbf344
         * uname : 13800000
         */

        private boolean alert;
        private boolean login;
        private String message;
        private String session;
        private String uname;

        public boolean isAlert() {
            return alert;
        }

        public void setAlert(boolean alert) {
            this.alert = alert;
        }

        public boolean isLogin() {
            return login;
        }

        public void setLogin(boolean login) {
            this.login = login;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getSession() {
            return session;
        }

        public void setSession(String session) {
            this.session = session;
        }

        public String getUname() {
            return uname;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }
    }
}
