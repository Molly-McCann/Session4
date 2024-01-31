public class Thermostat {
    public static void main(String[] args) {
        int currentTemperature = 72; // Example current temperature in degrees Fahrenheit

        if (currentTemperature < 68) {
            // If the temperature is less than 68°F, turn on the heater
            System.out.println("Turning on the heater to warm up.");
        } else if (currentTemperature >= 68 && currentTemperature <= 72) {
            // If the temperature is between 68°F and 72°F, keep the thermostat in normal mode
            System.out.println("Thermostat is in normal mode.");
        } else {
            // If the temperature is above 72°F, turn on the air conditioner
            System.out.println("Turning on the air conditioner to cool down.");
        }
    }
}
