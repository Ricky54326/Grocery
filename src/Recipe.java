/**
 * Created by riccardo on 1/19/15.
 */
public class Recipe {
    private String[] ingredients;
    private String name;
    private double cost;

    public Recipe(){
        this.name = null;
        this.cost = 0.0;
        this.ingredients = null;
    }

    public Recipe(String name){
        this.name = name;
        this.cost = 0.0;
        this.ingredients = null;

    }

    public Recipe(String[] ingredients, String name, double cost){
        this.ingredients = ingredients;
        this.name = name;
        this.cost = cost;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String[] getIngredients(){
        return this.ingredients;
    }

    public void setIngredients(String[] ingredients){
        this.ingredients = ingredients;
    }

    public double getCost(){
        return this.cost;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

}
