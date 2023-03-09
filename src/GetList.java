/**
 * D соответствии с
 * S - Single Responsibility Principle - принципом единственной ответственности.
 * Метод вынесен в отдельный класс
 */
import java.util.ArrayList;

public class GetList {
    public static ArrayList getList(int groupNumber) {
        String res = null;
        ArrayList stud = new ArrayList();
        for (Student st : School.list) {
            if (st.getGroup() == groupNumber) {
                res = "\n" + st.getName() + " " + st.getPhone();

            }
            stud.add(res);

        }
        return (stud);

    }
}
