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
public class RUSIceCreamStore extends IceCreamStore{
    private static RUSIceCreamStore uniqueInstance;
    
     public static RUSIceCreamStore getInstance(){  
        if (uniqueInstance == null)
            uniqueInstance = new RUSIceCreamStore();
        return uniqueInstance;
    }
    
    @Override
    public IceCream createIceCream() {
        return new RUSStyleIceCream();
    }
}