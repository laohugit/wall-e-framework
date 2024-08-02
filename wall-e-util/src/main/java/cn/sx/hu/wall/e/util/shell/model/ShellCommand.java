package cn.sx.hu.wall.e.util.shell.model;

/**
 * Shell指令
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class ShellCommand {

    private String line;

    public ShellCommand(){}

    public ShellCommand(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

}
