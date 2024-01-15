package ru.job4j.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RlThen2ToEuro() {
        float input = 210;
        float expected = 3;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RblThen3Dollar() {
        float input = 180;
        float expected = 3;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert2000Euro2320Dorllars() {
        float input = 2000;
        float expected = 2320;
        float output = Converter.euroToDollar(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert2000DollarsThen1700Euro() {
        float input = 2000;
        float expected = 1700;
        float output = Converter.dollarToEuro(input);
        float value = 0.0001f;
        Assertions.assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}