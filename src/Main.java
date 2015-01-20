/**
 * Created by riccardo on 1/19/15.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    static HashMap<String, Recipe> recipeList = new HashMap<String, Recipe>();

    public static void main(String[] args){
        System.out.println("Reading recipes from file...");
        parseRecipes();


        System.out.println("\nChecking that they were added successfully: \n");
        printRecipeList();


    }

    public static void printRecipeList(){
        System.out.println("Meals in DB:");

        for(Recipe r : recipeList.values()){
            System.out.println(r.getName());
        }
    }

    public static boolean parseRecipes(){
        Scanner in = null;
        String[] ingredients = null;
        String recipeName = null;
        String line = "";

        File recipes = new File("recipes.txt");

        try {
            in = new Scanner(recipes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(in.hasNextLine()){
            //TODO: Actually implement
            line = in.nextLine();
            recipeName = line.split("-")[0];
            ingredients = Arrays.copyOfRange(line.split("-"), 1, line.split("-").length);

            System.out.printf("Read; Recipe Name: %s, Ingredients: %s\n", recipeName, ingredients[0]);
            recipeList.put(recipeName, new Recipe(ingredients, recipeName,  0.0));
        }

        return true;
    }
}
