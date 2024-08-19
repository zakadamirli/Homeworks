package MentorDay23.Traffic_Light_ystem_Simulation;

public enum TrafficLight {
    RED(1000),
    YELLOW(2000),
    GREEN(4000);
    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
