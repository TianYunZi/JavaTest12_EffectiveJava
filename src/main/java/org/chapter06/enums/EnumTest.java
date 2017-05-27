package org.chapter06.enums;

import org.junit.Test;

/**
 * Created by Admin on 2017/5/24.
 */
public class EnumTest {

    @Test
    public void test01() {
        Fruit fruit = Fruit.ORANGE;
        System.out.println(fruit.getColor() + "------" + fruit.getPrice());
        fruit = Fruit.valueOf(3);
        System.out.println(fruit.getColor() + "------" + fruit.getPrice());
        System.out.println(Fruit.values());
    }
}
