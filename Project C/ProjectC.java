import java.util.Scanner;
import AI.Player;
class ProjectC {
    public static void main(String[] args){
        System.out.println("Hello Project C");
        Player P = new Player("AI Player 1");
        int sticks = 21;
        int pick = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting sticks: "+sticks);
        while (sticks > 0) {
            System.out.println("Remaining sticks: "+sticks);
            System.out.print("Pick one or two sticks (1-2): ");
            pick = sc.nextInt();
            sticks -= pick;
            if (sticks <= 0) {
                System.out.println("Human player loses.");
                break;
            }
            System.out.println("Remaining sticks: "+sticks);
            System.out.println(P.getName() + " picks one or two sticks (1-2): " + P.pick());
            sticks -= pick;
            if (sticks <= 0) {
                System.out.println(P.getName() + " loses.");
                break;
            }
        }
    }
}