package HotelManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Room> rooms;
    private static ArrayList<Guest> guests;
    private static ArrayList<Employee> employee;
    private static ArrayList<Reservation> reservations;
    public static void main(String[] args) {
        rooms = new ArrayList<>();
        guests = new ArrayList<>();
        employee = new ArrayList<>();
        reservations = new ArrayList<>();
        int i = 0;
        while(i != 16){
            System.out.println("Welcome to Hotel Management System.");
            System.out.println(" 1. Add new room.");
            System.out.println(" 2. Show all rooms.");
            System.out.println(" 3. Edit room data.");
            System.out.println(" 4. Add new Guests.");
            System.out.println(" 5. Show all Guests.");
            System.out.println(" 6. Search guest by Name.");
            System.out.println(" 7. Edit guest Data.");
            System.out.println(" 8. Create new reservation.");
            System.out.println(" 9. Show all reservations.");
            System.out.println(" 10. Get reservation by Guest Name.");
            System.out.println(" 11. Get reservation by ID.");
            System.out.println(" 12. Edit reservation.");
            System.out.println(" 13. Add new Employee. ");
            System.out.println(" 14. Show all Employees");
            System.out.println(" 15. Edit Employee");
            System.out.println(" 16. Quit.");
            System.out.println();
            System.out.print("Enter your option: ");

            Scanner input = new Scanner(System.in);
            i = input.nextInt();
            switch (i) {
                case 1:
                    RoomsController.addNewRooms(rooms, input);
                    break;
                case 2:
                    RoomsController.showAllRooms(rooms);
                    break;
                case 3:
                    RoomsController.editRooms(rooms, input);
                    break;
            }

        }
    }
}
