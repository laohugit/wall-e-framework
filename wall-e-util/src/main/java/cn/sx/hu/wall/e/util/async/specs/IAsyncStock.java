package cn.sx.hu.wall.e.util.async.specs;

import java.util.List;

/**
 * 异步任务池
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public interface IAsyncStock {

    int getTotal();
    List<IAsyncTask> getList();

}
