import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ThreeDPoint a = new ThreeDPoint(1,2,3);
        Series b = new Series(10);

        System.out.println(a.findAvg());
        System.out.println(b.findAvg());

        ArrayList<CanMedian> vals = new ArrayList<CanMedian>();
        vals.add(b);

        for (CanMedian x : vals) {
            x.findMedian();
        }

        ArrayList<CanAverage> z = new ArrayList<CanAverage>();
        for (int i = 0; i < 10; i++) {
            z.add(new Series(i));
        }
    }
}
