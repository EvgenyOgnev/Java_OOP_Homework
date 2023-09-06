package group4720.ognev.task2;

public abstract class RunningJumping {
    protected String name;
    private int maxDistance;
    private int maxHeightObstacle;

    public RunningJumping(String name) {
        this.name = name;
    }

    public RunningJumping(String name, int maxDistance, int maxHeightObstacle) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeightObstacle = maxHeightObstacle;
    }


    public String getName() {
        return name;
    }


    public abstract boolean run(Treadmill treadmill);


    public abstract boolean jump(Wall wall);


    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxHeightObstacle() {
        return maxHeightObstacle;
    }

    public void setMaxHeightObstacle(int maxHeightObstacle) {
        this.maxHeightObstacle = maxHeightObstacle;
    }

}
