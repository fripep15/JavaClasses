package com.class25;

public class TaskAreaCalulations {
	

public	void area(int l, int w) {
		System.out.println(l*w);
		
	}
	
	public void area(double l, int w) {
		
		System.out.println(l*w);
		
	}
	
	public void area(int l, int w, int h) {
		System.out.println(l*w*h);
		
	}
	public static void main(String[] args) {

		TaskAreaCalulations task=new TaskAreaCalulations();
		
		task.area(3, 5);
	task.area(3, 4, 6);
	task.area(5, 6);

	//TaskAreaCalulations(int width,int length){
	//	System.out.println(width*length);
	}

}
