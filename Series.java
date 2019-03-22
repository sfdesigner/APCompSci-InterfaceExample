public class Series implements CanAverage, CanMedian {

    private int[] values;

    public Series(int numValues) {
        values = new int[numValues];
        for (int val : values) {
            val = (int) Math.random()*100;
        }
    }

    public float findAvg() {
        float avg = 0;
        for (int val : values) {
            avg += val;
        }
        avg = avg / values.length;

        return avg;
    }

    public void findMedian() {
        //
    }
}
