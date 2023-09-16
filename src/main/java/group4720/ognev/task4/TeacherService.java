package group4720.ognev.task4;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{

    private List<Teacher> teachersList;


    public TeacherService() {
        this.teachersList = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachersList;
    }

    @Override
    public void create(Teacher o) {
        teachersList.add(o);
        if (teachersList.size() > 1 ) {
            teachersList.sort(new UserComporator<>());
        }
    }

    @Override
    public void remove(Teacher o) {
        System.out.println("Из списка удален: " + o.toString());
        teachersList.remove(o);
    }

    public void editTeacherData (int number, String teacherData, String newTeacherData){
        System.out.println("Изменены данные: " + "'" + teacherData + "'" + " на "
                +  "'" + newTeacherData + "'"  + " у "
                + teachersList.get(number - 1).toString());
        if (teacherData.equalsIgnoreCase(teachersList.get(number - 1).getSurname())) {
            teachersList.get(number - 1).setSurname(newTeacherData);
        } else if (teacherData.equalsIgnoreCase(teachersList.get(number - 1).getName())) {
            teachersList.get(number - 1).setName(newTeacherData);
        } else if (teacherData.equalsIgnoreCase(teachersList.get(number - 1).getTeacherSubject())) {
            teachersList.get(number - 1).setTeacherSubject(newTeacherData);
        }
        if (teachersList.size() > 1 ) {
            teachersList.sort(new UserComporator<>());
        }
    }

}
