package cn.sx.hu.wall.e.springboot.support.application;

import cn.sx.hu.wall.e.specs.constant.GlobalConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import cn.sx.hu.wall.e.springboot.support.util.SpringApplicationUtil;

/**
 * 应用工具类自动配置
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class SpringApplicationUtilAutoConfiguration implements ApplicationContextAware {

    private static final Logger logger = LoggerFactory.getLogger(SpringApplicationUtilAutoConfiguration.class);

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if(logger.isDebugEnabled()) {
            logger.debug("{} setApplicationContext:{}", GlobalConstant.FRAMEWORK_DISPLAY_NAME, applicationContext);
        }
        SpringApplicationUtil.setApplicationContext(applicationContext);
    }

}
