package group4720.ognev.task2;

public class Robott extends RunningJumping {

    public Robott(String name) {
        super(name);
        setMaxDistance(60000);
        setMaxHeightObstacle(300);
    }

    public Robott(String name, int maxDistance, int maxHeightObstacle) {
        super(name, maxDistance, maxHeightObstacle);
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getLongTrack() <= getMaxDistance()) {
            System.out.println("Робот " + name + " пробежал "
                    + treadmill.getLongTrack() + " м.");
            return true;
        } else {
            System.out.println("Дистанцию " + treadmill.getLongTrack()
                    + " м., не смог преодолеть "
                    + "Робот " + name);

            return false;
        }

    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeightWall() <= getMaxHeightObstacle()) {
            System.out.println("Робот "
                    + name
                    + " перепрыгнул через препятствие высотой "
                    + wall.getHeightWall()
                    + " см.");
            return true;
        } else {
            System.out.println("Стену высотой "
                    + wall.getHeightWall()
                    + " см., не смог преодолеть "
                    + "робот "
                    + name);

            return false;
        }
    }

    @Override
    public String toString() {
        return "Робот " + name + " {" +
                "Может пробежать=" + getMaxDistance() +
                " метров, Может перепрыгнуть=" + getMaxHeightObstacle() + " см.}";
    }
}
