
public class Dough {

    private String doughType;
    private String bakingType;
    private Double doughCal;
    private  Double weighting;

      public Dough (String doughType, String bakingType, Double weighting)  {
        this.setDoughType(doughType);
        this.setBakingType(bakingType);
        this.setWeighting(weighting);
        this.setDoughCal(this.doughType, this.bakingType, this.weighting);
    }

    private void setDoughType(String doughType) {
        if (doughType.toLowerCase().equals("white") || doughType.toLowerCase().equals("wholegrain")) {
            this.doughType = doughType.toLowerCase();
        }
        else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingType(String bakingType) {
        if (bakingType.toLowerCase().equals("crispy") || bakingType.toLowerCase().equals("chewy")
                || bakingType.toLowerCase().equals("homemade")) {
            this.bakingType = bakingType.toLowerCase();
        }
        else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeighting(Double weighting) {
        if (weighting < 1 || weighting > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        else {
            this.weighting = weighting;
        }
    }

    private void setDoughCal (String doughType, String bakingType, Double weighting)  {
          switch (doughType.toLowerCase()) {
              case "white" :
                  Double whiteCal = 1.5;
                  this.doughCal = 2.0 * weighting * whiteCal;
                   break;
              case "wholegrain" :
                  Double wholegrainCal = 1.0;
                  this.doughCal = 2.0 * weighting * wholegrainCal;
                  break;
          }

          switch (bakingType.toLowerCase()) {
              case "crispy" :
                  Double crispybakingType = 0.9;
                  this.doughCal = this.doughCal * crispybakingType;
                  break;
              case "chewy" :
                  Double chewybakingType = 1.1;
                  this.doughCal = this.doughCal * chewybakingType;
                  break;
              case "homemade" :
                  Double homemadebakingType = 1.0;
                  this.doughCal = this.doughCal * homemadebakingType;
                  break;
          }
    }

    public Double getDoughCal() {
        return this.doughCal;
    }
}
