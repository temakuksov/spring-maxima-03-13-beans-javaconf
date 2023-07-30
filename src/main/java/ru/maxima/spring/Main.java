package ru.maxima.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Spring. Конфигурация на Java
        // Необходимо создать лист из радиостанций и подавать его в конструктор плееру.
        // В каждой радиостанции необходимо крутить несколько треков (не один).
        // Пусть каждый запуск радио крутится рандомная песня.

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);


    }
}
