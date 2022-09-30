
package appliances_v6;

import appliances_v6.entertainment.HomeTheater;
import appliances_v6.food.CanOpener;

public class House {

    public static void main(String[] args) {

        CanOpener opener = new CanOpener("Kitchen");
        System.out.println(opener);
        
        HomeTheater ht = new HomeTheater("Living Room");
        
        ht.getTV().setTruMotion(true);
        ht.getTV().setVolume(47.3);     // Actually setting SoundBar volume since it is attached

        System.out.println(ht);

    }

}