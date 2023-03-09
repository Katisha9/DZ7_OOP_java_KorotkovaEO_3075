/**
 * D соответствии с
 * S - Single Responsibility Principle - принципом единственной ответственности.
 * Метод вынесен в отдельный класс
 */

public class ListStudent extends School {

        public static String listStudent(String name, int phone, int group) {

            Student st = new Student(name, phone, group);
            list.add(st);
            return "Ученик добавлен. ";

        }
    }

