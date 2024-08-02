package cn.sx.hu.wall.e.util;

import org.junit.Test;

import java.util.UUID;
import java.util.logging.Logger;

/**
 * 随机工具类测试
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class RandomUtilTest {

    @Test
    public void test() {
        Logger.getGlobal().info(RandomUtil.getString(64));
        Logger.getGlobal().info(UUID.randomUUID().toString().replaceAll("-", ""));
    }

}
