package dev.lpa;

import dev.lpa.pirate.Pirate;
import dev.lpa.pirate.Weapon;

public class Main {


    public static void main(String[] args) {

//        var console = new GameConsole<>(new ShooterGame("The shooter Game"));
//
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);

        Weapon weapon = Weapon.getWeaponByChar('P');
        System.out.println("Weapon = " + weapon + ", hitPoints = " + weapon.getHitPoints() + ", minLevel = "
                + weapon.getMinLevel());

        var list = Weapon.getWeaponsByLevel('1');
        list.forEach(w -> System.out.println(w)); // could be used as System.out::println

        Pirate umair = new Pirate("Umair");
        System.out.println(umair);



    }
}
