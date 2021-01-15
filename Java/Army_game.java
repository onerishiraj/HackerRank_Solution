
import java.util.Scanner;

public class Army_game {
public static void main(String args[])   {
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int m = input.nextInt();
    int res =(int) (Math.ceil((n*m)/4));
    System.out.println(res);
}
}

@ Rishikesh Kumar