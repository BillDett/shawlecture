package appliances_v6.food;

import appliances_v6.Appliance;

public class TempController extends Appliance implements TempControls {

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
