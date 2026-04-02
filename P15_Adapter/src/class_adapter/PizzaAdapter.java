package P15_Adapter.src.class_adapter;

import P15_Adapter.src.calculator.PizzaCalculator;

public class PizzaAdapter extends PizzaCalculator implements P15_Adapter.src.class_adapter.PizzaCalculator{

    @Override
    public double calculatePricePerSquareMeter(double firstSideLengthInCm, double secondSideLengthInCm, double priceInEuros){
        double radiusEquivalent = Math.sqrt(firstSideLengthInCm * secondSideLengthInCm / Math.PI);
        double diameterEquilevant = 2 * radiusEquivalent;
        return super.calculatePricePerSquareMeter(diameterEquilevant, priceInEuros);
    }
    
}
