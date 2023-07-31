package ru.maxima.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    // private Radio radio;
    @Value("${nameOfRadioFreq}")
    private String nameOfRadioFreq;
    private final List<Radio> listOfRadio;

    @Value("${beginFreq}")
    private double beginFreq;

    @Value("${endFreq}")
    private double endFreq;

    public MusicPlayer(List<Radio> listOfRadio) {
        this.listOfRadio = listOfRadio;
    }

    public String playMusic() {
        Random rnd = new Random();
        Radio rndRadio = listOfRadio.get(rnd.nextInt(listOfRadio.size()));
        return "Вы на волне " + nameOfRadioFreq + " (" + beginFreq + " - " + endFreq + ")" +
                "\n Радиостанция: " + rndRadio.getStation() + "\n ▶ сейчас играет: " + rndRadio.getSong();

    }


}
