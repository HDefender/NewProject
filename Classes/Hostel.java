package PetProject.Classes;

import java.util.Objects;
public class Hostel {
    public int id;
    University university;
    boolean isAvailable;
    int totalCapacity;
    int currentCapacity;
    public Hostel(University university) {
        this.university = university;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hostel hostel = (Hostel) o;
        return id == hostel.id;
    }

    @Override
    public int hashCode() {
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

    public String getUniversityName (){
        return university.name;
    }


}
