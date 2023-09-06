package group4720.ognev.task2;

public abstract class WarmBlooded extends RunningJumping {

    public WarmBlooded(String name) {
        super(name);
    }

    public WarmBlooded(String name, int maxDistance, int maxHeightObstacle) {
        super(name, maxDistance, maxHeightObstacle);
    }


    @Override
    public boolean run(Treadmill treadmill) {
        return false;
    }

    @Override
    public boolean jump(Wall wall) {
        return false;
    }

}
