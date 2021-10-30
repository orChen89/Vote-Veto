import java.util.Scanner;

public class VoteVeto {
    public static void main(String[] args) {
    
        int vote1 = 0;
        int vote2 = 0;
        int vote3 = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
        
            System.out.print("please choose your vote: ");
            int input = scanner.nextInt();
            
            if (input == 4){
                System.out.println("The country that voted 'Veto' is country number " + i);
                return;
            } else if (input == 1) {
                vote1++;
            } else if (input == 2) {
                vote2++;
            } else if (input == 3) {
                vote3++;
            }

            } System.out.println("The total 'In favor' votes are: " + vote1);
              System.out.println("The total 'against' votes are: " + vote2);
              System.out.println("The total 'abstaining' votes are: " + vote3);
        }
    }
