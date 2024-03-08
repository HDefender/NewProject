package PetProject.Service;

import PetProject.Classes.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    List<Room> roomServiceHostel;

    public RoomService(List<Room> roomServiceHostel) {
        this.roomServiceHostel = new ArrayList<>(roomServiceHostel);
    }


}
