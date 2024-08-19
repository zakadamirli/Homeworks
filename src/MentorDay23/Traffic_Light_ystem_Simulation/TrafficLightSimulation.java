package MentorDay23.Traffic_Light_ystem_Simulation;

public class TrafficLightSimulation {
    public static void main(String[] args) {

        TrafficLightController controller = new TrafficLightController();
//        for (int i = 0; i < 9; i++) {
//            System.out.println("Current State: " + controller.getCurrentState() + " Duration: " + controller.getCurrentStateDuration()+"m.sec");
//            controller.nextState();
//            try {
//                Thread.sleep(controller.getCurrentStateDuration());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

//        3 cycles = 9 transitions
        controller.runSimulation(9);
    }
}

