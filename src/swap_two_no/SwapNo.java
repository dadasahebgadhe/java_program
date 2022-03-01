package swap_two_no;

import java.util.Scanner;

public class SwapNo {

    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter any two no.");
        Scanner o=new Scanner(System.in);
        a=o.nextInt();
        b=o.nextInt();
        System.out.println("Before swapping  "+a+"  "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping  "+a+"  "+b);


    }

}
