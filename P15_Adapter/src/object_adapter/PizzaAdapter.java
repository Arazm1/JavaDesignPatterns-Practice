package P15_Adapter.src.object_adapter;

public class PizzaAdapter implements PizzaCalculator {
    private P15_Adapter.src.calculator.PizzaCalculator calculator;

    public PizzaAdapter(P15_Adapter.src.calculator.PizzaCalculator calculator){
        this.calculator = calculator;
    }

    @Override
    public double calculatePricePerSquareMeter(double firstSideLengthInCm, double secondSideLengthInCm, double priceInEuros) {
        double radiusEquivalent = Math.sqrt(firstSideLengthInCm * secondSideLengthInCm / Math.PI);
        double diameterEquivalent = 2 * radiusEquivalent;
        return calculator.calculatePricePerSquareMeter(diameterEquivalent, priceInEuros);
    }

    @Override
    public double calculatePricePerSquareMeter(double diameterInCm, double priceInEuro){
        return calculator.calculatePricePerSquareMeter(diameterInCm, priceInEuro);
    }
    
}
