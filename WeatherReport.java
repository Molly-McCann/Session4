public class WeatherReport {
    public static void main(String[] args) {
        String weatherCondition = "rainy"; // Example weather condition

        if (weatherCondition.equalsIgnoreCase("sunny")) {
            System.out.println("It's a sunny day. Don't forget your sunscreen!");
        } else if (weatherCondition.equalsIgnoreCase("cloudy")) {
            System.out.println("It's a cloudy day. You might need an umbrella just in case.");
        } else if (weatherCondition.equalsIgnoreCase("rainy")) {
            System.out.println("It's a rainy day. Grab your umbrella and raincoat.");
        } else if (weatherCondition.equalsIgnoreCase("snowy")) {
            System.out.println("It's a snowy day. Wear warm clothes and be careful while driving.");
        } else {
            System.out.println("Weather conditions are unknown. Please check a reliable source for updates.");
        }
    }
}
