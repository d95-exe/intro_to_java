public class leap_or_not {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // Divisible by 400
            }
            return true; // Divisible by 4 but not 100
        }
        return false; // Not divisible by 4
    }
}
