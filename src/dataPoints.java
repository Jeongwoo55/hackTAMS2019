import java.util.*;

public class dataPoints
{
    private double xVal;
    private double yVal;
    private double distance;

    public dataPoints(double dist)
    {
        distance = dist;
    }

    public double getX()
    {
        return xVal;
    }

    public double getY()
    {
        return yVal;
    }

    public void setDeg(double deg)
    {
        double radians;

        radians = Math.toRadians(deg);

        xVal = distance * Math.cos(radians);
        yVal = distance * Math.sin(radians);
    }

}