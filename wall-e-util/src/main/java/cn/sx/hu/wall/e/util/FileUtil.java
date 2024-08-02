package cn.sx.hu.wall.e.util;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

/**
 * 文件处理工具类
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class FileUtil {

    public static void deleteFiles(File file){
        if(null == file || !file.exists()) {
            return;
        }
        if(file.isDirectory()) {
            Arrays.stream(Objects.requireNonNull(file.listFiles())).forEach(FileUtil::deleteFiles);
        }
        file.delete();
    }

}
