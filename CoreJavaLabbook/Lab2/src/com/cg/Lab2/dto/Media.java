package com.cg.Lab2.dto;

public abstract class Media {
	
	private String title;
	private String author;
	private int runtime;
	
	public Media(String title, String author, int runtime) {
		super();
		this.title = title;
		this.author = author;
		this.runtime = runtime;
	}
	
	public abstract void print();

	@Override
	public String toString() {
		return "Media [title=" + title + ", author=" + author + ", runtime=" + runtime + "]";
	}

	public String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	private void setAuthor(String author) {
		this.author = author;
	}

	public int getRuntime() {
		return runtime;
	}

	private void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	public void addItem(String title,String author,int runtime) {
		setAuthor(author);
		setRuntime(runtime);
		setTitle(title);
	}
	
	
	
}
