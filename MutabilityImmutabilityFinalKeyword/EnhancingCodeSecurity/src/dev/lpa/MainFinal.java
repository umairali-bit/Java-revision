package dev.lpa;

import dev.lpa.game.Game;
import dev.lpa.game.GameAction;
import dev.lpa.game.GameConsole;
import dev.lpa.game.Player;
import dev.lpa.pirate.PirateGame;
import dev.lpa.pirate.Weapon;

import java.util.function.Predicate;

// we caqnnot extend the GameAction or Enum since they are Record and Enum and records are final
//class SpecialGameAction extends Weapon {}

//class SpecialGameConsole <T extends Game<? extends Player>> extends GameConsole<Game<? extends Player>>{
//    public SpecialGameConsole(Game<? extends Player> game) {
//        super(game);
//    }
//}

public class MainFinal {

    public static void main(String[] args) {

       GameConsole<PirateGame> game = new GameConsole<>(new PirateGame("The Pirate Game"));

    }
}
