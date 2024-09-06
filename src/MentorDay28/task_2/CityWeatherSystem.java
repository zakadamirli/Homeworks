package MentorDay28.task_2;

import java.util.HashMap;
import java.util.Map;

public class CityWeatherSystem {
    private final Map<String, WeatherInfo> cityWeatherMap;

    public CityWeatherSystem() {
        this.cityWeatherMap = new HashMap<>();
    }

    public static void main(String[] args) {
        CityWeatherSystem cityWeatherSystem = new CityWeatherSystem();
        cityWeatherSystem.addCityWeather("Baku", new WeatherInfo(26.0, 53, "Cloudy"));
        cityWeatherSystem.addCityWeather("Kurdamir", new WeatherInfo(32.0, 26, "Sunny"));
        cityWeatherSystem.addCityWeather("Zaqatala", new WeatherInfo(22.0, 51, "Cloudy"));
        cityWeatherSystem.displayAllCitiesWeather();

        cityWeatherSystem.updateCityWeather("Kurdamir", new WeatherInfo(28.0, 32, "Partly Cloudy"));
        cityWeatherSystem.displayAllCitiesWeather();

        cityWeatherSystem.removeCityWeather("Baku");
        cityWeatherSystem.displayAllCitiesWeather();
    }

    public void addCityWeather(String city, WeatherInfo weatherInfo) {
        cityWeatherMap.put(city, weatherInfo);
    }

    public void removeCityWeather(String city) {
        if (cityWeatherMap.remove(city) != null) {
            System.out.println("Weather info for " + city + " removed");
        } else {
            System.out.println("City not found");
        }
    }

    public void updateCityWeather(String city, WeatherInfo weatherInfo) {
        if (cityWeatherMap.containsKey(city)) {
            cityWeatherMap.put(city, weatherInfo);
            System.out.println("Weather info for " + city + " updated");
        } else {
            System.out.println("City not found");
        }
    }

    public void getCityWeather(String city) {
        WeatherInfo weatherInfo = cityWeatherMap.get(city);
        if (weatherInfo != null) {
            System.out.println("Weather info for " + city + ": " + weatherInfo);
        } else {
            System.out.println("City not found");
        }
    }

    public void displayAllCitiesWeather() {
        if (cityWeatherMap.isEmpty()) {
            System.out.println("No cities in the system");
        } else {
            System.out.println("All cities' weather info:");
            cityWeatherMap.entrySet().stream().map(entry -> entry.getKey() + ": "
                    + entry.getValue()).forEach(System.out::println);
        }
    }
}
