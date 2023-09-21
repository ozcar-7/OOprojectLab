public class HotelRoom 
{
    private int roomNumber;
    private String roomType;
    private int roomStatus;
    private double roomRate;

    public HotelRoom() //constructors
        {
        }
    public HotelRoom(int number, String type, int state, double rate)
        {
            roomNumber = number;
            roomType = type;
            roomStatus = state;
            roomRate = rate;
        }
    
    
    public void setRoomNumber(int number) //setter methods
        {
            roomNumber = number;
        }

    public void setRoomType(String type)
        {
            roomType = type;
        }

    public void setStatus(int state)
        {
            roomStatus = state;
        }
    
    public void setRate(double rate)
        {
            roomRate = rate;
        }
    


    public int getRoomNumber() // getter methods
        {
            return roomNumber;
        }

    public String getRoomType()
        {
            return roomType;
        }
    public String getRoomStatus()
        {
            String state;
            if(roomStatus == 1)
                {
                     state = "occupied";
                }
            else if (roomStatus == 0)
                {
                    state = "non-occupied";
                }
            else
                {
                    state = "Enter a valid occpation state";
                }
            return state;
        }
    public double getRoomRate()
        {
            return roomRate;
        }
    


}
