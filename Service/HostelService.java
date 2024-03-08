package PetProject.Service;

import PetProject.Classes.Hostel;
import PetProject.Classes.Room;
import PetProject.Classes.University;
import PetProject.Menu.*;

import java.util.ArrayList;
import java.util.List;

public class HostelService {
    private final List<Hostel> hostels;

    public HostelService(List<Hostel> hostels) {
        this.hostels = new ArrayList<>(hostels);
    }
    public void addNewHostelbyName(String inputHostelName) { //метод добавления общежития
        Hostel hostel = new Hostel(new University(inputHostelName));

        if (hostels.isEmpty()) { // если список пустой
            hostels.add(hostel); // то добавляем общежитие
            System.out.printf("Hostel %d was added succesfully!", hostel.id); //сообщение о добавлении
        }
        else { //если список непустой
            System.out.printf("Hostel %d was added succesfully!", hostel.id); //сообщение об успешном добавлении
            hostels.add(hostel); //добавление в список
        }
    }

    public void addCurrentHostel (University university){
        Hostel hostel = new Hostel(university);

        if (hostels.isEmpty()) { // если список пустой
            hostels.add(hostel); // то добавляем общежитие
            System.out.printf("Hostel %d was added succesfully!", hostel.id); //сообщение о добавлении
        }
        else { //если список непустой
            System.out.printf("Hostel %d was added succesfully!", hostel.id); //сообщение об успешном добавлении
            hostels.add(hostel); //добавление в список
        }
    }

    public int countAllRooms (Hostel hostel, List<Room> roomServiceHostel){
        if (hostel == null && roomServiceHostel == null){
            throw new NullPointerException("Hostel or list is empty!");
        } else {
            System.out.println("Total amount of rooms are " + roomServiceHostel.size());
            return roomServiceHostel.size();
        }
    }
    public int countAllSeats (Hostel hostel, List<Room> roomServiceHostel){
        if (hostel == null && roomServiceHostel == null){
            throw new NullPointerException("Hostel or list is empty!");
        } else {
            int totalCounter = 0;
            for (Room room:roomServiceHostel){
                totalCounter += room.totalCapacity;
                //return totalCounter;
            }
            System.out.printf("Total amount of rooms are %d, total amount of seats are %d",
                    roomServiceHostel.size(), totalCounter);
            return totalCounter;
        }
    }
    public void countAvailableSeats (Hostel hostel, List<Room> roomServiceHostel) {
        if (hostel == null && roomServiceHostel == null){
            throw new NullPointerException("Hostel or list is empty!");
        } else {
            int availableCounter = 0;
            for (Room room:roomServiceHostel){
                availableCounter += room.currentCapacity;
            }
            System.out.printf("Total amount of rooms are %d, total amount of available seats are %d",
                    roomServiceHostel.size(), availableCounter);
        }
    }

    public List<Hostel> getHostels() {
        return hostels;
    }

    public void getHostelsInfo(){
        for (Hostel hostel:hostels){
            System.out.println(hostel.toString());
        }
    }
}
