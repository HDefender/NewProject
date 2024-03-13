package PetProject.Service;

import PetProject.Classes.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityService {
    private final List<University> universities; // создаем список университетов

    public UniversityService(List<University> universities) {
        this.universities = new ArrayList<>(universities);
    }

    // FIXME: 13.03.2024 поправь замечания, аналогичные с HosletService'ом и отформатируй кодяру)
    //  после посмотрю этот сервис
    public void addUniversity (String universityName){ //метод добавления университета по названию
        University newUni = new University(universityName);//создаем пользователя
        boolean isEqual = false;
        for (University university:universities){ //для всех элементов списка
            if (university.name.equals(universityName)){ //если поле ФИО у элемента совпадает с переданным в метод ФИО
                System.out.println("This university always had been"); //сообщение о существующем элементе с таким ФИО
                isEqual = true;
                break;
            }
        }
        if (universities.isEmpty()){ // если список пустой
            universities.add(newUni); // то добавляем пользователя
            System.out.printf("University %s was added succesfully!\n", newUni.name); //сообщение о добавлении
        }
        if (!isEqual) { //иначе
            System.out.printf("University %s was added succesfully!\n", newUni.name); //сообщение об успешном добавлении
            universities.add(newUni); //добавление в список
        }
    }
    public void deleteUniversity (String universityName){ //метод удаления университета по имени
        if (universityName == null){ //если переданная строка нулл
            throw new NullPointerException("This element is empty"); //выбрасываем исключение
        } else {
            for (University university: universities){ //для всех элементов списка
                if (university.name.equals(universityName)){ //если поле названия у элемента совпадает с переданным в метод названием
                    System.out.println("University was found and removed succesfully!"); //сообщение об успешном удалении университета
                    universities.remove(university); //удаление университета
                    break; //принудительное окончание
                } else {
                    System.out.println("This university wasn't found and wasn't be in list"); //
                }
            }
        }
    }

    public List<University> getUniversityListInfo (){
        for (University university: universities){
            System.out.println("University info "+ university.toString());
        }
        return universities;
    }

    public List<University> getUniversities() {
        return universities;
    }
}
