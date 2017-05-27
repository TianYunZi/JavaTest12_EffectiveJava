package org.chapter02.builder.action;

import org.chapter02.builder.entity.NutritionFacts;

/**
 * Created by Admin on 2017/5/23.
 */
public class BuilderTest {

    public static void main(String[] args) {
        NutritionFacts facts = NutritionFacts.Builder.newInstance(2, 2).calories(3).fat(6).sodium(1).carbohydrate(9)
                .builder();
        System.out.println(facts);
    }
}
