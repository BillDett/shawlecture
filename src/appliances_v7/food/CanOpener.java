package appliances_v7.food;

import appliances_v7.Appliance;

public class CanOpener extends Appliance {

    public CanOpener( String l ) {
        super(l, 2);
    }

    public String toString() {
        return "CanOpener - " + super.toString();
    }
}
