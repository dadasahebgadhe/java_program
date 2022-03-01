package check_armstrong;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        int n,reminder,arm=0,c;

        System.out.println("Enter any no.");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        c=n;

        while (n>0){
            reminder=n%10;
            arm=(reminder*reminder*reminder)+arm;
            n=n/10;
        }

        if(c==arm)
            System.out.println("This no. is Armstrong");
        else
            System.out.println("Not a Armstrong no.");

    }
}
