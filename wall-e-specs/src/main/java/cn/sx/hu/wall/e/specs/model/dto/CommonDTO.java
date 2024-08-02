package cn.sx.hu.wall.e.specs.model.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Data Transfer Object 基类
 * 1.基础DTO,支持序列化和基本字段定义
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class CommonDTO implements Serializable {

	private static final long serialVersionUID = -3889017141661223253L;

	// 主键
	protected Long id;
	// 租户编码
	protected Long tenantId;
	// 创建者
	protected String createdBy;
	// 创建时间
	protected Date createdAt;
	// 更新者
	protected String updatedBy;
	// 更新时间
	protected Date updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
