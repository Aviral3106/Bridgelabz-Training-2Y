package java_codes;

public class earthvolume{
    public static void main(String[] args) {
        double radiusKm = 6378; // radius of Earth in km
        double kmToMiles = 0.621371; // 1 km = 0.621371 miles

        // Volume of sphere formula: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles, then compute volume
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}


