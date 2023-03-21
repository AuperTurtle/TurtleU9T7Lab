public class ThreeDPoint extends Point {

    private int z;

    public ThreeDPoint(String label, int x, int y, int z) {
        super(label, x , y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object temp) {
        if (temp instanceof ThreeDPoint) {
            ThreeDPoint tempPoint = (ThreeDPoint) temp;
            if (super.equals(temp) && tempPoint.z == z) {
                return true;
            }
        }
        return false;
    }
}
