public class ThreeDPoint implements CanAverage {

    private int x,y,z;

    public ThreeDPoint(int nx, int ny, int nz) {
        x = nx;
        y = ny;
        z = nz;
    }

    public float findAvg() {
        float avg = (x+y+z)/3;
        return avg;
    }

}
