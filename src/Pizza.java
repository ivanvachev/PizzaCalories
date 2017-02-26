
public class Pizza {

    private String pizzaName;
    private int numberOfToppings;
    private Double totalCalories;

    public Pizza() {
        this.totalCalories = 0d;
        this.numberOfToppings = 0;
    }

    public Pizza(String pizzaName, int numberOfToppings) {
       this.setPizzaName(pizzaName);
       this.setNumberOfToppings(numberOfToppings);
       this.totalCalories = 0d;
    }

    private void setPizzaName(String pizzaName) {
        if (pizzaName.length() < 1 || pizzaName.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        else {
            this.pizzaName = pizzaName;
        }
    }

    private void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        else {
            this.numberOfToppings = numberOfToppings;
        }
    }

    public void addTotalCalories(Double totalCalories) {
        Double reminder = this.getTotalCalories();
        this.totalCalories = reminder + totalCalories;
    }

    public String getPizzaName() {
        return this.pizzaName;
    }

    public int getNumberOfToppings() {
        return this.numberOfToppings;
    }

    public Double getTotalCalories() {
        return this.totalCalories;
    }
}
