package PetProject;
// FIXME: 13.03.2024 где .gitignore? В гит-репу не должен попадать ни iml-файл, ни папка .idea со своим содержимым 
//  - это твои локальные настройки

// FIXME: 13.03.2024 пакеты в Java именуются только маленькими буквами
import PetProject.Menu.Menu;

// FIXME: 13.03.2024 Отсутствует структура проекта. src, resource и т.д.

// FIXME: 13.03.2024 Структура пакетов не соотвтетсвует стандарту (доменное имя наоборот, далее пакеты с полезной нагрузкой)
//  Т.е. твой класс Main должен лежать в пакете вроде com.bulatziganshin.dormitory.
//  Все остальные - в подпакетах от указанного
public class Main {
    public static void main(String[] args) {
// FIXME: 13.03.2024 Создание переменной здесь избыточно
        Menu menu = new Menu();
        menu.openAdminAuthorizationMenu();

    }
}
