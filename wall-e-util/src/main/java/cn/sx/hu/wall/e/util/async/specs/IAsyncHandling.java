package cn.sx.hu.wall.e.util.async.specs;

import java.util.List;

/**
 * 异步任务处理中信息
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public interface IAsyncHandling {

    int getTotal();
    List<IAsyncTask> getList();

}
