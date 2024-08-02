package cn.sx.hu.wall.e.util;

import java.util.UUID;

/**
 * ID工具类
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class IdUtil {

    /**
     * 获取UUID
     * @return UUID
     */
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }

}
