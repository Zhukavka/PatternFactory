package ZhukavaIceCream;

import java.util.*;
//import java.math.*;

public abstract class IceCream {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }
    public void prepare() {
        System.out.println("Взбиваем " + name);
        System.out.println("Добавляем: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
        System.out.println("Выкладываем вафли...");
    }
    public void freeze() {
        System.out.println("Замораживем мороженое 40 мин при -4*С");
    }
    public void cut() {
        System.out.println("Нарезаем мороженое на прямоугольные брикетики");
    }
    public void box() {
        System.out.println("Упопаковываем мороженое в фирменную упаковку");
    }
}