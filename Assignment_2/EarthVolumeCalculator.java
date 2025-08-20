public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378; // Radius of Earth in kilometers
        double pi = Math.PI; // Value of pi from the Math library

        // Calculate volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert volume to cubic miles (1 km = 0.621371 miles, so 1 km^3 = (0.621371)^3 miles^3)
        double kmToMiles = 0.621371;
        double volumeMiles = volumeKm * Math.pow(kmToMiles, 3);

        // Print the results
        System.out.printf(
            "The volume of Earth in cubic kilometers is %.2e km³ and cubic miles is %.2e mi³",
            volumeKm, volumeMiles
        );
    }
}