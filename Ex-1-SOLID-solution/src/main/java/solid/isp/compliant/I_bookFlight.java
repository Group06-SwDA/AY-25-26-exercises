package solid.isp.compliant;

public interface I_bookFlight {
    public void setStartDate();
    public void setEndDate();
    public void setDestination(String destination);
    public void setOrigin(String origin);
    public void bookFlight();
}
