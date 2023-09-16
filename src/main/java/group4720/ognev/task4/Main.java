package group4720.ognev.task4;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Иванов", "Иван", 35, "химия");
        Teacher teacher2 = new Teacher("Иванов", "Иван", 33, "динамика");
        Teacher teacher3 = new Teacher("Иванов", "Александр", 45, "физика");
        Teacher teacher4 = new Teacher("Петров", "Петр", 36, "машины и аппараты");
        Teacher teacher5 = new Teacher("Сидоров", "Сидор", 39, "химия");


        TeacherService teachersList = new TeacherService();

        teachersList.create(teacher1);
        teachersList.create(teacher2);
        teachersList.create(teacher3);
        teachersList.create(teacher4);
        teachersList.create(teacher5);
        System.out.println("teachersList.getAll() = " + teachersList.getAll());

        new  TeacherView<>().sendOnConsole(teachersList.getAll());

        teachersList.remove(teacher2);


        new  TeacherView<>().sendOnConsole(teachersList.getAll());

        teachersList.editTeacherData(1, "иванов", "Яковлев");

        new  TeacherView<>().sendOnConsole(teachersList.getAll());


    }

}
