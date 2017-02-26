import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        Pizza pizza = new Pizza();
        String pizzaName = "";
        int toppingCounts = 0;


        try {
       while ( !"END".equals(input = br.readLine())) {
           String[] inputDough = input.split("\\s+");
           if (inputDough[0].toLowerCase().equals("pizza")) {
               pizzaName = inputDough[1];
               toppingCounts = Integer.valueOf(inputDough[2]);
               pizza = new Pizza(pizzaName, toppingCounts);
           }


           if (inputDough[0].toLowerCase().equals("dough")) {

                   String doughType = inputDough[1];
                   String bakingType = inputDough[2];
                   Double weighting = Double.parseDouble(inputDough[3]);
                   Dough dough = new Dough(doughType, bakingType, weighting);
                   pizza.addTotalCalories(dough.getDoughCal());
                    if (pizza.getPizzaName() == null) {
                        System.out.printf("%.2f\n",dough.getDoughCal());
                    }
               }

           else if (inputDough[0].toLowerCase().equals("topping")) {

                   String toppingType = inputDough[1];
                   Double weighting = Double.parseDouble(inputDough[2]);
                   Topping topping = new Topping(toppingType, weighting);
                   pizza.addTotalCalories(topping.getToppingCal());
               if (pizza.getPizzaName() == null) {
                   System.out.printf("%.2f\n",topping.getToppingCal());
               }

             }
       }

       if (pizza.getTotalCalories() > 0 && !(pizza.getPizzaName() == null)){
            System.out.printf("%1$s - %2$.2f", pizza.getPizzaName(), pizza.getTotalCalories());
        }

        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

      br.close();
    }
}
