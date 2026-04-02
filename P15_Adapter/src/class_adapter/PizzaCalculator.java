package P15_Adapter.src.class_adapter;

public interface PizzaCalculator {
    double calculatePricePerSquareMeter(double firstSideLengthInCm, double secondSideLengthInCm, double priceInEuros);
    double calculatePricePerSquareMeter(double diameterInCm, double priceInEuros);
    
}
