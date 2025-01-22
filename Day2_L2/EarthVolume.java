public class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378;
        double pi = 3.14159;
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radius, 3);
        double volumeMiles3 = volumeKm3 * 0.239913;
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}