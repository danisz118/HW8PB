package com.company;

public class Dog {
    private boolean muzzle;
    private boolean leash;


    public void goWalk(boolean muzzle, boolean leash) throws MuzzleLeashException {
        if (muzzle == true && leash == true) {
            System.out.println("Ура идем гулять:)");
        } else {
            throw new MuzzleLeashException();
        }

    }
}
