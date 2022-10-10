package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isThisTakeaway = false;
    private boolean isToppingsAdded = false;
    private boolean isCheeseAdded = false;
    private boolean isBillGenerated = false;
    private int extraCheese = 0;
    private int extraToppings = 0;
    private int takeaway = 0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(!this.isVeg)
            this.price = 400;
        else
            this.price = 300;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.isCheeseAdded){
            this.extraCheese += 80;
            this.price += this.extraCheese;
            this.isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!this.isToppingsAdded){
            if(isVeg)
                this.extraToppings += 70;
            else
                this.extraToppings += 120;

            this.price += this.extraToppings;
            this.isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!this.isThisTakeaway){
            this.takeaway += 20;
            this.price += this.takeaway;
            this.isThisTakeaway = true;

        }

    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){
            if(isCheeseAdded)
                this.bill += "Extra Cheese Added: "+this.extraCheese+"\n";

            if(isToppingsAdded)
                this.bill += "Extra Toppings Added: "+this.extraToppings+"\n";

            if(isThisTakeaway)
                this.bill += "Paperbag Added: "+this.takeaway+"\n";

            this.bill +=  "Total Price: "+this.price+"\n";
            return this.bill;
        }
        return "";
    }
}
