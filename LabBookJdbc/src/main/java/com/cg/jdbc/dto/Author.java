package com.cg.jdbc.dto;

import java.math.BigInteger;
//import java.util.List;

public class Author {
	
	private BigInteger authorId;
	private String authorFirstName;
	private String authorLastName;
	
	
	public Author() {
		
	}
	public Author(String authorFirstName, String authorLastName) {
		super();
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
	}
	public BigInteger getAuthorId() {
		return authorId;
	}
	public void setAuthorId(BigInteger authorId) {
		this.authorId = authorId;
	}
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	public String getAuthorLastName() {
		return authorLastName;
	}
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorFirstName=" + authorFirstName + ", authorLastName="
				+ authorLastName + "]";
	}
	
	
	
	

}
