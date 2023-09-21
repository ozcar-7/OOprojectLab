public class Lab2q1 
{
    public static void main(String args[]) 
    {
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");

        System.out.println("roomA room number is " + roomA.getRoomNumber() + " and the room type is " + roomA.getRoomType());
        System.out.println("roomB room number is " + roomB.getRoomNumber() + " and the room type is " + roomB.getRoomType());

    }


}
