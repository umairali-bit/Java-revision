public class Point {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Instance methods

    //Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as
    // double.
    public double distance(){
        return distance(0,0);
    }

    //Method named distance with two parameters x, y both of type int, it needs to return the distance between this
    // Point and Point x,y as double.

    public double distance(int x, int y) {
        System.out.println("this.x and this.y " + this.x + " " + this.y);

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    //Method named distance with parameter another of type Point, it needs to return the
    // distance between this Point and another Point as double.

    public double distance(Point secondPoint){
        return distance(secondPoint.x, secondPoint.y);

    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


}
