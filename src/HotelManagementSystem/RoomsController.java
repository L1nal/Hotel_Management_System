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
        Room room = new Room(rooms.size(), floor, capacity, type, description, price);
        rooms.add(room);
        System.out.println(" Room added successfully. ");
    }
    public static void showAllRooms(ArrayList<Room> rooms){
        for(Room room: rooms){
            room.print();
            System.out.println();
        }

    }
}
