package cn.sx.hu.wall.e.util.shell;

import cn.sx.hu.wall.e.util.os.SystemUtil;
import cn.sx.hu.wall.e.util.shell.exception.ShellException;
import org.junit.Test;
import cn.sx.hu.wall.e.util.shell.model.ShellCommand;

/**
 * Shell控制台(执行器)测试
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class ShellConsoleTest {

    @Test
    public void test() throws ShellException {
        if(SystemUtil.isLinux()) {
            ShellConsole.getInstance().exec(new ShellCommand("ps -ef"));
        }
    }

}
