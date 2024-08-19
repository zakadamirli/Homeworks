package MentorDay23.Traffic_Light_ystem_Simulation;

public class TrafficLightController {
    private TrafficLight currentState;

    public TrafficLightController() {
        this.currentState = TrafficLight.RED;
    }

    public void nextState() {
        if (this.currentState == TrafficLight.RED) {
            this.currentState = TrafficLight.YELLOW;
        } else if (this.currentState == TrafficLight.YELLOW) {
            this.currentState = TrafficLight.GREEN;
        } else if (this.currentState == TrafficLight.GREEN) {
            this.currentState = TrafficLight.RED;
        }
    }

    public TrafficLight getCurrentState() {
        return this.currentState;
    }

    public int getCurrentStateDuration() {
        return currentState.getDuration();
    }

    public void runSimulation(int cycles) {
        for (int i = 0; i < cycles; i++) {
            System.out.println("Current State: " + getCurrentState() + " Duration: " + getCurrentStateDuration() + " m.sec");
            nextState();
            try {
                Thread.sleep(getCurrentStateDuration());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
