package cn.sx.hu.wall.e.operation.log;

import cn.sx.hu.wall.e.specs.annotation.OperationLog;

/**
 * 操作日志测试
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class OperationLogTest {

    @OperationLog(sn = "${form.productId}",
            type = "productManage",
            subtype = "Edit",
            operator = "${sessionScope.loginInfo.userId}",
            success = "新增产品${form.productName}成功。",
            failure = "新增产品${form.productName}失败！",
            successCondition = "${response.code == 200}",
            ignoreCondition = "${form.productId == null}",
            extra = "${form.toString()}")
    public void testEditProduct() {

    }

}
