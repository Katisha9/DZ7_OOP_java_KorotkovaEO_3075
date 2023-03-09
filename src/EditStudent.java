/**
 * D соответствии с
 * S - Single Responsibility Principle - принципом единственной ответственности.
 * Метод вынесен в отдельный класс
 */
public class EditStudent {
    public static String editStudent(String name, int phone, int group){
        for (Student st : School.list) {
            if (st.getName().equals(name)) {
                st.setName(name);
                st.setPhone(phone);
                st.setGroup(group);
                break;
            }

        }
        return ("Информация обновлена. ");
    }
}
