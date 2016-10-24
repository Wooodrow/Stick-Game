package brian.game.stick_d6;


public class Wizard extends Vocation {

    @Override
    public String getOfficialName() {
        return "wizard";
    }

    public int getBlast(){
        int average = ((stats.power + stats.energy + stats.speed)/3);
        return average;
    }
}
