package brian.game.stick_d6;


public class Knight extends Vocation{

    @Override
    public String getOfficialName() {
        return "a knight";
    }

    @Override
    public String toString() {
        return "this is the to String Knight";
    }

    public int getMagicEvasion() {
        int specialRule = (((stats.agility + stats.health + stats.speed)/3) + ((stats.energy) -(1)));
        return specialRule;
    }

}
