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
public abstract class IceCreamStore {

    public IceCream orderIceCream () {
        IceCream icecream;
        
        icecream = createIceCream();
        
        icecream.prepare();
        icecream.freeze();
        icecream.cut();
        icecream.box();
        
        return icecream;
    }
    protected abstract IceCream createIceCream ();
}
