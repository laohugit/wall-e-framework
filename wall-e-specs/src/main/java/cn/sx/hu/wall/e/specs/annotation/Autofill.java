package cn.sx.hu.wall.e.specs.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自动填值标签
 * 1.被标注的对象属性自动填充值
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface Autofill {

}
