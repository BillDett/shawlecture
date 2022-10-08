package appliances_v7.entertainment;

public class AudioConnection extends Connection {
    
    public AudioConnection(Component in, Component out) {
        super(ConnectionType.LINE_AUDIO, in, out);
    }
}
