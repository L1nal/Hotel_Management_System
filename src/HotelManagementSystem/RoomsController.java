package HotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomsController {
    public static void addNewRooms(ArrayList<Room> rooms, Scanner input){
        System.out.println("Enter Floor: ");
        int floor = input.nextInt();
        System.out.println("Enter Capacity: ");
        int capacity = input.nextInt();
        System.out.println("Enter Type: ");
        String type = input.next();
        System.out.println("Enter Description: ");
        String description = input.next();
        System.out.println("Enter Price: ");
        double price = input.nextDouble();
        int id = 1000 + rooms.size();
        Room room = new Room(id, floor, capacity, type, description, price);
        rooms.add(room);
        System.out.println(" Room added successfully. ");
        System.out.println((" Your Room Id is: " + id));
        System.out.println();
    }
    public static void showAllRooms(ArrayList<Room> rooms){
        for(Room room: rooms){
            System.out.println("-----------------------------------");
            room.print();
            System.out.println("-----------------------------------");
            System.out.println();
        }
    }
    public static void editRooms(ArrayList<Room> rooms, Scanner input){
        System.out.println("Enter room ID: \n-1 to show all rooms");
        int id = input.nextInt();
        if (id == -1) {
            showAllRooms(rooms);
            System.out.println("Enter room ID: \n-1 to show all rooms");
            int j = input.nextInt();
            id = j;
        }
        Room room = getRoomById(id, rooms);

        System.out.println("Enter floor: \n-1 to keep it");
        int floor = input.nextInt();
        if (floor == -1) floor = room.getFloor();

        System.out.println("Enter capacity: \n-1 to keep it");
        int capacity = input.nextInt();
        if (capacity == -1) capacity = room.getCapacity();

        System.out.println("Enter room type: \n-1 to keep it");
        String type = input.next();
        if (type.equals("-1")) type = room.getType();

        System.out.println("Enter room description: \n-1 to keep it");
        String description = input.next();
        if (description.equals("-1")) description = room.getDescription();

        System.out.println("Enter room price: \n-1 to keep it");
        double price = input.nextDouble();
        if (price == -1) price = room.getPrice();

        room.setFloor(floor);
        room.setCapacity(capacity);
        room.setType(type);
        room.setDescription(description);
        room.setPrice(price);

        for(Room r : rooms){
            if (r.getId() == id){
                r = room;
                break;
            }
        }
    }
    public static Room getRoomById(int id, ArrayList<Room> rooms){
        Room room = new Room();
        for(Room r : rooms){
            if(r.getId()==id){
                room = r;
                break;
            }
        }
        return room;
    }
}
