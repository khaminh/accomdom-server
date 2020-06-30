package com.unknown.bookadmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Accomdoms")
public class Accomdom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "accomdom_id", nullable = false, updatable = false)
	private Long id;

	private String title;
	private String content;
	private String address;
	private int area;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name ="type_id")
	private Type type;
	
	@ManyToOne
	@JoinColumn(name ="user_id")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
