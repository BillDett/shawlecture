package appliances_v7.entertainment;

public abstract class Connection {
    protected enum ConnectionType {
        HDMI, COMPOSITE, LINE_AUDIO, DIGITAL_AUDIO
    }

    protected ConnectionType type;
    protected Component source;
    protected Component sink;

    public Connection(ConnectionType t, Component in, Component out) {
        type = t;
        source = in;
        sink = out;
    }
    public ConnectionType getType() { return type; }

    public void setSource(Component c) { source = c; }
    public void setSink(Component c) { sink = c; }

    public String toString() {
        return "\tSource: " + source.getClass() + ", Sink: " + sink.getClass();
    }

}
