/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.jk.model.yb;

import java.io.Serializable;

/**
 * Entity - 品牌
 * 
 * @author SHOP++ Team
 * @version 3.0
 */

public class Brand implements Serializable{


	private Integer id;

	/** 名称 */
	private String name;

	/** 类型 */
	private String type;

	/** logo */
	private String logo;

	/** 网址 */
	private String url;

	/** 介绍 */
	private String introduction;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
}