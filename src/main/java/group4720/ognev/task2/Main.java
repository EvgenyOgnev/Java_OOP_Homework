package group4720.ognev.task2;
/*
Домашнее задание:
1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса,
но есть общий класс родитель. Эти классы должны уметь бегать и прыгать, все также с выводом
информации о действии в консоль.
2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
списку он препятствий не идет.
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Object> obstacles = new ArrayList<>();
        ArrayList<RunningJumping> members = new ArrayList<>();
        ArrayList<RunningJumping> membersEnd = new ArrayList<>();

        RunningJumping robot1 = new Robott("ROBOT1", 17000, 193);
        RunningJumping robot2 = new Robott("ROBOT2");
        members.add(robot1);
        members.add(robot2);

        WarmBlooded human1 = new Human("HUMAN1");
        Human human2 = new Human("HUMAN2", 9000, 167);
        members.add(human1);
        members.add(human2);

        WarmBlooded cat1 = new Cat("CAT1");
        Cat cat2 = new Cat("CAT2", 5170, 230);
        members.add(cat1);
        members.add(cat2);

        Treadmill treadmill1000 = new Treadmill(1000);
        Treadmill treadmill2700 = new Treadmill(2700);
        Treadmill treadmill5100 = new Treadmill(5100);
        Treadmill treadmill600 = new Treadmill(600);
        obstacles.add(treadmill600);
        obstacles.add(treadmill1000);
        obstacles.add(treadmill2700);
        obstacles.add(treadmill5100);


        Wall wall130 = new Wall(130);
        Wall wall193 = new Wall(193);
        Wall wall217 = new Wall(217);
        obstacles.add(wall130);
        obstacles.add(wall193);
        obstacles.add(wall217);

        System.out.println("Список всех участников:");
        for (RunningJumping member : members) {
            System.out.println(member.toString());
        }

        membersEnd = (ArrayList<RunningJumping>) members.clone();

        System.out.println();
        System.out.println("<<<<<<<СТАРТ>>>>>>>");
        for (RunningJumping member : members) {
            for (Object object : obstacles) {
                if (object instanceof Wall) {
                    if (!member.jump((Wall) object)) {
                        membersEnd.remove(member);
                        break;
                    }
                } else if (object instanceof Treadmill) {
                    if (!member.run((Treadmill) object)) {
                        membersEnd.remove(member);
                        break;
                    }
                }
            }
        }
        System.out.println("<<<<<<<ФИНИШ>>>>>>>");

        System.out.println();
        System.out.println("Список дошедших до финиша:");
        for (RunningJumping member : membersEnd) {
            System.out.println(member.toString());
        }

    }
}
