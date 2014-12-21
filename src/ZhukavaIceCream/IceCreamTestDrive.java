/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZhukavaIceCream;

/**
 *
 * @author Дашуля
 */
public class IceCreamTestDrive {

    public static void main(String[] args) {
        OrderNumber rusnumber = new OrderNumber();
        OrderNumber bynumber = new OrderNumber();
        System.out.println("Поступил заказ на "+rusnumber.rand+" штук в России");
        System.out.println("Поступил заказ на "+bynumber.rand+" штук в Беларуси");
        IceCreamStore rusStore = RUSIceCreamStore.getInstance();
        IceCreamStore byStore = BYIceCreamStore.getInstance();
        
        
        
        IceCream icecream = rusStore.orderIceCream();
        System.out.println("Произвели " + rusnumber.rand + " наименований " + icecream.getName()+"\n");
        
        icecream = byStore.orderIceCream();
        System.out.println("Произвели "+bynumber.rand + " наименований " + icecream.getName()+"\n");
        
    }

}