import java.time.*;

public class Greetings {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        int Hour = time.getHour();
        System.out.println(Hour);

        if (Hour >= 0 && Hour <= 6) {
            System.out.println("Early Morning");
        } else if (Hour >= 7 && Hour <= 11) {
            System.out.println("Good Morning");
        } else if (Hour >= 12 && Hour <= 16) {
            System.out.println("Good Afternoon");
        } else if (Hour >= 17 && Hour <= 19) {
            System.out.println("Good Evening");
        } else if (Hour >= 20 && Hour <= 23) {
            System.out.println("Good Night");
        } else {
            System.out.println("Not working");
        }
    }
}
