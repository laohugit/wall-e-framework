package cn.sx.hu.wall.e.util.async.specs;

/**
 * 异步任务
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public interface IAsyncTask<T> {

    String getId();

    T getData();

}
