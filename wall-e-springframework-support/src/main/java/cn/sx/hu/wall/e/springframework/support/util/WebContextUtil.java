package cn.sx.hu.wall.e.springframework.support.util;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import cn.sx.hu.wall.e.specs.exception.SystemException;
import cn.sx.hu.wall.e.specs.model.ResultCode;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * 获取请求/响应工具类
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class WebContextUtil {

    /**
     * 获取请求
     * @return 请求
     */
    public static HttpServletRequest getRequest() {
        return  ((ServletRequestAttributes) getRequestAttributes()).getRequest();
    }

    /**
     * 获取响应
     * @return 响应
     */
    public static HttpServletResponse getResponse() {
        return  ((ServletRequestAttributes) getRequestAttributes()).getResponse();
    }

    private static RequestAttributes getRequestAttributes() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if(Objects.isNull(requestAttributes)) {
            throw new SystemException(ResultCode.FAILURE);
        }
        return requestAttributes;
    }

}
