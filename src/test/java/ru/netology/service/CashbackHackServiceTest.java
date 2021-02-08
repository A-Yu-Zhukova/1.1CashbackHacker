package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain1400() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1400;

        int actual = cashbackHackService.remain(amount);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain400() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 400;

        int actual = cashbackHackService.remain(amount);
        int expected = 600;

        assertEquals(actual, expected);
    }
}