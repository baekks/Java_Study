package sec2;

public class Job {
    private final String name;
    private final int requiredTime;
    private final int priority;

    public String getName() {
        return name;
    }

    public int getRequiredTime() {
        return requiredTime;
    }

    public int getPriority() {
        return priority;
    }

    public Job(String name, int requiredTime, int priority) {
        this.name = name;
        this.requiredTime = requiredTime;
        this.priority = priority;
    }
}
