import java.util.Scanner;

/**
 * Created by HXHAIR on 2017/3/16.
 */
public class prime_number {
    public static void main(String[] args) {
        System.out.print("enter and number: ");
        Scanner s=new Scanner(System.in);
        int num=Integer.parseInt(s.next());

        int i;
        for( i=2;i<num;i++)
        {
            if(num%i==0)
                break;
        }
        if(i==num)
            System.out.println("Is Prime");
        else
            System.out.println("Is NOT Prime");


    }
}
