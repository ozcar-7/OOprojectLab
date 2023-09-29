public class Lab2q1 
{
    public static void main(String args[]) 
    {
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();
        HotelRoom roomC = new HotelRoom(201, "single", 0, 90);

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomA.setStatus(1);
        roomA.setOccupied(1);
        roomA.setRate(100);

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setStatus(0);
        roomB.setOccupied(0);
        roomB.setRate(80);

        if(roomB.getOccupiedState())
            {
                roomB.isOccupied();
            }
        else
            {
                roomB.setOccupied(1);
            }


        System.out.println("roomA room number is " + roomA.getRoomNumber() + ", the room type is " + roomA.getRoomType() + ", has a nightly rate of " + roomA.getRoomRate() + " and has an occupation status of: " + roomA.getRoomStatus());
        System.out.println("roomB room number is " + roomB.getRoomNumber() + " and the room type is " + roomB.getRoomType() + ", has a nightly rate of " + roomB.getRoomRate() + " and has an occupation status of: " + roomB.getRoomStatus());

    }


}
