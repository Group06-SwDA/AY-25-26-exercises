package solid.isp.compliant;

public interface I_bookCarRental {
    public void setPickUpDate();
    public void setDropOffDate();
    public void setCarType(String carType);
    public void setLocation(String location);
    public void bookCarRental();
}
