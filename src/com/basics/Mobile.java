package com.basics;

  class Remote {
	 int id;
	 String name ;
	 
	protected  void openNetflix()
	{
		System.out.println("Screen is displayed!");
	}

}

class Mobile extends Remote
{
	public void openHotstar()
	{
		System.out.println("Screen is displayed!");
	}
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.openHotstar();
		mobile.openNetflix();
	}
}