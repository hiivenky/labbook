package com.cg.Lab2.dto;

public class JournalPaper extends WrittenItem {
    private String year_published;
    
	public JournalPaper(int iD, String title, int no_of_copies, String author,String year_published) {
		
		super(iD, title, no_of_copies, author);
		this.year_published=year_published;
		// TODO Auto-generated constructor stub
	}

	public String getYear_published() {
		return year_published;
	}

	private void setYear_published(String year_published) {
		this.year_published = year_published;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}

	public void addItem(int id, String title, int no_of_copies, String author,String year_published) {
		// TODO Auto-generated method stub
		setYear_published(year_published);
		super.addItem(id, title, no_of_copies, author);
	}
	
	
	
    
	
	
	

}
