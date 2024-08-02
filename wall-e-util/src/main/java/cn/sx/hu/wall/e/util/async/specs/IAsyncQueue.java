package cn.sx.hu.wall.e.util.async.specs;

import cn.sx.hu.wall.e.util.async.exception.AsyncException;

/**
 * 异步任务队列
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public interface IAsyncQueue {

    IAsyncQueue schedule(IAsyncTask task) throws AsyncException;

    IAsyncQueue register(IAsyncExecutor executor) throws AsyncException;

    IAsyncQueue register(IAsyncOverflowHandler handler) throws AsyncException;

    IAsyncStock getStock() throws AsyncException;

    IAsyncHandling getHandling() throws AsyncException;

    void listen() throws AsyncException;

    void shutdown();

}
