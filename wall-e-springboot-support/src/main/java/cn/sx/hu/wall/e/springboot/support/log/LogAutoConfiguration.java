package cn.sx.hu.wall.e.springboot.support.log;

import cn.sx.hu.wall.e.specs.constant.GlobalConstant;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import cn.sx.hu.wall.e.springframework.support.log.LogConfig;
import cn.sx.hu.wall.e.springframework.support.log.LogProcessor;

/**
 * 日志自动配置
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
@ConditionalOnClass(ProceedingJoinPoint.class)
@EnableConfigurationProperties(LogProperties.class)
public class LogAutoConfiguration {

    private final Logger logger = LoggerFactory.getLogger(LogAutoConfiguration.class);

    @Bean(LogProcessor.BEAN_ID)
    @ConditionalOnProperty(prefix = GlobalConstant.FRAMEWORK_KEY_PREFIX + ".log", name = "enabled", havingValue = "true")
    public LogProcessor processor(LogProperties logProperties) {
        if(logger.isDebugEnabled()) {
            logger.debug("{} LogProcessor Loading", GlobalConstant.FRAMEWORK_DISPLAY_NAME);
        }
        return new LogProcessor(logProperties);
    }

}
