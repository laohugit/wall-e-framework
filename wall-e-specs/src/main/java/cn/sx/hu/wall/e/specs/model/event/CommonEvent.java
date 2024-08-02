package cn.sx.hu.wall.e.specs.model.event;

import cn.sx.hu.wall.e.specs.model.CoupleModel;

import java.util.List;

/**
 * 通用事件
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class CommonEvent<T> {

    // 事件源
    protected Object source;

    // 变更前后数据, 左值表示变更前数据, 右值表示变更后数据
    protected List<CoupleModel<T,T>> data;

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public List<CoupleModel<T, T>> getData() {
        return data;
    }

    public void setData(List<CoupleModel<T, T>> data) {
        this.data = data;
    }

}
