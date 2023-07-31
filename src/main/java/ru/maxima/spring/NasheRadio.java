package ru.maxima.spring;

import java.util.List;
import java.util.Random;

public class NasheRadio implements Radio {

    private final String name;
    private final List<String> playList;


    public NasheRadio(String name, List<String> playList) {
        this.name = name;
        this.playList = playList;
    }

    public List<String> getPlayList() {
        return playList;
    }

    @Override
    public String getSong() {
        Random rnd = new Random();
        return getPlayList().get(rnd.nextInt(playList.size()));
    }

    @Override
    public String getStation() {
        return this.name;
    }
}
