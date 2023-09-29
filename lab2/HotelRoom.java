public class HotelRoom 
{
    private int roomNumber;
    private String roomType;
    private int roomStatus;
    private double roomRate;
    private boolean occupiedState;

    public HotelRoom() //constructors
        {
        }
    public HotelRoom(int number, String type, int state, double rate)
        {
            roomNumber = number;
            roomType = type;
            roomStatus = state;
            roomRate = rate;
            if(rate == 1)
                {
                    occupiedState = true;
                }
            else
                {
                    occupiedState = false;
                }
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
    
    public void setOccupied(int status)
        {
            boolean roomState = false;
            if(status == 1)
                {
                    roomState = true;
                }
            occupiedState = roomState ;
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
    public boolean getOccupiedState()
        {
            return occupiedState;
        }
    
    public void isOccupied()
        {
            if(occupiedState)
                {
                    System.out.println("the room is occupied");
                }
            else
                {
                    System.out.println("the room is not occupied");
                }
        }


}
