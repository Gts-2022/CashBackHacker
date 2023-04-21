package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test//Тест 1
    public void shouldReturn100IfAmountIs900() {
        // Вернуть 100, если покупка на 900 рублей
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test//Тест 2
    public void shouldReturn0IfAmountIs1000() {
        // Вернуть 0, если покупка на 1000 рублей
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals( actual,expected);
    }

}