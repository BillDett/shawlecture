package appliances_v7.entertainment;

public class InputSource extends Component {

    public InputSource(int p) {
        super(p);
    }

    // An InputSource only has Outputs, so override these methods with no-ops
    public void addInput(Connection c) {}
    public void removeInput(Connection c) {}

}
