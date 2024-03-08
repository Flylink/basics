package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

    @Test
    public void testRemainShouldReturn100WhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainShouldReturn500WhenAmountIs1500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemainShouldReturn0WhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testJupiterRemainShouldReturn100WhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testJupiterRemainShouldReturn500WhenAmountIs1500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testJupiterRemainShouldReturn0WhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}
