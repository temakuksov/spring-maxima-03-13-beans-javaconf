package ru.maxima.spring;

import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.maxima.spring")
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Bean
    public RetroRadio retroRadio() {
        List<String> trackList = Arrays.asList("Adriano Celentano - Susanna", "Blondie - Call Me", "Gary Moore - Still Got The Blues", "Boney M. - Rivers of Babylon");
        return new RetroRadio("RetroRadio", trackList);
    }

    @Bean
    public RockRadio rockRadio() {
        List<String> trackList = Arrays.asList("Guns N' Roses - Sweet Child O' Mine", "AC/DC - Thunderstruck", "Papa Roach - Scars", "Garbage - I Think I'm Paranoid");
        return new RockRadio("RockRadio \\oo/", trackList);
    }

    @Bean
    public NasheRadio nasheRadio() {
        List<String> trackList = Arrays.asList("Lumen - Сид и Нэнси", "Король и Шут - Лесник", "Кирпичи - Школьнички", "Наив - Моё сердце (Не остановилось)");
        return new NasheRadio("НашеРадио", trackList);
    }

    @Bean
    public List<Radio> listOfRadio() {
        return Arrays.asList(retroRadio(), rockRadio(), nasheRadio());
    }

    @Bean
    @Scope("prototype")
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(listOfRadio());
    }

}
