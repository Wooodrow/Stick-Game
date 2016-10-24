package brian.game.stick_d6;

public abstract class Vocation{

    Stats stats;


    public abstract String getOfficialName();

    public int getSmash() {
        int smAverage = ((stats.agility + stats.power + stats.speed)/3);
        return smAverage;
    }

    public int getEvasion() {
        int evAverage = ((stats.agility + stats.health + stats.speed)/3);
        return evAverage;
    }


   public int getMagicEvasion() {
   int specialRule = (((stats.agility + stats.health + stats.speed)/3)+(stats.energy));
   return specialRule;
   }


}
