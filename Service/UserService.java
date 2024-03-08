package PetProject.Service;

import PetProject.Classes.Hostel;
import PetProject.Classes.University;
import PetProject.Classes.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class UserService {
    private List<User> users; // создаем список пользователей

    public UserService(List<User> users) { //конструктор
        this.users = new ArrayList<>(users);
    }

    public void addUser(String FIO) { //метод добавления пользователя по ФИО
        User newUser = new User(FIO);//создаем пользователя
        boolean isEqual = false;
        for (User user : users) { //для всех элементов списка
            if (user.FIO.equals(FIO)) { //если поле ФИО у элемента совпадает с переданным в метод ФИО
                System.out.println("This user always had been"); //сообщение о существующем элементе с таким ФИО
                isEqual = true;
                break;
            }
        }
        if (users.isEmpty()) { // если список пустой
            users.add(newUser); // то добавляем пользователя
            System.out.printf("User %s was added succesfully!\n", newUser.FIO);
        }
        if (!isEqual) {
            System.out.printf("User %s was added succesfully!\n", newUser.FIO);
            users.add(newUser); //добавление в список
        }

    }




    public void addUserAsObject(User newUser) {
        if (users.isEmpty()) { // если список пустой
            users.add(newUser); // то добавляем пользователя
            System.out.printf("User %s was added succesfully!\n", newUser.FIO); //сообщение о добавлении
        } else {
            users.add(newUser);
            System.out.printf("User %s was added succesfully!\n", newUser.FIO);
        }


    }

    public void deleteUser(String FIO) { //метод удаления пользователя по ФИО
        if (FIO == null) { //если переданная строка нулл
            throw new NullPointerException("This element is empty"); //выбрасываем исключение
        } else {
            for (User user : users) { //для всех элементов списка
                if (user.FIO.equals(FIO)) { //если поле ФИО у элемента совпадает с переданным в метод ФИО
                    System.out.println("User was found and removed succesfully!"); //сообщение об успешном удалении пользователя
                    users.remove(user); //удаление пользователя
                    break; //принудительное окончание
                } else {
                    System.out.println("This user wasn't found and wasn't be in list"); //
                }
            }
        }
    }

    public List<User> getAllUsersInfo() {
        for (User user:users){
            System.out.println("All users info " + user.toString());
        }
        return users;
    }

    public void printInfo(){
        System.out.println("Collection size is " + users.size() + " elements");
        System.out.println(users);
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUser(String FIO) {
        if (FIO == null) { //если строка нулл
            throw new NullPointerException("This element is empty"); //выбрасываем исключение
        }
        for (User user : users) { //для всех элементов списка
            if (user.FIO.equals(FIO)) { //если поле ФИО у элемента совпадает с переданным в метод ФИО
                System.out.println("This user was found"); //сообщение о существующем элементе с таким ФИО
                System.out.println("User Info" + user.toString());
                return user;
            }
        }
        return null;
    }

    public void doSize(){
        System.out.println(users.size());
    }

}
