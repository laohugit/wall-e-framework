package cn.sx.hu.wall.e.specs.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 对儿模型
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
@ApiModel("双值模型")
public class CoupleModel<L,R> implements Serializable {

    private static final long serialVersionUID = 3065636572933717434L;

    public CoupleModel(){}

    public CoupleModel(L left, R right){
        this.left = left;
        this.right = right;
    }

    @ApiModelProperty("左值")
    private L left;
    @ApiModelProperty("右值")
    private R right;

    public L getLeft() {
        return left;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public R getRight() {
        return right;
    }

    public void setRight(R right) {
        this.right = right;
    }

}
