public class SpeedConverter {

    public static void main(String[] args) {
        toMilesPerHour(1.5);
        toMilesPerHour(10.25);
        toMilesPerHour(-5.6);
        toMilesPerHour(25.42);
        toMilesPerHour(75.114);

        printConversion(1.5);
        printConversion(10.25);
    }

    public static long toMilesPerHour (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour * 0.621371);
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long mph = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        }
    }
}

