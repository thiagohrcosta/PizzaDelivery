package products;

public class pizzaProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pizzaType calabresa = new pizzaType();
		calabresa.pizzaName = "Calabrian Pizza";
		calabresa.pizzaAlias = "Calabrian";
		calabresa.pizzaPrice = 20.00;
		
		pizzaType HamPizza = new pizzaType();
		HamPizza.pizzaName = "Ham Pizza";
		HamPizza.pizzaAlias = "Ham";
		HamPizza.pizzaPrice = 18.00;
		
		pizzaType Bologne = new pizzaType();
		Bologne.pizzaName = "Bologne Pizza";
		Bologne.pizzaAlias = "Bologne";
		Bologne.pizzaPrice = 25.00;
		
		pizzaType Chicken = new pizzaType();
		Chicken.pizzaName = "Chicken Pizza";
		Chicken.pizzaAlias = "Chicken";
		Chicken.pizzaPrice = 21.00;
		
		extraItens oregano = new extraItens();
		oregano.extraIngredientsName = "Oregano";
		oregano.extraPriceIngredients = 2.00;
		
		extraItens bacon = new extraItens();
		bacon.extraIngredientsName = "Bacon";
		bacon.extraPriceIngredients = 5.00;
		
		extraItens corn = new extraItens();
		corn.extraIngredientsName = "Corn";
		corn.extraPriceIngredients = 3.00;
		
		
	}
	


}
