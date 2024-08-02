package cn.sx.hu.wall.e.util;

import cn.sx.hu.wall.e.specs.exception.SystemException;
import cn.sx.hu.wall.e.specs.model.ResultCode;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * HttpServlet工具类
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class HttpServletUtil {

    /**
     *  获取URI
     * @param servletRequest 请求
     * @return uri
     * @throws SystemException 系统异常
     */
    public static String getUri(ServletRequest servletRequest) throws SystemException {
        if(servletRequest instanceof HttpServletRequest){
            HttpServletRequest req = (HttpServletRequest)servletRequest;
            return req.getRequestURI();
        }
        else{
            throw new SystemException(ResultCode.FAILURE);
        }
    }

    /**
     * 获取HttpServletRequest
     * @param servletRequest 请求
     * @return 请求
     * @throws SystemException 系统异常
     */
    public static HttpServletRequest getHttp(ServletRequest servletRequest) throws SystemException {
        if(servletRequest instanceof HttpServletRequest){
            return (HttpServletRequest)servletRequest;
        }
        else{
            throw new SystemException(ResultCode.FAILURE);
        }
    }

    /**
     * 重定向
     * @param response  响应
     * @param url       地址
     * @throws SystemException 系统异常
     */
    public static void sendRedirect(HttpServletResponse response, String url) throws SystemException {
        try {
            response.sendRedirect(url);
        } catch (IOException ex) {
            throw new SystemException(ResultCode.FAILURE);
        }
    }

}
