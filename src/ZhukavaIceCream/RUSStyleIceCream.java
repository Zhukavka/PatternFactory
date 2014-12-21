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
public class RUSStyleIceCream extends IceCream {
    //private static RUSStyleIceCream uniqueInstance = new RUSStyleIceCream();

    public RUSStyleIceCream() {
        name = "Российское мороженое 'Белорусские узоры'";
        dough = "Толстые воздушные вафли";
        sauce = "Аромат Крем-брюле";

        toppings.add("Ароматный карамельный топинг");
    }
    
    //public static RUSStyleIceCream getInstance(){        
       // return uniqueInstance;
    //}
}