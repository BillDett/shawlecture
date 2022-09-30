package appliances_v2;

public class Oven extends Appliance {
    private double temperature;
    private boolean broil;

    public Oven( String l, int p ) {
        super(l, p);
        temperature = 0.0;
    }

    public double getTemp() { return temperature; }
    public void setTemp(double t) { 
        temperature = t;
        if ( temperature > 0.0 )
            isOn = true;
        else
            isOn = false;
    }

    public void setBroil(boolean b) { broil = b; }
    public boolean isBroil() { return broil; }

    public String toString() {
        return "Oven - " + super.toString() +  " - temperature: " + temperature + " degrees Fahrenheit.";
    }
}
