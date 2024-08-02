package cn.sx.hu.wall.e.util;

import cn.sx.hu.wall.e.specs.exception.SystemException;
import cn.sx.hu.wall.e.util.constant.UtilResultCode;
import net.coobird.thumbnailator.Thumbnails;

import java.io.File;
import java.io.IOException;

/**
 * 图片工具类
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class ImageUtil {

    public static void generateThumbnail(String filename, String originPath, String targetPath) throws SystemException {

        try {
            File targetFile = new File(targetPath);
            if (!targetFile.exists()) {
                if(!targetFile.mkdirs()) {
                    throw new SystemException(UtilResultCode.MAKE_DIRECTORY_FAILURE);
                }
            }
            Thumbnails.of(new File(originPath + File.separator + filename))
                    .size(320, 180)
                    .outputQuality(1.0f)
                    .toFile(new File(targetPath + File.separator + filename));
        } catch (IOException e) {
            throw new SystemException(e, UtilResultCode.GENERATE_THUMBNAILS_FAILURE);
        }
    }

}
