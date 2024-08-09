package cn.sx.hu.wall.e.specs.annotation;

import java.lang.annotation.*;

/**
 * 操作日志
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
@Inherited
@Documented
@Repeatable(OperationLogs.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface OperationLog {

    /**
     * 操作序列号，用于业务绑定
     * @return 序列号
     */
    String sn() default "";

    /**
     * 操作类型
     * @return 类型
     */
    String type() default "";

    /**
     * 操作子类型
     * @return 子类型
     */
    String subtype() default "";

    /**
     * 操作成功时记录的日志内容，支持EL表达式
     * @return 成功日志
     */
    String success() default "";

    /**
     * 操作成功判定条件，使用EL表达式配置。默认无异常则视为操作成功。
     * @return true/false 成功/失败
     */
    String successCondition() default "";

    /**
     * 操作失败时记录的日志内容，支持EL表达式
     * @return 失败日志
     */
    String failure() default "";

    /**
     * 操作人唯一标识信息
     * @return 操作人
     */
    String operator() default "";

    /**
     * 自定义拓展信息
     * @return 拓展信息
     */
    String extra() default "";

    /**
     * 是否忽略操作记录判定条件，使用EL表达式配置。默认不忽略。
     * @return true/false 忽略/正常记录
     */
    String ignoreCondition() default "";

}
