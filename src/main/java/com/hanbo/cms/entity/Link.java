package com.hanbo.cms.entity;

import java.io.Serializable;

public class Link implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7584238959194572712L;
	
	private Integer id;
	private String http;
	private String name;
	
	public Link() {
		super();
	}

	public Link(Integer id, String http, String name) {
		super();
		this.id = id;
		this.http = http;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHttp() {
		return http;
	}

	public void setHttp(String http) {
		this.http = http;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Link [id=" + id + ", http=" + http + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((http == null) ? 0 : http.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Link other = (Link) obj;
		if (http == null) {
			if (other.http != null)
				return false;
		} else if (!http.equals(other.http))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	


}
