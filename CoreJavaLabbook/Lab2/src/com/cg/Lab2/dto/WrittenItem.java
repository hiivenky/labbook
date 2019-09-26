package com.cg.Lab2.dto;



public class WrittenItem extends Item {
	
	private String author;
	
	

	public WrittenItem(int iD, String title, int no_of_copies,String author) {
		
		super(iD, title, no_of_copies);
		// TODO Auto-generated constructor stub
		this.author=author;
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("author "+this.author+toString());
		
	}

	public void addItem(int id,String title,int no_of_copies,String author) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		setAuthor(author);
		addItem(id,title,no_of_copies);
		
	}

	@Override
	public void CheckIn() {
		// TODO Auto-generated method stub
		if(getNo_of_copies()>0) {
			System.out.println("CheckIn successful");
		}
		else {
			System.out.println("No more copies try after few days");
		}
	}

	@Override
	public void CheckOut() {
		// TODO Auto-generated method stub
		System.out.println("Checkout successfull");
		
	}

	public String getAuthor() {
		
		return author;
	}

	private void setAuthor(String author) {
		this.author = author;
	}
	
	

}
