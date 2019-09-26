package com.cg.Lab2.dto;

public class CD extends Media {
	
	private String artist;
	private String genre;
	public CD(String title, String author, int runtime,String artist,String genre) {
		super(title, author, runtime);
		this.artist=artist;
		this.genre=genre;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(this.toString()+super.toString());
		
	}
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + "]";
	}
	
	public void addItem(String title, String author, int runtime,String artist,String genre) {
		// TODO Auto-generated method stub
		super.addItem(title, author, runtime);
		this.artist=artist;
		this.genre=genre;
		try {
			Class.forName("com.cg.lab2.ui.Main");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
