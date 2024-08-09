package cn.sx.hu.wall.e.specs.annotation;


import java.lang.annotation.*;

/**
 * 操作日志集
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
@Inherited
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OperationLogs {

    /**
     * 配置多条操作日志
     * @return 操作日志集合
     */
    OperationLog[] value();

}
