package com.niit;

public class Inherit {

    void run(){
    	System.out.println("Inherit Run");
}
}

class Inherit2 extends Inherit{
	
	void run(){
	super.run();
	}
	
	void jump()
	{
		System.out.println("Jump Method");
	}
}

class OrgInheritance{
	public static void main(String arg[])
	{
	  Inherit i = new Inherit();
	  Inherit j = new Inherit2();
	  
	  i.run();
	  j.run();
	  
	  
	  
	}
}
