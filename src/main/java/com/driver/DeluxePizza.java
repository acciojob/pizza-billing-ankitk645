package com.driver;

public class DeluxePizza extends Pizza {

    int deluxPrice = 0;
    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        if(!isVeg){
            this.deluxPrice += 400;
        }
        //for extra cheese and toppings
        addExtraCheese();
        addExtraToppings();
    }
}
