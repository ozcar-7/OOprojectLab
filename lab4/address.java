public class address{

    private String street;
    private String city;
    private String county;

    public address(String street, String city, String county)
        {
            this.street = street;
            this.city = city;
            this.county = county;
        }

    //getter & setters
    public String getStreet() 
        {
            return this.street;
        }

    public void setStreet(String Street) 
        {
            this.street = Street;
        }

    public String getCity() 
        {
            return this.city;
        }

    public void setCity(String city) 
        {
            this.city = city;
        }

    public String getCounty() 
        {
            return this.county;
        }

    public void setCounty(String county) 
        {
            this.county = county;
        }


    public String toString() 
        {
            return street + ", " + city + ", " + county;
        }
}