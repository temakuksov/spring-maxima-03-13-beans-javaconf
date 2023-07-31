package ru.maxima.spring;

import org.springframework.stereotype.Component;

@Component
public interface Radio {
    String getSong();
    String getStation();

}
