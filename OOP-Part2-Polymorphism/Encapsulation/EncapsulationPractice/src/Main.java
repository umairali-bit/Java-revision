public class Main {

    public static void main(String[] args) {

//        // without Encapsulation
//        Player player = new Player();
//        player.name = "Umair";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer Umair = new EnhancedPlayer("Umair",200,"Sword");// still outputting health = 100 because of encapsulation
        System.out.println("Initial Health is = "+ Umair.healthRemaining());
        System.out.println(Umair.weapon());

    }
}
