package day_51_2608;

// https://leetcode.com/problems/design-a-food-rating-system/description/

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class FoodRatings {
    public static void main(String[] args) {
        String[] foods = new String[]{"emgqdbo", "jmvfxjohq", "qnvseohnoe", "yhptazyko", "ocqmvmwjq"};
        String[] cuisines = new String[]{"snaxol", "snaxol", "snaxol", "fajbervsj", "fajbervsj"};
        int[] ratings = new int[]{2, 6, 18, 6, 5};
        FoodRatings foodRatings = new FoodRatings(foods, cuisines, ratings);
        foodRatings.changeRating("qnvseohnoe", 11);
        System.out.println(foodRatings.highestRated("fajbervsj"));
        foodRatings.changeRating("emgqdbo",3);
        foodRatings.changeRating("jmvfxjohq",9);
        foodRatings.changeRating("emgqdbo",14);
        System.out.println(foodRatings.highestRated("fajbervsj"));
        System.out.println(foodRatings.highestRated("snaxol"));
    }

    private Map<String, Food> foodMap;
    private Map<String, TreeSet<Food>> cuisineMap;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodMap = new HashMap<>();
        cuisineMap = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            Food food = new Food(foods[i], cuisines[i], ratings[i]);
            foodMap.put(foods[i], food);

            cuisineMap.putIfAbsent(cuisines[i], new TreeSet<>());
            cuisineMap.get(cuisines[i]).add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        Food oldFood = foodMap.get(food);
        cuisineMap.get(oldFood.cuisine).remove(oldFood);

        oldFood.rating = newRating;
        cuisineMap.get(oldFood.cuisine).add(oldFood);
    }

    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).first().name;
    }

    static class Food implements Comparable<Food> {
        String name;
        String cuisine;
        int rating;

        public Food(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }

        @Override
        public int compareTo(Food other) {
            if (this.rating != other.rating) {
                return Integer.compare(other.rating, this.rating);
            } else {
                return this.name.compareTo(other.name);
            }
        }
    }
}
