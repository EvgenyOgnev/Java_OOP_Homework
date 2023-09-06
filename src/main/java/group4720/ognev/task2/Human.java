package group4720.ognev.task2;

public class Human extends WarmBlooded {

    public Human(String name) {
        super(name);
        setMaxDistance(25000);
        setMaxHeightObstacle(270);
    }

    public Human(String name, int maxDistance, int maxHeightObstacle) {
        super(name, maxDistance, maxHeightObstacle);
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getLongTrack() <= getMaxDistance()) {
            System.out.println("Человек "
                    + name
                    + " пробежал "
                    + treadmill.getLongTrack() + " м.");
            return true;
        } else {
            System.out.println("Дистанцию "
                    + treadmill.getLongTrack()
                    + " м., не смог преодолеть "
                    + "человек " + name);

            return false;
        }
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeightWall() <= getMaxHeightObstacle()) {
            System.out.println("Человек "
                    + name
                    + " перепрыгнул через препятствие высотой "
                    + wall.getHeightWall()
                    + " см.");
            return true;
        } else {
            System.out.println("Стену высотой "
                    + wall.getHeightWall()
                    + " см., не смог преодолеть "
                    + "человек "
                    + name);

            return false;
        }
    }

    @Override
    public String toString() {
        return "Человек " + name + " {" +
                "Может пробежать=" + getMaxDistance() +
                " метров, Может перепрыгнуть=" + getMaxHeightObstacle() +
                " см.}";
    }
}
