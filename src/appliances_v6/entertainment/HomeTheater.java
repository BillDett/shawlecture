package appliances_v6.entertainment;

import appliances_v6.Appliance;

public class HomeTheater extends Appliance {

    private Television tv;
    private SoundBar soundbar;

    public HomeTheater(String l) {
        super(l, 3);
        tv = new Television(l, 75);
        soundbar = new SoundBar(l);
        tv.attachSoundBar(soundbar);
    }

    public Television getTV() { return tv; }

    public String toString() {
        return "Home Theater - " + super.toString()
            + "\n\t" + tv.toString()
            + "\n\t" + soundbar.toString();
    }

}
