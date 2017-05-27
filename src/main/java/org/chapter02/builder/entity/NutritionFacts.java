package org.chapter02.builder.entity;

/**
 * Created by Admin on 2017/5/23.
 */
public class NutritionFacts implements Cloneable, Comparable<NutritionFacts> {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    @Override
    public int compareTo(NutritionFacts o) {
        return 0;
    }

    public static class Builder {
        //需要参数
        private final int servingSize;
        private final int servings;

        //可选参数，初始化默认值
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public static Builder newInstance(int servingSize, int servings) {
            return new Builder(servingSize, servings);
        }

        public Builder calories(int val) {
            this.calories = val;
            return this;
        }

        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public NutritionFacts builder() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NutritionFacts facts = (NutritionFacts) o;

        if (servingSize != facts.servingSize) return false;
        if (servings != facts.servings) return false;
        if (calories != facts.calories) return false;
        if (fat != facts.fat) return false;
        if (sodium != facts.sodium) return false;
        return carbohydrate == facts.carbohydrate;
    }

    @Override
    public int hashCode() {
        int result = servingSize + 17;
        result = 31 * result + servings;
        result = 31 * result + calories;
        result = 31 * result + fat;
        result = 31 * result + sodium;
        result = 31 * result + carbohydrate;
        return result;
    }

    //与final字段不想兼容
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
