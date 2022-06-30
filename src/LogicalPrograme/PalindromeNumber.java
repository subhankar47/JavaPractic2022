package LogicalPrograme;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter A number");
        int no = reader.nextInt();

        int temp=no;
        int rev = 0;
        int rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(no==rev) {
            System.out.println(no+" Is a Palindrome Number");
        }
        else{
            System.out.println(no+" Is not a Palindrome Number");
        }
    }
}
