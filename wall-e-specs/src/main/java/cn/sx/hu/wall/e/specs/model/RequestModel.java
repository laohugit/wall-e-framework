package cn.sx.hu.wall.e.specs.model;

import io.swagger.annotations.ApiModel;

/**
 * 请求模型
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
@ApiModel("请求模型")
public class RequestModel<T> extends CommonModel<T> {

    private static final long serialVersionUID = 2613382726394084814L;

    public RequestModel(){
        super();
    }

}

