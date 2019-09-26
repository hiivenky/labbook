package com.cg.Lab2.dto;

import java.util.Scanner;

public abstract class Item {
	
	private int ID;
	private String title;
	private int no_of_copies;
	
	public Item(int iD, String title, int no_of_copies) {
		super();
		ID = iD;
		this.title = title;
		this.no_of_copies = no_of_copies;
	}

	public int getID() {
		return ID;
	}

	private void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	public int getNo_of_copies() {
		return no_of_copies;
	}

	private void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}

	@Override
	public String toString() {
		return "Item [ID=" + ID + ", title=" + title + ", no_of_copies=" + no_of_copies + "]";
	}
	
	public abstract void print();
	public void addItem(int id,String title,int no_of_copies) {
		setID(id);
		//System.out.println("Enter the Title");
		setTitle(title);
		//System.out.println("Enter the no of copies ");
		setNo_of_copies(no_of_copies);
		System.out.println("added successfully");
	}
	public abstract void CheckIn();
	public abstract void CheckOut();
	

}
