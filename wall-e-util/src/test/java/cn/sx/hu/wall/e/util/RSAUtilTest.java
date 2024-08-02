package cn.sx.hu.wall.e.util;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.Map;
import java.util.logging.Logger;

/**
 * RSA工具类测试
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class RSAUtilTest {

    @Test
    public void test() {
        Map<String, String> keys = RSAUtil.createKeys(512);
        Logger.getGlobal().info(JSON.toJSONString(keys));
    }

}
