import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;
public class hotel2 {
    public List<List<String> HostelView(String[] names ){
        List<List<String>> result = new ArrayList<>();
        backtrack(result , new ArrayList<>() , names);
        return result;
    }
    public static void backtrack(List<List<String>> result  , List<String> templist , String names){
        if(templist.size() == names.length()){
            result.add(new ArrayList<>(templist));
            return ;
        }

        for(String s : names){
            if(!templist.contains(s)){
                templist.add(s);
                backtrack(result, templist, names);
                templist.remove(templist.size()-1);
            }
        }
    }
    public static int Average(int[] review){
        for(int r : review){
            if(r == 1){
                    if(review.length == 0){
                        return -1;
                    }
                    if(review.length < 2){
                        return (review[0]+review[1])/2;
                    }
                    int  maxAVG = 0;
                    if(review.length > 2){
                        int sum = 0;
                        for(int  i = 0 ; i<review.length ; i++){
                            sum += review[i];
                        maxAVG += sum;
                        }
                    }
                    return maxAVG/review.length;
                }
            }
            if(r==2){
                if(review.length == 0){
                            return -1;
                        }
                        if(review.length < 2){
                            return (review[0]+review[1])/2;
                        }
                        int  maxAVG = 0;
                        if(review.length > 2){
                            int sum = 0;
                            for(int  i = 0 ; i<review.length ; i++){
                                sum += review[i];
                            maxAVG += sum;
                            }
                        }
                        return maxAVG/review.length;

            }
            else{
                if(review.length == 0){
                            return -1;
                        }
                        if(review.length < 2){
                            return (review[0]+review[1])/2;
                        }
                        int  maxAVG = 0;
                        if(review.length > 2){
                            int sum = 0;
                            for(int  i = 0 ; i<review.length ; i++){
                                sum += review[i];
                            maxAVG += sum;
                            }
                        }
                        return maxAVG/review.length;
            }
        }
    }
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] names = new int[n];
        sc.nextLine();
        String[] days = {"Monda" , "tuesday" , "wednesday" , "thursday" , "friday" , "saturday" , "sunday"};
        String[] meals = {"moring" , "afternoon " , "night"};
        List<List<Integer> review = new ArrayList<>();

        for(int i = 0 ; i<names.length ; i++){
            //names[i] = sc.nextLine();
            System.out.println("\n studentReiviews " + (i+1) + "-----");;
            for(String day : days){
                for(String meal : meals){
                    System.out.println("Enter" + day +" "+ meal +"food review for student");;
                    review[i][day][meal] = sc.nextLine();
                }
            }
        }

    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class HostelFoodReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Days of the week
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] meals = {"Breakfast", "Lunch", "Dinner"};
        
        // ArrayList to store reviews: [Day][Meal][Reviews]
        ArrayList<ArrayList<ArrayList<String>>> weeklyReviews = new ArrayList<>();
        
        // Initialize weeklyReviews structure
        for (int day = 0; day < days.length; day++) {
            ArrayList<ArrayList<String>> dailyMeals = new ArrayList<>();
            for (int meal = 0; meal < meals.length; meal++) {
                dailyMeals.add(new ArrayList<>()); // Each meal starts empty
            }
            weeklyReviews.add(dailyMeals);
        }
        
        // Input reviews for each day and meal
        for (int day = 0; day < days.length; day++) {
            System.out.println("\n=== " + days[day] + " ===");
            for (int meal = 0; meal < meals.length; meal++) {
                System.out.println("Enter review for " + meals[meal] + ":");
                System.out.print("Rating (1-5): ");
                int rating = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Comments: ");
                String comment = scanner.nextLine();
                
                // Store as "Rating: X, Comment: Y"
                String review = "Rating: " + rating + ", Comment: " + comment;
                weeklyReviews.get(day).get(meal).add(review);
            }
        }
        
        // Display all reviews
        System.out.println("\n=== Weekly Food Reviews ===");
        for (int day = 0; day < days.length; day++) {
            System.out.println("\n** " + days[day] + " **");
            for (int meal = 0; meal < meals.length; meal++) {
                System.out.println(meals[meal] + ":");
                for (String review : weeklyReviews.get(day).get(meal)) {
                    System.out.println("  - " + review);
                }
            }
        }
        
        scanner.close();
    }
}
