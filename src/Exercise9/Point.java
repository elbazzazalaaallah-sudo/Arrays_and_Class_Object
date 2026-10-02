package Exercise9;

public class Point {
    private int x;
    private int y;

    public Point(){}
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        double dist;
        double x = Math.pow(this.x,2);
        double y = Math.pow(this.y,2);
        dist = Math.pow(x+y,0.5);
        return dist;
    }

    public double distance1(Point p1){
        double dist;
        double xs = Math.pow(this.x - p1.x,2);
        double ys = Math.pow(this.y - p1.y,2);
        dist = Math.pow(xs+ys,0.5);
        return dist;
    }

    public double distance2(int x, int y){
        double dist;
        double xs = Math.pow(this.x - x,2);
        double ys = Math.pow(this.y - y,2);
        dist = Math.pow(xs+ys,0.5);
        return dist;
    }

    public static void main(String[] args){
        Point point1 = new Point(1,0);
        Point point2 = new Point(1,0);
        double dist = point1.distance();
        double dist1 = point1.distance1(point2);
        double dist2 = point1.distance2(3,4);
        System.out.println("Distance using distance() : "+ dist);
        System.out.println("Distance using distance1() : "+ dist1);
        System.out.println("Distance using distance2() : "+ dist2);
    }
}
