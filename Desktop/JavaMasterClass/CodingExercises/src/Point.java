public class Point {

    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return distance(0, 0);
    }

    public double distance(int xB, int yB){
        return Math.sqrt((xB - x) * (xB - x) + (yB - y) * (yB -y));
    }

    public double distance(Point otherPoint){
        return distance(otherPoint.getX(), otherPoint.getY());
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
