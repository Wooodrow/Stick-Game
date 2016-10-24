package brian.game.stick_d6;

import sun.plugin.dom.css.Counter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by keith on 3/19/2016.
 */
public class Stick {
    private int itemStatsLeft(){
        //todo make this method complete!!!!!!!!!!!!!!! NOT WORKING Keeps adding random values from wrong source item

        return leftItem.agilityMod + leftItem.magicEvasionMod;
    }
    String name;

    Vocation vocation;


// todo
    private Item leftItem;

    private Item rightItem;

public void setRandomItems(List<Item> randomItemList){
    // grab one item set left first(no values yet)
    int randomValue = new Random().nextInt(randomItemList.size());
    leftItem = randomItemList.get(randomValue);
    System.out.println(leftItem.getName() + " Was equipped to " + Stick.this.name);// + vocation.getOfficialName());// + Stick.this.name);
    System.out.println(itemStatsLeft());
    //if left slot value = 2  then exit
    System.out.println(leftItem.slotValue + "yo");
    if (leftItem.slotValue == 2){

        return;

    }
List<Item> tempList = new ArrayList<>(randomItemList.subList(0, randomItemList.size()));
    //else get 2nd item
    int tempItemInt = new Random().nextInt(tempList.size());
     Item tempItem = tempList.get(tempItemInt);
    tempList.remove(tempItemInt);

    // todo add stat modifiers ClasSpecificity and isJobSpecific
System.out.println(tempItem.slotValue + "Here");
    //Todo What is this next line??? slotValue !=1
    while( ( (tempItem.slotValue != 2) || (tempItem.getName() == leftItem.getName() )  ) &&(tempList.size()> 0 )) {
        tempItemInt = new Random().nextInt(tempList.size());
        tempItem = tempList.get(tempItemInt);
        tempList.remove(tempItemInt);

    }
    if (tempList.size() == 0) {

        return;


    }
    else {
        rightItem = tempItem;
        System.out.println(rightItem.getName() + " Was equipped");
    }
    //loop while 2nditemSlotValue != 1 or 2ndItem is equal to  leftItem then set right
    //or continue loop until counter equals array size.

}





}
