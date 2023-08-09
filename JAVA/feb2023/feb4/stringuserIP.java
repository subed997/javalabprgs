package feb23.feb4;

import java.util.Scanner;

public class stringuserIP {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userinput = scan.nextLine();
        System.out.println("you entered: "+ userinput);
        scan.close();
    }
}