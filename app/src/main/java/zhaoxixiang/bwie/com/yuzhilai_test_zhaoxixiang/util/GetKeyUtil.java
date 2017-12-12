package zhaoxixiang.bwie.com.yuzhilai_test_zhaoxixiang.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * Created by admin on 2017/12/05/005.
 */

public class GetKeyUtil {

    private static GetKeyUtil util = null;

    public GetKeyUtil() {
    }

    public static GetKeyUtil getInstance() {
        if (util == null) {
            synchronized (GetKeyUtil.class) {
                if (util == null) {
                    util = new GetKeyUtil();
                }
            }
        }
        return util;
    }

    public String getKey(String buffer) {
        String str = null;

        try {
            //进行MD5加密
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] result = digest.digest(buffer.getBytes());
            //消息摘要转换为16进制
            String ss = new BigInteger(1, result).toString(16);
            //转换为大写
            str = ss.toUpperCase();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return str;
    }
}
