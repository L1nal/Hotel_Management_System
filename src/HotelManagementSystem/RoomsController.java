package HotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomsController {
    public static void AddNewRoom(ArrayList<Room> rooms, Scanner scanner){
        System.out.println("Enter Floor: ");
        int floor = scanner.nextInt();
        System.out.println("Enter Capacity: ");
        int capacity = scanner.nextInt();
        System.out.println("Enter Type: ");
        String type = scanner.next();
        System.out.println("Enter Description: ");
        String description = scanner.next();
        System.out.println("Enter Price: ");
        double price = scanner.nextDouble();
        Room room = new Room(rooms.size(), floor, capacity, type, description, price);
        rooms.add(room);
        System.out.println(" Room added successfully. ");



    }
}
