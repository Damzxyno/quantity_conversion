package temperrature_conversion;

public class TemperatureConversionImpl implements TemperatureConversion{
    private final static double KELVIN_CONSTANT = 273.15D;
    private final static double FAHRENHEIT_CONSTANT = 32D;

    @Override
    public double convertFahrenheitToCelsius(double value) {
        return (value - FAHRENHEIT_CONSTANT) / 1.8;
    }

    @Override
    public double convertCelsiusToFahrenheit(double value) {
        return (value * 1.8) + FAHRENHEIT_CONSTANT;
    }

    @Override
    public double convertCelsiusToKelvin(double value) {
        return value + KELVIN_CONSTANT;
    }

    @Override
    public double convertKelvinToCelsius(double value) {
        return value - KELVIN_CONSTANT;
    }

    @Override
    public double convertKelvinToFahrenheit(double value) {
        return convertCelsiusToFahrenheit(value - KELVIN_CONSTANT);
    }

    @Override
    public double convertFahrenheitToKelvin(double value) {
        return convertFahrenheitToCelsius(value) + KELVIN_CONSTANT;
    }
}
