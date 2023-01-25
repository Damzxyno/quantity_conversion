import mass_conversion.MassConversion;
import mass_conversion.MassConversionImpl;
import temperrature_conversion.TemperatureConversion;
import temperrature_conversion.TemperatureConversionImpl;
import testing_framework.TestService;
import testing_framework.TestServiceImpl;

public class ConverterMain {
    public static void main(String[] args) {
        MassConversion massConverter = new MassConversionImpl();
        TemperatureConversion tempConverter = new TemperatureConversionImpl();
        TestService testService = new TestServiceImpl();


        /**
         * Mass Conversion Test
         */
        // KG AND POUND
        var test1Result = massConverter.convertKgToPound(1);
        testService.isEqual(2.20460, test1Result);
        var test2Result = massConverter.convertKgToPound(2.20460);
        testService.isEqual(1, test2Result);
    }
}
