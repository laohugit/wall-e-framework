package cn.sx.hu.wall.e.specs.exception;

import cn.sx.hu.wall.e.specs.model.ResultCode;

/**
 * 数据接入层异常
 * 1.用于Dao层处理异常时抛出
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class DaoException extends CommonException {

	private static final long serialVersionUID = -1284747576440458506L;

    public DaoException(ResultCode resultCode){
        super(resultCode);
    }

    public DaoException(String code, String msg){
        super(code, msg);
    }

    public DaoException(CommonException e){
        super(e);
    }

    public DaoException(Exception e, ResultCode resultCode){
        super(e, resultCode);
    }

    public DaoException(Throwable throwable, ResultCode resultCode){
        super(throwable, resultCode);
    }

    public DaoException(Throwable throwable, String code, String msg){
        super(throwable, code, msg);
    }
	
}
