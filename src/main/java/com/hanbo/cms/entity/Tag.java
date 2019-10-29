package com.hanbo.cms.entity;

import java.io.Serializable;

/**
 *  文章的标签
 * @author zhuzg
 *
 */
public class Tag implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5879066127875281505L;
	
	Integer id;
	String display_name;
	public Tag(Integer id, String display_name) {
		super();
		this.id = id;
		this.display_name = display_name;
	}
	
	
	public Tag(String display_name) {
		super();
		this.display_name = display_name;
	}


	public Tag() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((display_name == null) ? 0 : display_name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Tag other = (Tag) obj;
		if (display_name == null) {
			if (other.display_name != null)
				return false;
		} else if (!display_name.equals(other.display_name))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tag [id=" + id + ", display_name=" + display_name + "]";
	}
	
	
	
	

	

}
