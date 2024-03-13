package PetProject.Classes;

import java.util.Objects;

public class User {
    int id;
    // FIXME: 13.03.2024 никаких русских обозначений
    public String FIO;
    String login;
    // FIXME: 13.03.2024 passwordHash. Или просто password. 
    //  Его все равно никто в здравом уме не будет хранить в plain text
    String hashParole;
    // FIXME: 13.03.2024 Разве у тебя под роли не заведен енам?
    String role;

    public User(String FIO) {
        this.FIO = FIO;
    }

    @Override
    public boolean equals(Object o) {
        // FIXME: 13.03.2024 Однотипные замечания дублировать не буду
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        // FIXME: 13.03.2024 у тебя есть id. Который по логике вещей уникален. Зачем ориентироваться на ФИО? А если тезки?
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
