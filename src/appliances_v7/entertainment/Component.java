package appliances_v7.entertainment;

import appliances_v7.Appliance;

import java.util.ArrayList;
import java.util.List;

public abstract class Component extends Appliance {
    private ArrayList<Connection> inputs;
    private ArrayList<Connection> outputs;

    public Component(int p) {
        super("Home Theater", p);
    }

    public void addInput(Connection c) {
        if (inputs == null) {
            inputs = new ArrayList<Connection>();
        }
        if ( c != null ) {
            inputs.add(c);
        }
    }
    public void removeInput(Connection c) {
        if ( inputs != null ) {
            inputs.remove(c);
        }
    }
    public List<Connection> getInputs() { return inputs; }

    public void addOutput(Connection c) {
        if (outputs == null) {
            outputs = new ArrayList<Connection>();
        }
        if ( c != null ) {
            outputs.add(c);
        }
    }
    public void removeOutput(Connection c) {
        if ( outputs != null ) {
            outputs.remove(c);
        }
    }
    public List<Connection> getOutputs() { return inputs; }

    public String toString() {
        String response = new String();
        if ( inputs != null ) {
            response += "\n\t\tInput Connections:";
            for ( Connection c : inputs ) {
                response += "\n\t\t" + c.toString();
            }
        }
        if ( outputs != null ) {
            response += "\n\t\tOutput Connections:";
            for ( Connection c : outputs ) {
                response += "\n\t\t" + c.toString();
            }
        }
        return response;
    }

}
