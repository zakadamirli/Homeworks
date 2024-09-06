package MentorDay28.task_2;

public class WeatherInfo {
    private double temperature;
    private int humidity;
    private String condition;

    public WeatherInfo(double temperature, int humidity, String condition) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", condition='" + condition + '\'' +
                '}';
    }
}
