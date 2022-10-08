package appliances_v7.food;

public class Oven extends TempController {

    private boolean broil;

    public Oven( String l, int p ) {
        super(l, p);
        temperature = 0.0;
    }

    public void setBroil(boolean b) { broil = b; }
    public boolean isBroil() { return broil; }

    public String toString() {
        return "Oven - " + super.toString() +  " - temperature: " + temperature + " degrees Fahrenheit.";
    }
}
