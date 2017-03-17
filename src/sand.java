import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by HXHAIR on 2017/3/16.
 */
public class sand {
    public static void main(String[] args) {
        ArrayList<Double> list=new ArrayList<Double>();
        System.out.print("enter num of hole and hole position: ");
        Scanner s=new Scanner(System.in);

        while(s.hasNext()){//Integer.parseInt(s.next()) != -1
            double sum=0;
            //System.out.println(s.next());
            int holenum=Integer.parseInt(s.next());
            if(holenum==-1)
                break;
            if(holenum==0) {
                list.add(10000.00);
                continue;
            }
            int[] hole=new int[holenum];
            //int dis;
            for(int i=0;i<holenum;i++)
            {
                //dis=Integer.parseInt(s.next());
                hole[i]=Integer.parseInt(s.next());

            }

            Arrays.sort(hole);
            for(int i=0;i<=holenum;i++)
            {
               if(i==0)
                sum+=hole[i]*hole[i]/2.0;
            else if(i==(holenum))
            {
                sum+=Math.pow((100-hole[i-1]),2)/2.0;
            }
            else
                sum+=Math.pow((hole[i]-hole[i-1]),2)/4.0;

            }
            list.add(sum);
            //s.nextLine();

        }

        for (Double temp:list) {
            System.out.println(temp);

        }
    }
}
