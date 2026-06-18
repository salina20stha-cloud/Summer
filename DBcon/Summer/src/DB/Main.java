package DB;

import DB.Teacher;
import DB.Teacherservice;

public class Main {

    public static void main(String[] args) throws Exception {

        Teacherservice teacherService = new Teacherservice();

        Teacher teacher =
                new Teacher(4, "Binita Manandhar", "C++", 20000);

        teacherService.insert(teacher);
    }
}