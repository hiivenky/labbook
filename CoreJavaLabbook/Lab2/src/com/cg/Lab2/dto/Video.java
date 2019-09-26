package com.cg.Lab2.dto;

public class Video extends Media{
	
	private String director;
	private String genre;
	private String year_released;
	public Video(String title, String author, int runtime,String director,String genre,String year_released) {
		super(title, author, runtime);
		this.director=director;
		this.genre=genre;
		this.year_released=year_released;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.toString()+super.toString());
		
	}
	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", year_released=" + year_released + "]";
	}
	public void addItem(String title,String author,int runtime,String year_released) {
		super.addItem(title,author,runtime);
		this.year_released=year_released;
	}
	

}
