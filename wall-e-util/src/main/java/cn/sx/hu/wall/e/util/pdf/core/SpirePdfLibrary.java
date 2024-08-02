package cn.sx.hu.wall.e.util.pdf.core;

import cn.sx.hu.wall.e.util.pdf.exception.PdfException;
import cn.sx.hu.wall.e.util.pdf.model.PdfParam;
import cn.sx.hu.wall.e.util.pdf.specs.IPdfLibrary;
import cn.sx.hu.wall.e.util.pdf.model.PdfResult;

/**
 * SpirePdf处理库
 * https://www.e-iceblue.com/Download/pdf-for-java-free.html
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class SpirePdfLibrary implements IPdfLibrary {
    @Override
    public PdfResult convert(PdfParam param) throws PdfException {
        return null;
    }

    @Override
    public void cleanFileDir(PdfParam param) throws PdfException {

    }

    @Override
    public String pkgImageFilePath(PdfParam param, int pageNo) throws PdfException {
        return null;
    }

    @Override
    public long getTotalPage(String filePath) throws PdfException {
        return 0;
    }

}
