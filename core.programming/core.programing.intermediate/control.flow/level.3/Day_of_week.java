import java.util.*;

public class Day_of_week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();
        String dayName;

        switch (m) {
            case 1:
                dayName = "January";
                break;
            case 2:
                dayName = "February";
                break;
            case 3:
                dayName = "March";
                break;
            case 4:
                dayName = "April";
                break;
            case 5:
                dayName = "May";
                break;
            case 6:
                dayName = "June";
                break;
            case 7:
                dayName = "July";
                break;
            case 8:
                dayName = "August";
                break;
            case 9:
                dayName = "September";
                break;
            case 10:
                dayName = "October";
                break;
            case 11:
                dayName = "November";
                break;
            case 12:
                dayName = "December";
                break;
            default:
                dayName = "Invalid month number";
        }
        int yo = y - (14 - m) / 12;
        int x = yo + yo / 4 - yo / 100 + yo / 400;
        int mo = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * mo / 12) % 7;
        String dayOfWeek;
        switch (d0) {
            case 0:
                dayOfWeek = "sunday";
                break;
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "saturday";
                break;

            default:
                dayOfWeek = "Invalid day number";
        }
        System.out.println("The day of the week for " + dayName + " " + d + ", " + y + " is: " + dayOfWeek);

    }

}
