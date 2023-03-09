/**
 * D соответствии с
 * S - Single Responsibility Principle - принципом единственной ответственности.
 * Метод вынесен в отдельный класс
 */


public class DelFromList extends School{
    public static String delFromList(String name, int phone) {
        boolean result = false;
        for (Student st : list) {
            if (st.getName().equals(name) && st.getPhone() == phone) {
                list.remove(st);
                result = true;
                break;
            }
        }
        if (result) {
            return "Ученик удален из списка! ";
        } else {
            return "Ученик не обнаружен. ";
        }

    }
}
