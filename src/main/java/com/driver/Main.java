package com.driver;

public class Main {
  public static void main(String[] args) {

    DeluxePizza p = new DeluxePizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addExtraToppings();
    p.addExtraCheese();
    p.getBill();
    p.getBill();
    System.out.println(p.getBill());

//    DeluxePizza dp = new DeluxePizza(true);
//    System.out.println(dp.getPrice());
//    dp.addTakeaway();
//    System.out.println(dp.getBill());
//
//    Pizza p = new Pizza(false);
//    p.addExtraCheese();
//    p.addExtraToppings();
//    System.out.println(p.getBill());
  }
}