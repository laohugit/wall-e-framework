package cn.sx.hu.wall.e.util.pdf.exception;

/**
 * Pdf处理异常
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class PdfException extends Exception {

    public PdfException() {
        super();
    }

    public PdfException(String message) {
        super(message);
    }

    public PdfException(String message, Throwable cause) {
        super(message, cause);
    }

    public PdfException(Throwable cause) {
        super(cause);
    }

}
