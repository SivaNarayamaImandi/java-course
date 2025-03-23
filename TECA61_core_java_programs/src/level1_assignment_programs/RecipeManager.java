package level1_assignment_programs;

public class RecipeManager {

	public static void main(String[] args) {
		System.out.println("Main method");
		RecipeManager r = new RecipeManager();
		r.prepareRecipe();
	}
	public void addIngredient()
	{
		System.out.println("addIngredient method");
		removeIngredient();
     	//prepareRecipe();
		printRecipe();
	}
	public void removeIngredient()
	{
		System.out.println("removeIngredient method");
		calculateTotalCalories();
	}
	public void prepareRecipe()
	{
		System.out.println("prepareRecipe method");
		addIngredient();
	}
	public static void calculateTotalCalories()
	{
		System.out.println("calculateTotalCalories method");
	}
	public static void printRecipe()
	{
		System.out.println("printRecipe method");
	}
}