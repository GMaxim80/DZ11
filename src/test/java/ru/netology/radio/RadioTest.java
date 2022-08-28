package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void test12() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 11;

        assertEquals(expected, actual);
    }

    @Test
    public void test13() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void test14() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }


    @Test
    public void test15() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void test16() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test17() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int actual = radio.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void test18() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void test19() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void test20() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        radio.next();

        int actual = radio.getCurrentVolume();
        int expected = 11;

        assertEquals(expected, actual);
    }

    @Test
    public void test21() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }


    @Test
    public void test22() {
        Radio radio = new Radio();
        radio.setCurrentVolume(150);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void test23() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }
}