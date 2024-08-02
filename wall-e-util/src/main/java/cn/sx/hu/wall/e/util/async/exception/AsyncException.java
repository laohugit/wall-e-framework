package cn.sx.hu.wall.e.util.async.exception;

import cn.sx.hu.wall.e.specs.exception.CommonException;
import cn.sx.hu.wall.e.specs.model.ResultCode;
import cn.sx.hu.wall.e.util.StringUtil;
import cn.sx.hu.wall.e.util.async.core.AsyncFault;
import cn.sx.hu.wall.e.util.async.specs.IAsyncFault;

/**
 * 异步任务处理异常
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class AsyncException extends CommonException {

    private final IAsyncFault asyncFault;

    public AsyncException(IAsyncFault resultCode) {
        this(resultCode, null);
    }

    public AsyncException(Throwable cause) {
        this(AsyncFault.SERVICE_EXCEPTION, cause);
    }

    public AsyncException(IAsyncFault asyncFault, Throwable cause) {
        super(cause, ResultCode.ASYNC_FAILURE.getCode(),
                StringUtil.isEmpty(asyncFault.getMessage()) ? ResultCode.ASYNC_FAILURE.getMsg() : asyncFault.getMessage());
        this.asyncFault = asyncFault;
    }

    public IAsyncFault getAsyncFault() {
        return asyncFault;
    }

}
