package cn.sx.hu.wall.e.util.shell.specs;

import cn.sx.hu.wall.e.util.shell.exception.ShellException;
import cn.sx.hu.wall.e.util.shell.model.ShellCommand;
import cn.sx.hu.wall.e.util.shell.model.ShellResult;

/**
 * Shell控制台(执行器)
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public interface IShellConsole {

    ShellResult exec(ShellCommand cmd) throws ShellException;

}
