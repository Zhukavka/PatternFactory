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
public class BYIceCreamStore extends IceCreamStore{
    private static BYIceCreamStore uniqueInstance;
    
     public static BYIceCreamStore getInstance(){  
        if (uniqueInstance == null)
            uniqueInstance = new BYIceCreamStore();
        return uniqueInstance;
    }
    
    @Override
    public IceCream createIceCream() {
        return new BYStyleIceCream();
    }
}