// Name: Aimee Tan

public class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getRadius()
    {
        double rad = Math.sqrt((x * x) + (y * y));
        return rad;
    }

    public double getAngle()
    {
        double angle = Math.atan2(y, x);
        return angle;
    }

    public Point rotate90()
    {
        return new Point (-y, x);
    }
} 
