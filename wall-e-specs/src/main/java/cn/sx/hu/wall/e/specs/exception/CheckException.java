package cn.sx.hu.wall.e.specs.exception;

import cn.sx.hu.wall.e.specs.model.ResultCode;

/**
 * 自定义校验异常
 * 1.用于数据校验失败时抛出异常
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class CheckException extends CommonException {

	private static final long serialVersionUID = 1284747576447458506L;

    public CheckException(ResultCode resultCode){
        super(resultCode);
    }

    public CheckException(String code, String msg){
        super(code, msg);
    }

    public CheckException(CommonException e){
        super(e);
    }

    public CheckException(Exception e, ResultCode resultCode){
        super(e, resultCode);
    }

    public CheckException(Throwable throwable, ResultCode resultCode){
        super(throwable, resultCode);
    }

    public CheckException(Throwable throwable, String code, String msg){
        super(throwable, code, msg);
    }
	
}
