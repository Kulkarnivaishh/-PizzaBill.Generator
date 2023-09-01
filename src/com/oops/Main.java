package com.oops;

public class Main {

public static void main(String[] args) {
	
	boolean veg;
	Pizza basepizza=new Pizza(false);
	//basepizza.addExtraToopings();
	//basepizza.addExtraCheese();
	//basepizza.takeAway();
	//basepizza.getBill1();
	
	DeluxPizza dp=new DeluxPizza(false);
	//dp.addExtraCheese();
	//dp.addExtraToopings();
	dp.takeAway();
	dp.getBill1();
	}

}
