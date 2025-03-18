package dev.lpa;

import dev.lpa.game.GameConsole;
import dev.lpa.game.ShooterGame;
import dev.lpa.pirate.Weapon;

public class Main {


    public static void main(String[] args) {

//        var console = new GameConsole<>(new ShooterGame("The shooter Game"));
//
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);

        Weapon weapon = Weapon.getWeaponByChar('P');
        System.out.println(weapon);



    }
}
