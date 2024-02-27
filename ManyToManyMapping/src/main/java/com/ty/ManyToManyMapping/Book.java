package com.ty.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	@Id
	private int bId;
	private String bName;
	@ManyToMany
	private List<Student> list=new ArrayList<Student>();

	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + ", list=" + list + "]";
	}
}
