package appliances_v2;

public class CanOpener extends Appliance {

    public CanOpener( String l ) {
        super(l, 2);
    }

    public String toString() {
        return "CanOpener - " + super.toString();
    }
}
