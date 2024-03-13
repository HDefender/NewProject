package PetProject.Classes;

public class Room {
    int id;
    // FIXME: 13.03.2024 Room уже обозначена в имени класса. В поле дублировать не стоит, это избыточно.
    //  Достаточно просто number
    int numberOfRoom;
    // FIXME: 13.03.2024 Срочно разбираться с инкапсуляцией
    public int totalCapacity;
    public int currentCapacity;
    boolean isAvailable;

    //gender
// FIXME: 13.03.2024 Следи за лишними строками. Две пустые строки не нужны примерно никогда

    public Room(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }


}
