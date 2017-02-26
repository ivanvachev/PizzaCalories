import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

       while ( !"END".equals(input = br.readLine())) {
           try {
               String[] inputDough = input.split("\\s+");
               if (inputDough[0].toLowerCase().equals("dough")) {
                   String doughType = inputDough[1];
                   String bakingType = inputDough[2];
                   Double weighting = Double.parseDouble(inputDough[3]);
                   Dough dough = new Dough(doughType, bakingType, weighting);

                   System.out.printf("%.2f\n", dough.getDoughCal());
               }
           } catch (IllegalArgumentException e) {
               System.out.println(e.getMessage());
           }
       }

        br.close();
    }
}
