
package appliances_v7;

import appliances_v7.entertainment.*;
import appliances_v7.food.CanOpener;

public class House {

    public static void main(String[] args) {

        CanOpener opener = new CanOpener("Kitchen");
        System.out.println(opener);
        
        HomeTheater ht = new HomeTheater("Living Room");

        SoundBar soundbar = new SoundBar();
        Television tv = new Television(47);
        tv.setTruMotion(true);
        tv.addOutput(new AudioConnection(tv, soundbar));
      
        Receiver receiver = new Receiver();
        receiver.addOutput(new HDMIConnection(receiver, tv));

        SurroundSoundSpeaker[] surrounds = new SurroundSoundSpeaker[4];
        for ( SurroundSoundSpeaker s : surrounds ) {
            s = new SurroundSoundSpeaker(0);    // These are not powered
            receiver.addOutput(new AudioConnection(receiver, s));
        }

        // TODO: Add other input sources

        ht.getComponents().add(receiver);
        ht.getComponents().add(tv);
        ht.getComponents().add(soundbar);
        
        System.out.println(ht);

    }

}