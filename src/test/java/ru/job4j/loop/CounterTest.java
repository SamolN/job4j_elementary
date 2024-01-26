package ru.job4j.loop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart100Finish102Then303() {
        int start = 100;
        int finish = 102;
        int result = Counter.sum(start, finish);
        int expected = 303;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus5Finish56Then6() {
        int start = -5;
        int finish = 6;
        int result = Counter.sum(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMoreFinishThen0() {
        int start = 10;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus2ToSixThenTen() {
        int start = -2;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
    }