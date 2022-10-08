package appliances_v5;

public interface Registered {
    public String getSerialNo() ;
    public void setSerialNo(String s);
    // notify the manufacturer web service we are registering something, get back a return status code
    public int register(String url);
}
