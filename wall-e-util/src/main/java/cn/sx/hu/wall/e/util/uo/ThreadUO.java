package cn.sx.hu.wall.e.util.uo;

import cn.sx.hu.wall.e.specs.model.session.UserSession;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 线程工具类数据模型
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class ThreadUO {

    private UserSession userSession;       // 用户会话数据
    private HttpServletRequest request;
    private HttpServletResponse response;

    public UserSession getUserSession() {
        return userSession;
    }

    public void setUserSession(UserSession userSession) {
        this.userSession = userSession;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

}
