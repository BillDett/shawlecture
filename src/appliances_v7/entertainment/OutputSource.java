package appliances_v7.entertainment;

public class OutputSource extends Component {

    public OutputSource(int p) {
        super(p);
    }

    // An OutputSource only has Inputs, so override these methods with no-ops
    public void addOutput(Connection c) {}
    public void removeOutput(Connection c) {}

}
