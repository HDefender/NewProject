package PetProject.Menu;

import PetProject.Classes.Hostel;
import PetProject.Classes.Room;
import PetProject.Classes.University;
import PetProject.Classes.User;
import PetProject.Exceptions.MenuIncorrectButtonException;
import PetProject.Exceptions.WrongInputException;
import PetProject.Service.*;

import java.util.*;

public class Menu {
    UniversityService universityService = new UniversityService(new ArrayList<>());
    HostelService hostelService = new HostelService(new ArrayList<>());
    UserService userService = new UserService(new ArrayList<>());
    RoomService roomService = new RoomService(new ArrayList<>());

    Scanner sc = new Scanner(System.in);
    public Menu() {
    }
    public void openAdminAuthorizationMenu (){
        System.out.println("------------------------------");
        System.out.println("This is admin authorization window");
        System.out.println("Print your login and password");
        System.out.println("------------------------------");
        System.out.print("Login: ");
        String inputLogin = sc.next();
        System.out.print("Password: ");
        String inputPassword = sc.next();
        System.out.println("------------------------------");

        if(inputLogin.equals("admin") && inputPassword.equals("123456789")){
            System.out.println("All data is correct!");
            doMainMenu();
        } else {
            System.out.println("Login or password is wrong!");
            openAdminAuthorizationMenu();
        }

    }
    public void doMainMenu() {
        System.out.println("-------------------------------------");
        System.out.println("This is Hostel Management System. Please check one of the follow buttons");
        System.out.println(MenuButton.ADD_PEOPLE_BUTTON_1);
        System.out.println(MenuButton.ADD_UNIVERSITY_BUTTON_2);
        System.out.println(MenuButton.ADD_HOSTEL_BUTTON_3);
        System.out.println(MenuButton.SORT_BUTTON_4);
        System.out.println(MenuButton.GET_INFO_ABOUT_STUDENTS_BUTTON_5);
        System.out.println(MenuButton.GET_INFO_ABOUT_UNIVERSITIES_BUTTON_6);
        System.out.println(MenuButton.GET_INFO_ABOUT_HOSTEL_BUTTON_7);
        System.out.println(MenuButton.EXIT_BUTTON_8);
        System.out.println("-------------------------------------");
        System.out.print("Your answer: ");

        int menuChoice = sc.nextInt();
        //sc.nextLine();
        if (menuChoice > 8 || menuChoice < 0) {
            throw new MenuIncorrectButtonException();
        }

            switch (menuChoice) {
                case 1:
                    AddPeople();
                case 2:
                    AddUniversity();
                case 3:
                    AddHostel();
                    //case 4:SortAll();
                case 5:
                    getInfoStudents();
                case 6:
                    getInfoUniversities();
                case 7:
                    getInfoHostels();
                case 8:
                    break;
            }
            //sc.close();
        }
    public void AddPeople() {
        System.out.println("-------------------------------------");
        System.out.println("Please choice one of follow variants: ");
        System.out.println(MenuAddPeople.ADD_STUDENT_BUTTON_1);
        System.out.println(MenuAddPeople.ADD_HOSTELKEEPER_BUTTON_2);
        System.out.println(MenuAddPeople.ADD_SECUIRITY_BUTTON_3);
        System.out.println(MenuAddPeople.BACK_TO_MENU_BUTTON_4);
        System.out.println("-------------------------------------");
        System.out.println("Your answer: ");
        int menuAddPeopleChoice = sc.nextInt();
        sc.nextLine();

        if (menuAddPeopleChoice > 4 || menuAddPeopleChoice < 0) {
            throw new MenuIncorrectButtonException();
        } else {
            switch (menuAddPeopleChoice) {
                case 1: AddStudent();
                case 2:

                case 4:
                    doMainMenu();
            }
        }
        //sc.close();
    }
    public void AddStudent() {
        System.out.println("Please write FIO of student");
        String FIO = sc.nextLine();
        //
        if (FIO == null || FIO.isEmpty()) { //если строка нулл
            throw new NullPointerException("This element is empty"); //выбрасываем исключение
        }
        userService.addUser(FIO);
        doMainMenu();
    }
    public void AddUniversity(){
        System.out.println("Please write name of university");
        String inputUniversityName = sc.next();
        if (inputUniversityName == null || inputUniversityName.isEmpty()) {
            throw new WrongInputException();
        }
            universityService.addUniversity(inputUniversityName);
            doMainMenu();

    }
    public void AddHostel(){
        System.out.println("Write university name of this hostel");
        String inputHostelName = sc.nextLine();
        if (inputHostelName == null || inputHostelName.isEmpty()) {
            throw new WrongInputException();
        }

        for (University u: universityService.getUniversities()){
            if(inputHostelName.equals(u.name)){
                hostelService.addCurrentHostel(u);
            }
            else {
                hostelService.addNewHostelbyName(inputHostelName);
            }
        }
            doMainMenu();
            }
    public void getInfoStudents() {
        userService.printInfo();
    }

    public void getInfoUniversities() {
        universityService.getUniversityListInfo();
    }

    public void getInfoHostels() {
        hostelService.getHostels();
    }

}

