public class Point {

    private int x;
    private int y;
    private String label;

    public Point(String label, int x, int y) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    @Override
    public String toString() {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    @Override
    public boolean equals(Object temp) {
        if (temp instanceof Point) {
            Point tempPoint = (Point) temp;
            if (tempPoint.x != x) {
                return false;
            }
            if (tempPoint.y != y) {
                return false;
            }
            return true;
        }
        return false;
    }
}
