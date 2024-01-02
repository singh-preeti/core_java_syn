package com.basics;
@FunctionalInterface
interface Interfacedemo1{
	 void displayPrime();	
}
@FunctionalInterface
//SAM -> Single abstract method
interface InterfaceDemo
{
    void displayNetflix();	
   
    default void displayAllNewsChannels()
    {
    	System.out.println("view the list of news channels..");
    }
    default void displayAllMusicChannels()
    {
    	System.out.println("view the list of music channels..");
    }
    static void displayHomePage()
    {
    	System.out.println("Samsung Tv!");
    }
   
}
abstract class AbstractDemo
{
	abstract public void showChannels();
	
  public void display() {
	  System.out.println("Display TV channels..");
  }	
}
 class AbstractExample  extends AbstractDemo implements InterfaceDemo,Interfacedemo1{

	@Override
	public void showChannels() {
		System.out.println("List of tv channels..");
	}

	@Override
	public void displayNetflix() {
		System.out.println("List of netflix users..!");
		
	}

	@Override
	public void displayPrime() {
		System.out.println("Home page..!");
		
	}
	

}
class Main
{
   public static void main(String[] args) {
	   AbstractExample abs = new AbstractExample();
	   abs.display();
	   abs.showChannels();
	   abs.displayAllMusicChannels();
	   abs.displayNetflix();
}	
}