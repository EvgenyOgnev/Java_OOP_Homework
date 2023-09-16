package group4720.ognev.task4;

public class Teacher extends User{

    String teacherSubject;


    public Teacher(String surname, String name, int age, String teacherSubject) {
        super(surname, name, age);
        this.teacherSubject = teacherSubject;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    @Override
    public String toString() {
        return "Преподаватель {" + super.toString() +
                ", Преподает предмет='" + teacherSubject + "' }";
    }
}
