package cn.sx.hu.wall.e.util.async.core;

import cn.sx.hu.wall.e.util.async.specs.IAsyncConfig;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 异步线程工厂
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public final class AsyncThreadFactory implements ThreadFactory {

    private IAsyncConfig config;

    private AtomicInteger threadId;

    private static AsyncThreadFactory instance;

    private AsyncThreadFactory(IAsyncConfig config){
        this.config = config;
        this.threadId = new AtomicInteger(config.getThreadStartId());
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable,this.config.getThreadPrefix() + this.threadId.incrementAndGet());
        thread.setDaemon(false);
        return thread;
    }

    public static AsyncThreadFactory build(IAsyncConfig config) {
        if(null != instance) {
            return instance;
        }
        synchronized (AsyncThreadFactory.class) {
            instance = new AsyncThreadFactory(config);
        }
        return instance;
    }

}
