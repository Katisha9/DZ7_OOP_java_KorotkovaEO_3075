// меню для клиента вынесено в отдельный класс

public class UserMenu {
    String menu = "Выберите пункт меню:\n1 - добавить ученика\n2 - удалить ученика\n" +
            "3 - показать список учеников класса\n4 - редактировать данные\n" +
            "0 - выход.";

    public String userMenu() {
        return menu;
    }

    @Override
    public String toString() {
        return menu;
    }
}

