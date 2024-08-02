package cn.sx.hu.wall.e.util.shell.exception;

/**
 * Shell执行异常
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class ShellException extends Exception {

    public ShellException() {
        super();
    }

    public ShellException(String message) {
        super(message);
    }

    public ShellException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShellException(Throwable cause) {
        super(cause);
    }

}
