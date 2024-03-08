package PetProject.Classes;

public class University {
    public String name;
    int id;
    int studyDuration;

    public University(String name) {
        this.id = id;
        this.name = name;
        this.studyDuration = studyDuration;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studyDuration=" + studyDuration +
                '}';
    }

    public String getName() {
        return name;
    }
}
