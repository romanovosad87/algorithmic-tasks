package day_51_2608;

import java.util.HashMap;
import java.util.Map;

public class FoodRatings {
    private Map<String, Food> foodsMap = new HashMap<>();
    private Map<String, HighestRatedFood> cuisineFood = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
           foodsMap.put(foods[i], new Food(foods[i], cuisines[i], ratings[i]));

            HighestRatedFood highestRatedFood = cuisineFood.get(cuisines[i]);
            if (highestRatedFood == null) {
                cuisineFood.put(cuisines[i], new HighestRatedFood(foods[i], ratings[i]));
            } else {
                compareRatings(foods[i], ratings[i], highestRatedFood);
            }
        }
    }

    public void changeRating(String food, int newRating) {
        var foodFromMap = foodsMap.get(food);
        foodFromMap.rate = newRating;
        var highestRatingFood = cuisineFood.get(foodFromMap.cuisines);
        compareRatings(food, newRating, highestRatingFood);
    }

    public String highestRated(String cuisine) {
        return cuisineFood.get(cuisine).food;
    }

    private void compareRatings(String food, int rating, HighestRatedFood highestRatedFood) {
        if (highestRatedFood.rate < rating) {
            highestRatedFood.food = food;
            highestRatedFood.rate = rating;
        } else if (highestRatedFood.rate == rating) {
            if (isSmaller(highestRatedFood.food, food)) {
                highestRatedFood.food = food;
            }
        }
    }

    private boolean isSmaller(String oldFoodName, String newFoodName) {
        int i = 0;
        int j = 0;
        while (i < oldFoodName.length() && j < newFoodName.length()) {
            if (newFoodName.charAt(j) > oldFoodName.charAt(i)) {
                return false;
            } else if (newFoodName.charAt(j) < oldFoodName.charAt(i)) {
                return true;
            }
            i++;
            j++;
        }
        return newFoodName.length() - j < oldFoodName.length() - i;
    }

    static class Food {
        String food;
        String cuisines;
        int rate;

        public Food(String food, String cuisines, int rate) {
            this.food = food;
            this.cuisines = cuisines;
            this.rate = rate;
        }
    }
    
    static class HighestRatedFood {
        String food;
        int rate;

        public HighestRatedFood(String food, int rate) {
            this.food = food;
            this.rate = rate;
        }
    }
}
