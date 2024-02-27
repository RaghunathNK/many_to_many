package com.ty.ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int sId;
	private String sName;
	private long sPhone;
	@ManyToMany(mappedBy = "list")
	private List<Book> listofBooks=new ArrayList<Book>();

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public long getsPhone() {
		return sPhone;
	}

	public void setsPhone(long sPhone) {
		this.sPhone = sPhone;
	}

	public List<Book> getListofBooks() {
		return listofBooks;
	}

	public void setListofBooks(List<Book> listofBooks) {
		this.listofBooks = listofBooks;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sPhone=" + sPhone + ", listofBooks=" + listofBooks + "]";
	}
	
}
