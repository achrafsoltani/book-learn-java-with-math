import java.util.Scanner;
import java.time.LocalDate;
class ProjectB {
    public static void main(String[] args){
        System.out.println("Hello Project B");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birthday:");
        System.out.print("What is the month (1-12) ? ");
        int month = sc.nextInt();
        System.out.print("What is the day (1-30) ? ");
        int day = sc.nextInt();
        int rank = 30 * month + day;
        System.out.println(day+"/"+month+" is day #"+rank+" of 365.");

        LocalDate localDate = LocalDate.now();
        int today = localDate.getDayOfYear();
        int diff = 0;
        if(today < rank){
            diff = rank - today;
        } else if (today > rank) {
            diff = 365 - (today - rank);
        } else {
            diff = 0;
        }

        System.out.println("Your next birthday is in "+diff+" days, counted from today.");
    }
}