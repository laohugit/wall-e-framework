package cn.sx.hu.wall.e.springboot.support.log;

import cn.sx.hu.wall.e.specs.constant.GlobalConstant;
import org.springframework.boot.context.properties.ConfigurationProperties;
import cn.sx.hu.wall.e.springframework.support.log.LogConfig;

/**
 * 日志配置信息
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
@ConfigurationProperties(prefix = GlobalConstant.FRAMEWORK_KEY_PREFIX + ".log")
public class LogProperties extends LogConfig {

}
