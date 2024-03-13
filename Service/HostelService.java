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
    }// FIXME: 13.03.2024 Пустая строка, by в методе ниже - в большой буквы

    // FIXME: 13.03.2024 addNewHostelbyName - чем это информативнее, чем addByName()? 
    //  Что добавляем - понятно из названия класса, не новую общагу ты в текущей модели в принципе не добавишь:)
    public void addNewHostelbyName(String inputHostelName) { //метод добавления общежития
        // FIXME: 13.03.2024 т.е. под каждую общагу создается свой объект университета? Зачем? 
        //  Лучше оперировать и связывать сущности через id
        Hostel hostel = new Hostel(new University(inputHostelName));

        if (hostels.isEmpty()) { // если список пустой
            // FIXME: 13.03.2024 Избыточные комментарии. Зачем дублировать по-русски ровно то же, что написано на Java?
            hostels.add(hostel); // то добавляем общежитие 
            System.out.printf("Hostel %d was added succesfully!", hostel.id); //сообщение о добавлении
        }// FIXME: 13.03.2024 а разница между содержимым if и else в чем?)
        else { //если список непустой
            System.out.printf("Hostel %d was added succesfully!", hostel.id); //сообщение об успешном добавлении
            hostels.add(hostel); //добавление в список
        }
    }

    public void addCurrentHostel (University university){
        Hostel hostel = new Hostel(university);
// FIXME: 13.03.2024 в чем смысл этого метода?)
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
            // FIXME: 13.03.2024 уже говорил, этот эксепшн сами никогда не бросаем
            throw new NullPointerException("Hostel or list is empty!");
        } else { // FIXME: 13.03.2024 зачем тут else? если зайдет в if - сюда уже ни при каких условиях не дойдет
            System.out.println("Total amount of rooms are " + roomServiceHostel.size());
            return roomServiceHostel.size();
        }
    }// FIXME: 13.03.2024 пустые строки между методами
    public int countAllSeats (Hostel hostel, List<Room> roomServiceHostel){
        if (hostel == null && roomServiceHostel == null){
            throw new NullPointerException("Hostel or list is empty!");
        } else { // FIXME: 13.03.2024 не нужен тебе else, если во всех if-блоках выше содержится return/throw
            int totalCounter = 0;
            // FIXME: 13.03.2024 автоформатирование - ctrl+alt+L
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

    // FIXME: 13.03.2024 printAll или что-то такое. Но вообще - это не должно быть ответственностью данного сервиса
    public void getHostelsInfo(){
        for (Hostel hostel:hostels){
            System.out.println(hostel.toString());
        }
    }
}
