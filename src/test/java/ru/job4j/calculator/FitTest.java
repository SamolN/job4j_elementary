package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class FitTest {

    @Test
    void whenMan187Then92() {
        short input = 180;
        double expected = 92;
        double ouput = Fit.manWeight(input);
        assertThat(ouput).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWomen170Then69() {
        short input = 170;
        double expected = 69;
        double ouput = Fit.womanWeight(input);
        assertThat(ouput).isEqualTo(expected, withPrecision(0.01));
    }
}