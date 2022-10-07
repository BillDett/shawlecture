package appliances_v5;

public class TempController extends Appliance {

    protected double temperature;

    public TempController(String l, int p ) {
        super(l, p);
    }

    public double getTemp() { return temperature; }
    public void setTemp(double t) {
        temperature = t;
        if ( temperature > 0.0 )
            isOn = true;
        else
            isOn = false;
    }
}
