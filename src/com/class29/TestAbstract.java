package com.class29;

public abstract class TestAbstract {
	/*
	 * Create a class File that will have the following behaviors:
	 *  open, edit, close. Edit and close are implemented method while open is an abstract. 
	 *  Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour:
	 *   Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

	 */

	
	public void editMethod() {
		System.out.println("This method is with body, its completed method");
		
	}
	
	public void closeMethod() {
		System.out.println("This method is also completed callsed close method");
	}
	
	public abstract void openMethod();
	
	public abstract void notepad();
	
	
}

class JavaFile extends TestAbstract{

	@Override
	public void openMethod() {
		System.out.println("this open Method is defined here in child subclass ");
		
	}

	@Override
	public void notepad() {
		System.out.println("notepade can be utelize in microsoft");
		
	}
	
	
}

class WordFile extends TestAbstract{

	@Override
	public void openMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notepad() {
		// TODO Auto-generated method stub
		
	}
	
	
}

class PDFFIle extends TestAbstract{

	@Override
	public void openMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notepad() {
		// TODO Auto-generated method stub
		
	}
	
}

class Test{
	
	public static void main(String[] args) {
		
	TestAbstract test=new WordFile();
	
	test.closeMethod();
	
	test.editMethod();
	test.notepad();
		
	}
}
