package magicGame.models.region;

import magicGame.models.magicians.Magician;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RegionImpl implements Region{



    @Override
    public String start(Collection<Magician> magicians) {
        //TODO
        List<Magician> wizards = new ArrayList<>();
        List<Magician> blackWidows = new ArrayList<>();
        for (Magician magician : magicians) {
            if(magician.getClass().getSimpleName().equals("Wizard")){
                wizards.add(magician);
            }else {
                blackWidows.add(magician);
            }
        }
        while(!wizards.isEmpty()&&!blackWidows.isEmpty()){
           int wizardDamage =  wizards.get(0).getMagic().fire();
           int blackWidowDamage = blackWidows.get(0).getMagic().fire();
           blackWidows.get(0).takeDamage(wizardDamage);
           wizards.get(0).takeDamage(blackWidowDamage);
        }

        if(wizards.isEmpty()){
            return "Black widows win!";
        }

        return "Wizards win!" ;
    }
}
