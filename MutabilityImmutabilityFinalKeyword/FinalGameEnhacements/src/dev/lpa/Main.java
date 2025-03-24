package dev.lpa;

import dev.lpa.game.GameConsole;
import dev.lpa.pirate.PirateGame;
import dev.lpa.pirate.Town;

import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {

////        var console = new GameConsole<>(new ShooterGame("The shooter Game"));
////
////        int playerIndex = console.addPlayer();
////        console.playGame(playerIndex);
//
//        Weapon weapon = Weapon.getWeaponByChar('P');
//        System.out.println("Weapon = " + weapon + ", hitPoints = " + weapon.getHitPoints() + ", minLevel = "
//                + weapon.getMinLevel());
//
//       // var list = Weapon.getWeaponsByLevel('1');
//       // list.forEach(w -> System.out.println(w)); // could be used as System.out::println
//
//        Pirate umair = new Pirate("Umair");
//        System.out.println(umair);
//
        PirateGame.getTowns(0).forEach(t -> System.out.println(t.information()));
        System.out.println("-".repeat(50));
        PirateGame.getTowns(1).forEach(t -> System.out.println(t.information()));
        System.out.println("-".repeat(50));


//        Town bridgetown = new Town("BridgeTown", "Barbados", 0);
//        System.out.println(bridgetown);
//        System.out.println(bridgetown.information());
//        var gameConsole = new GameConsole<>(new PirateGame("The Pirate Game"));
//       int playerIndex =  gameConsole.addPlayer();
//        gameConsole.playGame(playerIndex);





    }
}
