package brian.game.stick_d6;


import java.util.Random;



public class StickGame {

    public static int diceRoller(){
        return 1 + (int)(Math.random()*6);
    }

    public void blastAttack(Stick attacker, Stick defender){

    }

    public void smashAttack(Stick attacker, Stick defender){

        int attackersRoll = StickGame.diceRoller();
        int attackersValue = attackersRoll + attacker.vocation.getSmash();

        System.out.println("Attack Value for " + attacker.name + " : " + attackersValue);

        int defendersRoll = StickGame.diceRoller();
        int defendersValue = defendersRoll + defender.vocation.getEvasion();

        System.out.println("Defend Value for " +defender.name + " : " +defendersValue);

// todo Why does this work?

        if (attackersValue>defendersValue) {
            defender.vocation.stats.health = defender.vocation.stats.health-(attackersValue - defendersValue);
        }
      /*  else  {
            if (attackersValue<defendersValue) {
                defender.vocation.stats.health = defender.vocation.stats.health;
            }
                    }*/
    }



    public static void main (String[] args){
Item.createInitialItems();




        //2 players
        Stick brianStick = new Stick();
        brianStick.name = "Brian";

        // todo:Work on random method for pooling items for each "stick"
      brianStick.setRandomItems(Item.itemList);


      /*  Item leftItem = Item.itemList.get(0);
        try {
            brianStick.setLeftItem(leftItem);
            System.out.println(leftItem.getName() + " Was equipped");
        } catch (Exception e){
            System.out.println (e.getMessage());
        }*/


        Vocation vocation1 = new Knight();


      Stats briansStats = new Stats();
     /**briansStats.speed =  StickGame.diceRoller();
        briansStats.health =  StickGame.diceRoller();
        briansStats.agility =  StickGame.diceRoller();
        briansStats.power = StickGame.diceRoller();
        briansStats.mindfulness = StickGame.diceRoller();
        briansStats.energy = StickGame.diceRoller(); */

        briansStats.speed =  5;
        briansStats.health =  10;
        briansStats.agility =  15;
        briansStats.power = 20;
        briansStats.mindfulness = 25;
        briansStats.energy = 30;

        vocation1.stats = briansStats;

        vocation1.getMagicEvasion();

        brianStick.vocation = vocation1;
        System.out.println("player 1 Magic Evasion: " + vocation1.getMagicEvasion());
        System.out.println("Player 1: " + brianStick.name);
        System.out.println("Player 1 Vocation: " + brianStick.vocation.getOfficialName());
        System.out.println("Player 1 Smash: " + brianStick.vocation.getSmash());
        System.out.println("Player 1 Health: " + brianStick.vocation.stats.health);


        //**********

        Stick keithStick = new Stick();
        keithStick.name = "Keith";

        Vocation vocation2 = new Wizard();

        Stats keithStats = new Stats();
        keithStats.speed = StickGame.diceRoller();
        keithStats.health = StickGame.diceRoller();
        keithStats.agility = StickGame.diceRoller();
        keithStats.power = StickGame.diceRoller();
        keithStats.energy = StickGame.diceRoller();
        keithStats.mindfulness = StickGame.diceRoller();

        vocation2.stats = keithStats;


        keithStick.vocation = vocation2;

        System.out.println("Player 2: " + keithStick.name);
        System.out.println("Player 2 Vocation: " + keithStick.vocation.getOfficialName());


        if (keithStick.vocation instanceof Wizard) {
            Wizard keithsWizardVocation = (Wizard)keithStick.vocation;
            System.out.println("Player 2 Blast: " + keithsWizardVocation.getBlast());
        }
        System.out.println("Player 2 Health: " + keithStick.vocation.stats.health);

        //****************
        //Let's play
        StickGame stickGame = new StickGame();


        boolean foundWinner = false;

        while (!foundWinner) {
            stickGame.smashAttack(brianStick, keithStick);
            System.out.println("Keith: " + keithStick.vocation.stats.health);
            if (keithStick.vocation.stats.health <= 0){
                System.out.println(brianStick.name + " is the winner.");
                foundWinner=true;
                break;
            }

            stickGame.smashAttack(keithStick, brianStick);
            System.out.println("Brian: " + brianStick.vocation.stats.health);
            if (brianStick.vocation.stats.health <= 0){
                System.out.println(keithStick.name + " is the winner.");
                foundWinner=true;
            }
        }












    }

}
