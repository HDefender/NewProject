package PetProject.Classes;
// FIXME: 13.03.2024 пакеты именуются в ед.ч. Кроме того, class - очень неудачное имя пакета.
//  У тебя в любом пакете лежат классы:)

import java.util.Objects;// FIXME: 13.03.2024 ниже не хватает пустой строки
public class Hostel {
    // FIXME: 13.03.2024 поля - private
    public int id;
    University university;
    boolean isAvailable;
    int totalCapacity;
    int currentCapacity;// FIXME: 13.03.2024 поля отделяются от конструкторов и прочего пустой строкой.
    // Конструкторы и методы между собой тоже разделяются пустой строкой
    public Hostel(University university) {
        this.university = university;
    }

    @Override
    public boolean equals(Object o) {
        // FIXME: 13.03.2024 Никаких if, циклов и прочего без {}. Даже если внутри блока одна строка.
        //  Даже если это идеевская автогенерация
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hostel hostel = (Hostel) o;
        return id == hostel.id;
    }

    @Override
    public int hashCode() {
        // FIXME: 13.03.2024 у тебя интовый айдишник. С тем же успехом можно было просто `return id;` написать:)
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "id=" + id +
                ", university=" + university +
                ", isAvailable=" + isAvailable +
                ", totalCapacity=" + totalCapacity +
                ", currentCapacity=" + currentCapacity +
                '}';
    }

    // FIXME: 13.03.2024 После имени метода пробел не ставится
    public String getUniversityName (){
        return university.name;
    }// FIXME: 13.03.2024 Ниже лишняя пустая строка


}
