package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainShouldReturn100WhenAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainShouldReturn500WhenAmountIs1500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainShouldReturn0WhenAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}
