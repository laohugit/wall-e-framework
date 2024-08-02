package cn.sx.hu.wall.e.util.async.specs;

/**
 * 异步处理配置类
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public interface IAsyncConfig {

    IAsyncTopic getTopic();

    default int getTaskCapacity() {
        return 200;
    }

    default int getExecutorCapacity() {
        return 1;
    }

    default int getConcurrent() {
        return 2;
    }

    default String getThreadPrefix(){
        return "async-scheduler-exec-";
    }

    default int getThreadStartId(){
        return 0;
    }

}
