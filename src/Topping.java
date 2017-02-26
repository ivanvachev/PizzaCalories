
public class Topping {

    private String toppingType;
    private Double toppingCal;
    private  Double weighting;

    public Topping(String toppingType,Double weighting) {
        this.setToppingType(toppingType);
        this.setWeighting(toppingType, weighting);
        this.settoppingCal(this.toppingType, this.weighting);
    }

    private void setToppingType (String toppingType) {
        if (toppingType.toLowerCase().equals("meat") || toppingType.toLowerCase().equals("veggies")
                || toppingType.toLowerCase().equals("cheese") || toppingType.toLowerCase().equals("sauce") ) {
            this.toppingType = toppingType.toLowerCase();
        }
        else {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeighting(String toppingType, Double weighting) {
        if (weighting < 1 || weighting > 50) {
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
        else {
            this.weighting = weighting;
        }
    }

    private void settoppingCal (String toppingType, Double weighting)  {
        switch (toppingType.toLowerCase()) {
            case "meat" :
                Double meat = 1.2;
                this.toppingCal = 2.0 * weighting * meat;
                break;
            case "veggies" :
                Double veggies = 0.8;
                this.toppingCal = 2.0 * weighting * veggies;
                break;
            case "cheese" :
                Double cheese = 1.1;
                this.toppingCal = 2.0 * weighting * cheese;
                break;
            case "sauce" :
                Double sauce = 0.9;
                this.toppingCal = 2.0 * weighting * sauce;
                break;
        }
    }

    public Double getToppingCal() {
        return this.toppingCal;
    }
}
