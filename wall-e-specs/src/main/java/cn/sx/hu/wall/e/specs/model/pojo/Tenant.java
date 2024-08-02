package cn.sx.hu.wall.e.specs.model.pojo;

/**
 * 租户
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class Tenant {

    // 编码
    private Long id;
    // 名称
    private String name;

    public Tenant() {
    }

    public Tenant(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
