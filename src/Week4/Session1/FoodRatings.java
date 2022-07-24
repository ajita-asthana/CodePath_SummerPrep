package Week4.Session1;
import java.io.*;
import java.util.*;
public class FoodRatings {
        static String[] foods;
        static String[] cuisines;
        static int[] ratings;

        public FoodRatings(String[] foods, String[] cuisines, int[] ratings)
        {
                this.foods = foods;
                this.cuisines = cuisines;
                this.ratings = ratings;
        }

        public static void changeRatings(String food, int newRating)
        {
                for(int i=0; i<foods.length; i++)
                {
                        if(food.equals(foods[i]))
                                ratings[i] = newRating;
                }
        }

        public static String highestRated(String cuisine)
        {
                Map<Integer, List<String>> foodRatingMap = new HashMap<>();
                for(int i=0; i<cuisines.length; i++)
                {
                        if(cuisine.equals(cuisines[i]))
                        {
                                List<String> foodLst = new ArrayList<>();
                                if(!foodRatingMap.containsKey(ratings[i]))
                                {
                                        foodLst.add(foods[i]);
                                        foodRatingMap.put(ratings[i], foodLst);
                                }
                                else
                                {
                                        foodLst = foodRatingMap.get(ratings[i]);
                                        foodLst.add(foods[i]);
                                        foodRatingMap.put(ratings[i], foodLst);
                                }
                        }

                }
                for(int x : foodRatingMap.keySet()){
                        System.out.print("Rating "+x+" for foods: ");
                        for(String s : foodRatingMap.get(x))
                                System.out.print(s+" ");
                        System.out.println();
                }
                int highestRatingCuisine = foodRatingMap.keySet().stream().max((x, y) -> x-y).get();
                Collections.sort(foodRatingMap.get(highestRatingCuisine));
                return foodRatingMap.get(highestRatingCuisine).get(0);

//                System.out.println("The highest rated foods of the "+ cuisine+" are:");
//                Optional<Integer> highestRating = foodRatingMap.keySet()
//                        .stream()
//                        .findFirst();
        }

        public static void main(String [] args)throws Exception{
                BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
                FoodRatings foodRatings = new FoodRatings(
                        new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"},
                        new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"},
                        new int[]{9, 12, 8, 15, 14, 7}
                );
                Arrays.stream(foodRatings.foods).forEach(i -> {
                        System.out.print(i+" ");
                });
                System.out.println();
                Arrays.stream(foodRatings.ratings).forEach(i ->
                {
                        System.out.print(i+" ");
                });
                System.out.println();
                Arrays.stream(foodRatings.cuisines).forEach(i->
                {
                        System.out.print(i+" ");
                });
                System.out.println();
                foodRatings.changeRatings("sushi", 16);
                for(int i=0; i<foodRatings.foods.length; i++)
                {
                        if("sushi".equals(foodRatings.foods[i]))
                                System.out.println("Sushi has a new Rating of "+foodRatings.ratings[i]);
                }
                foodRatings.changeRatings("ramen", 16);
                System.out.println(foodRatings.highestRated("japanese"));
        }
}
