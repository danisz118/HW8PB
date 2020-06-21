package com.company;


import java.io.FileInputStream;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Walk {
    static Logger LOGGER;

    static {
        try (FileInputStream ins = new FileInputStream("C:\\pbTask\\HW_8\\src\\com\\company\\logConfig.txt")) {
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Walk.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LOGGER.log(Level.INFO,"Начало main, создаем объект Dog ");
        Dog dog = new Dog();

        try {
            LOGGER.log(Level.INFO,"Обращаемся к методу  goWalk и передаем параметры для проверки");
            dog.goWalk(true, true);
        } catch (MuzzleLeashException e) {
            e.printStackTrace();
            LOGGER.log(Level.WARNING,"Исключительная ситуация собака без намордника и поводка !!!");
        }

        LOGGER.log(Level.INFO,"Создаем второй объект Dog ");
        Dog dog1 = new Dog();
        try {
            LOGGER.log(Level.INFO,"Обращаемся к методу  goWalk и передаем параметры для проверки");
            dog1.goWalk(false, false);
        } catch (MuzzleLeashException e) {
            LOGGER.log(Level.WARNING,"Исключительная ситуация собака без намордника и поводка!!!");
            e.printStackTrace();
        }
    }
}
