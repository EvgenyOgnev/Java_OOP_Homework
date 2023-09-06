package group4720.ognev.task2;

public class Cat extends WarmBlooded {
    public Cat(String name) {
        super(name);
        setMaxDistance(700);
        setMaxHeightObstacle(170);
    }

    public Cat(String name, int maxDistance, int maxHeightObstacle) {
        super(name, maxDistance, maxHeightObstacle);
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getLongTrack() <= getMaxDistance()) {
            System.out.println("Кот " + name + " пробежал " + treadmill.getLongTrack() + " м.");
            return true;
        } else {
            System.out.println("Дистанцию " + treadmill.getLongTrack()
                    + " м., не смог преодолеть "
                    + "кот " + name);

            return false;
        }
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeightWall() <= getMaxHeightObstacle()) {
            System.out.println("Кот "
                    + name
                    + " перепрыгнул через препятствие высотой "
                    + wall.getHeightWall()
                    + " см.");
            return true;
        } else {
            System.out.println("Стену высотой "
                    + wall.getHeightWall()
                    + " см., не смог преодолеть "
                    + "кот "
                    + name);

            return false;
        }
    }

    @Override
    public String toString() {
        return "Кот " + name + " {" +
                "Может пробежать=" + getMaxDistance() +
                " метров, Может перепрыгнуть=" + getMaxHeightObstacle() +
                " см.}";
    }

}
