package com.company;

public class MuzzleLeashException extends Exception {
    @Override
    public String toString() {
        return "Запрещено гулять собакам без поводка и намордника !!! ";
    }
}
