package com.oops;

public class Pizza {

	private int price;
	
	private Boolean veg;
	
	private int extraCheeseprice=100;
	
	private int extraToppingprice=150;
	
	private int bagpackprice=20;
	
	private int basepizzaprice;
	
	
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToopingAdded=false;
	private boolean isoptedForTakeAway=false;

	public  Pizza(Boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=300;
		}else {
			this.price=400;
		}
		basepizzaprice=this.price;
	}
	public void addExtraCheese() {
		isExtraCheeseAdded=true;
		//System.out.println("Extra cheese added");
		this.price += extraCheeseprice;
		
		
	}
	public void addExtraToopings() {
		isExtraToopingAdded=true;
		//System.out.println("Extra toppings added");
		this.price += extraToppingprice;

		
		
	}
	public void takeAway() {
		isoptedForTakeAway=true;
		//System.out.println("Take away opted");
		this.price += bagpackprice;
		
	}
	public void getBill1() {
		String bill=" ";
		System.out.println("pizza: "+basepizzaprice);
		if(isExtraCheeseAdded) {
			bill += "Extra Cheese Added: "+extraCheeseprice+ "\n";
		}
		
		if(isExtraToopingAdded) {
			bill += "Extra Tooping Added: "+extraToppingprice+ "\n";
		}
		
		if(isoptedForTakeAway) {
			bill += "Take Away: "+bagpackprice+ "\n";
		}

		bill += "Bill: "+this.price +"\n ";
		System.out.println(bill);
	}
	
}
/**base pizza:300
 * Topping:150
 * cheese : 100
 * Take Away: 20
 */ 
 


