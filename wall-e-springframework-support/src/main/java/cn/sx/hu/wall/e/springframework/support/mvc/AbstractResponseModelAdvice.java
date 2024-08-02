package cn.sx.hu.wall.e.springframework.support.mvc;

import cn.sx.hu.wall.e.specs.model.ResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Objects;

/**
 * 统一返回数据格式
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public abstract class AbstractResponseModelAdvice implements ResponseBodyAdvice<Object>  {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> converterClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body,
                                  MethodParameter methodParameter,
                                  MediaType mediaType,
                                  Class<? extends HttpMessageConverter<?>> clazz,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {

        logger.debug("mediaType:{},converter:{}", mediaType.getType(), clazz.getName());

        if(body instanceof String || body instanceof ResponseModel) {
            return body;
        }

        // 没有返回数据时数据格式化
        if(Objects.isNull(body)) {
            return ResponseModel.success();
        }

        // 返回数据格式化
        return ResponseModel.success(body);
    }

}
