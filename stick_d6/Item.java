package brian.game.stick_d6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brian on 3/31/2016.
 */
public class Item {

    public static List<Item> itemList = new ArrayList<Item>();

    /*public static Item emptyItem(){

        Item emptyItem = new Item();
        emptyItem.setName("Glove");
        emptyItem.slotValue = 0;
        emptyItem.isJobSpecific = false;
        return emptyItem();


    }*/

    public static void createInitialItems(){

        Item magicSword = new Item();
        magicSword.setName("Magic Sword");
        magicSword.slotValue = 1;
        magicSword.healthMod =3;
        magicSword.magicEvasionMod=7;
        magicSword.isJobSpecific = false;
        itemList.add(magicSword);


        Item ironSheild = new Item();
        ironSheild.setName("Iron Sheild");
        ironSheild.slotValue = 1;
        magicSword.magicEvasionMod=7;
        magicSword.agilityMod= 4;
        ironSheild.healthMod = 3;
        ironSheild.isJobSpecific = false;
        ironSheild.jobSpecificity = null;
        itemList.add(ironSheild);

        Item wizardStaff = new Item();
        wizardStaff.setName("Mojito");
        wizardStaff.slotValue = 2;
        magicSword.magicEvasionMod=7;
        wizardStaff.isJobSpecific = true;
        wizardStaff.jobSpecificity = "Wizard";
        itemList.add(wizardStaff);

        Item heroSword = new Item();
        heroSword.setName("Doomgiver");
        heroSword.slotValue = 2;
        heroSword.powerMod = 3;
        heroSword.isJobSpecific = true;
        heroSword.jobSpecificity = "Knight";
        itemList.add(heroSword);


        Item legacyitem = new Item();
        legacyitem.setName("Excaliber");
        legacyitem.slotValue = 1;
        legacyitem.powerMod = 4;
        legacyitem.speedMod = 5;
        legacyitem.isJobSpecific = false;
        itemList.add(legacyitem);

        Item spellSheild = new Item();
        spellSheild.setName("White Sheid");
        spellSheild.slotValue = 1;
        spellSheild.agilityMod = 3;
        spellSheild.isJobSpecific = false;
        itemList.add(spellSheild);

        Item soulCutter = new Item();
        soulCutter.setName("SoulCutter");
        soulCutter.slotValue = 1;
        soulCutter.energyMod = 3;
        soulCutter.isJobSpecific = false;
        itemList.add(soulCutter);

        Item dragonSlicer = new Item();
        dragonSlicer.setName("DragonSlicer");
        dragonSlicer.slotValue = 1;
        dragonSlicer.energyMod = 2;
        dragonSlicer.isJobSpecific = false;
        itemList.add(dragonSlicer);

        Item coinSpinner = new Item();
        coinSpinner.setName("CoinSpinner");
        coinSpinner.slotValue = 1;
        coinSpinner.evasionMod = 3;
        coinSpinner.isJobSpecific = false;
        itemList.add(coinSpinner);

        Item mindFlayer = new Item();
        mindFlayer.setName("MindFlayer");
        mindFlayer.slotValue = 1;
        mindFlayer.energyMod = 3;
        mindFlayer.isJobSpecific = false;
        itemList.add(mindFlayer);

        Item woundHealer = new Item();
        woundHealer.setName("WoundHealer");
        woundHealer.slotValue = 1;
        woundHealer.healthMod = 4;
        woundHealer.isJobSpecific = false;
        itemList.add(woundHealer);

        Item sheildBreaker = new Item();
        sheildBreaker.setName("SheildBreaker");
        sheildBreaker.slotValue = 1;
        sheildBreaker.smashMod = 3;
        sheildBreaker.isJobSpecific = false;
        itemList.add(sheildBreaker);







    }

    private String name;
    int slotValue;
    int healthMod;
    int speedMod;
    int agilityMod;
    int powerMod;
    int energyMod;
    int evasionMod;
    int magicEvasionMod;
    int smashMod;
    boolean isJobSpecific;
    String jobSpecificity;// check object instead of string.

    public String getName() {
        return name;
    }

    public int getSlotValue() {
        return slotValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthMod() {
        return healthMod;
    }

    public int getSpeedMod(){
        return speedMod;
    }

    public int getAgilityMod() {
        return agilityMod;
    }

    public int getPowerMod() {  return powerMod; }

    public int getEvasionMod() {return evasionMod;}

    public int getEnergyMod(){return energyMod;}

    public int gteMagicEvasionMod(){return magicEvasionMod; }

    public int getSmashMod(){return smashMod;}

    public boolean getIsClassSpecifc (){return isJobSpecific;}

   // public void setisJobSpecific (Boolean) {
     //   if (isJobSpecific = true
       // try set
    }

