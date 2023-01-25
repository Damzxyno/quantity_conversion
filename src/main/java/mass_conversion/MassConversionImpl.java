package mass_conversion;

public class MassConversionImpl implements MassConversion {
    private final static double TonneToKgConversionRate = 1000.00D;
    private final static double TonneToPoundConversionRate = 2204.62D;
    private final static double KgToPoundConversionRate = 2.2046D;


    @Override
    public double convertKgToTonne(double value) {
        return value / TonneToKgConversionRate;
    }

    @Override
    public double convertTonneToKg(double value) {
        return value * TonneToKgConversionRate;
    }

    @Override
    public double convertKgToPound(double value) {
        return value * KgToPoundConversionRate;
    }

    @Override
    public double convertPoundToKg(double value) {
        return value / KgToPoundConversionRate;
    }

    @Override
    public double convertPoundToTonne(double value) {
        return value / TonneToPoundConversionRate;
    }

    @Override
    public double convertTonneToPound(double value) {
        return value * TonneToPoundConversionRate;
    }
}
