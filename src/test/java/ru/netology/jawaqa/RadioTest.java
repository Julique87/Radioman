package ru.netology.jawaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStationConstructor1() {  // Установить радиостанцию, Конструктор 1
        Radio station = new Radio(15);
        station.setCurrentRadioStation(7);

        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationConstructor2() {  // Установить радиостанцию, Конструктор 2
        Radio station = new Radio();
        station.setCurrentRadioStation(7);

        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldBorderRadioStationConstructor1() {
        Radio station = new Radio(15);               // Граничные значения радиостанций, Конструктор 1


        Assertions.assertEquals(0, station.getMinRadioStation());
        Assertions.assertEquals(14, station.getMaxRadioStation());
    }

    @Test
    public void shouldBorderRadioStationConstructor2() {
        Radio station = new Radio();               // Граничные значения радиостанций, Конструктор 2


        Assertions.assertEquals(0, station.getMinRadioStation());
        Assertions.assertEquals(9, station.getMaxRadioStation());
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
    public void shouldNotSetRadioStationBelowMinConstructor1() {  // Не поставить радиостанцию ниже минимальной, Конструктор 1
        Radio station = new Radio(15);
        station.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowMinConstructor2() {  // Не поставить радиостанцию ниже минимальной, Конструктор 2
        Radio station = new Radio();
        station.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMaxConstructor1() {  // Не поставить радиостанцию выше максимальной, Конструктор 1
        Radio station = new Radio(15);
        station.setCurrentRadioStation(20);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveMaxConstructor2() {  // Не поставить радиостанцию выше максимальной, Конструктор 2
        Radio station = new Radio();
        station.setCurrentRadioStation(15);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowBorderLowConstructor1() {  // Не поставить радиостанцию на 1 ниже нижнего гранчного значения, Конструктор 1
        Radio station = new Radio(15);
        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationBelowBorderLowConstructor2() {  // Не поставить радиостанцию на 1 ниже нижнего гранчного значения, Конструктор 2
        Radio station = new Radio();
        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveBorderHighConstructor1() {  // Не поставить радиостанцию на 1 выше верхнего граничного значния, Конструктор 1
        Radio station = new Radio(15);
        station.setCurrentRadioStation(15);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationAboveBorderHighConstructor2() {  // Не поставить радиостанцию на 1 выше верхнего граничного значния, Конструктор 2
        Radio station = new Radio();
        station.setCurrentRadioStation(10);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationConstructor1() {  // Переключить радиостанцию на 1 вперед, Конструктор 1
        Radio station = new Radio(15);
        station.setCurrentRadioStation(5);

        station.increaseRadioStation();
        int expected = 6;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationConstructor2() {  // Переключить радиостанцию на 1 вперед, Конструктор 2
        Radio station = new Radio();
        station.setCurrentRadioStation(5);

        station.increaseRadioStation();
        int expected = 6;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationConstructor1() {  // Переключить радиостанцию на 1 назад, Конструктор 1
        Radio station = new Radio(15);
        station.setCurrentRadioStation(8);

        station.decreaseRadioStation();
        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationConstructor2() {  // Переключить радиостанцию на 1 назад, Конструктор 2
        Radio station = new Radio();
        station.setCurrentRadioStation(8);

        station.decreaseRadioStation();
        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationBorderHighConstructor1() {  // Переключить радиостанцию на 1 вперед, верхнее граничное значение, Конструктор 1
        Radio station = new Radio(15);
        station.setCurrentRadioStation(13);

        station.increaseRadioStation();
        int expected = 14;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationBorderHighConstructor2() {  // Переключить радиостанцию на 1 вперед, верхнее граничное значение, Конструктор 2
        Radio station = new Radio();
        station.setCurrentRadioStation(8);

        station.increaseRadioStation();
        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationBorderLowConstructor1() {  // Переключить радиостанцию на 1 назад, нижнее граничное значение, Конструктор 1
        Radio station = new Radio(15);
        station.setCurrentRadioStation(1);

        station.decreaseRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationBorderLowConstructor2() {  // Переключить радиостанцию на 1 назад, нижнее граничное значение, Конструктор 2
        Radio station = new Radio();
        station.setCurrentRadioStation(1);

        station.decreaseRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationAboveBorderHighBackTo0Constructor1() {  // Переключить радиостанцию на 1 вперед, выше верхнего граничого значения, вернув на 0, Конструктор 1
        Radio station = new Radio(15);
        station.setCurrentRadioStation(14);

        station.increaseRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationAboveBorderHighBackTo0Constructor2() {  // Переключить радиостанцию на 1 вперед, выше верхнего граничого значения, вернув на 0, Конструктор 2
        Radio station = new Radio();
        station.setCurrentRadioStation(9);

        station.increaseRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationBelowBorderLowBackToMaxConstructor1() {  // Переключить радиостанцию на 1 назад, ниже нижнего граничного значение, вернув на максимальную, Конструктор 1
        Radio station = new Radio(15);
        station.setCurrentRadioStation(0);

        station.decreaseRadioStation();
        int expected = 14;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationBelowBorderLowBackTo9Constructor2() {  // Переключить радиостанцию на 1 назад, ниже нижнего граничного значение, вернув на 9, , Конструктор 2
        Radio station = new Radio();
        station.setCurrentRadioStation(0);

        station.decreaseRadioStation();
        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBorderVolume() {
        Radio vol = new Radio();               // Граничные значения звука


        Assertions.assertEquals(0, vol.getMinVolume());
        Assertions.assertEquals(100, vol.getMaxVolume());
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

        vol.setCurrentVolume(120);
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
        vol.setCurrentVolume(99);

        vol.increaseVolume();
        int expected = 100;
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
        vol.setCurrentVolume(100);

        vol.increaseVolume();
        int expected = 100;
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
