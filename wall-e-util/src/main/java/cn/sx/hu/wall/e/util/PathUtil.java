package cn.sx.hu.wall.e.util;

import java.io.File;
import java.util.Objects;

/**
 * Path工具类
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class PathUtil {

    private PathUtil(){

    }

    public static String format(String path) {
        if(Objects.isNull(path) || path.isEmpty()) {
            return path;
        }
        if(path.endsWith(File.separator)) {
            return path;
        }
        return path + File.separator;
    }

}
