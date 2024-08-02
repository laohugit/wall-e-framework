package cn.sx.hu.wall.e.specs.model.po;

import cn.sx.hu.wall.e.specs.model.ExportableModel;

/**
 * 可导出 Persistent Object
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class ExportablePO extends CommonPO implements ExportableModel {

    protected String path;

    @Override
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
