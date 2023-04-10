package ru.netology.jawaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {  // Установить радиостанцию
        Radio station = new Radio();
        station.setCurrentRadioStation(7);

        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolume() {   // Установить звук
        Radio vol = new Radio();
        vol.setCurrentVolume(5);

        int expected = 5;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMinRadioStation() { // Поставить минимальную радиостанцию
        Radio station = new Radio();
        station.setToMinRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation() {  // Поставить максимальную радиостанцию
        Radio station = new Radio();
        station.setToMaxRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {  // Не поставить радиостанцию ниже минимальной
        Radio station = new Radio();
        station.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {  // Не поставить радиостанцию выше максимальной
        Radio station = new Radio();
        station.setCurrentRadioStation(15);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowBorderLow() {  // Не поставить радиостанцию на 1 ниже нижнего гранчного значения
        Radio station = new Radio();
        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveBorderHigh() {  // Не поставить радиостанцию на 1 выше верхнего граничного значния
        Radio station = new Radio();
        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStation() {  // Переключить радиостанцию на 1 вперед
        Radio station = new Radio();
        station.setCurrentRadioStation(5);

        station.increaseRadioStation();
        int expected = 6;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStation() {  // Переключить радиостанцию на 1 назад
        Radio station = new Radio();
        station.setCurrentRadioStation(8);

        station.decreaseRadioStation();
        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationBorderHigh() {  // Переключить радиостанцию на 1 вперед, верхнее граничное значение
        Radio station = new Radio();
        station.setCurrentRadioStation(8);

        station.increaseRadioStation();
        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationBorderLow() {  // Переключить радиостанцию на 1 назад, нижнее граничное значение
        Radio station = new Radio();
        station.setCurrentRadioStation(1);

        station.decreaseRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseRadioStationAboveBorderHigh() {  // Не переключить радиостанцию на 1 вперед, выше верхнего граничого значения
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        station.increaseRadioStation();
        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseRadioStationBelowBorderLow() {  // Не переключить радиостанцию на 1 назад, ниже нижнего граничного значение
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        station.decreaseRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetToMinVolume() { // Поставить минимальный уровень звука
        Radio vol = new Radio();
        vol.setToMinVolume();

        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {  // Поставить максимальный уровень звука
        Radio vol = new Radio();
        vol.setToMaxVolume();

        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {  // Не поставить звук ниже минимального
        Radio vol = new Radio();

        vol.setCurrentVolume(-5);
        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {  // Не поставить звук выше максимального
        Radio vol = new Radio();

        vol.setCurrentVolume(20);
        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {  // Увеличить звук на 1
        Radio vol = new Radio();
        vol.setCurrentVolume(5);

        vol.increaseVolume();
        int expected = 6;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {  // Уменьшиь звук на 1
        Radio vol = new Radio();
        vol.setCurrentVolume(8);

        vol.decreaseVolume();
        int expected = 7;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeBorderHigh() {  // Увеличить звук на 1, верхнее граничное значение
        Radio vol = new Radio();
        vol.setCurrentVolume(9);

        vol.increaseVolume();
        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBorderLow() {  // Уменьшить звук на 1, нижнее граничное зачение
        Radio vol = new Radio();
        vol.setCurrentVolume(1);

        vol.decreaseVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveBorderHigh() {  // Не увеличить звук на 1, выше верхнего граничного значения
        Radio vol = new Radio();
        vol.setCurrentVolume(10);

        vol.increaseVolume();
        int expected = 10;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeBelowBorderLow() {  // Не уменьшить звук на 1, ниже нижнего граничного зачения
        Radio vol = new Radio();
        vol.setCurrentVolume(0);

        vol.decreaseVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
