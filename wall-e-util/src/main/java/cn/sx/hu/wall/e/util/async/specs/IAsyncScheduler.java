package cn.sx.hu.wall.e.util.async.specs;

import cn.sx.hu.wall.e.util.async.exception.AsyncException;

/**
 * 异步任务调度器
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public interface IAsyncScheduler {

    IAsyncQueue getClient(IAsyncTopic topic) throws AsyncException;

    IAsyncQueue getServer(IAsyncConfig config) throws AsyncException;

    IAsyncQueue getServer(IAsyncTopic topic) throws AsyncException;

}
