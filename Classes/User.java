package PetProject.Classes;

import java.util.Objects;

public class User {
    int id;
    public String FIO;
    String login;
    String hashParole;
    String role;

    public User(String FIO) {
        this.FIO = FIO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(FIO, user.FIO);
    }

    @Override
    public int hashCode() {
        int result = FIO == null ? 0 : FIO.hashCode();
        result =  31 * result;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", FIO='" + FIO + '\'' +
                ", login='" + login + '\'' +
                ", hashParole='" + hashParole + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public String getFIO() {
        return FIO;
    }


}
