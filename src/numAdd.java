import java.util.Scanner;

/**
 * Created by HXHAIR on 2017/3/16.
 */
public class numAdd {
    public static void main(String[] args) {
        System.out.print("enter and number: ");
        Scanner s=new Scanner(System.in);
        int num=Integer.parseInt(s.next());
        int num2=RSum(num);
        while(num2>10)
            num2=RSum(num2);

        System.out.println("the sum is "+(num2));
    }
    public static int RSum(int newNum)
    {
        if(newNum<10)
            return newNum;
        else
            return RSum(newNum/10)+ newNum%10;

    }
}
