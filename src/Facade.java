/*
Class creates a simple facade pattern to simplify Math class
 */
public class Facade {

    public double getAbsoluteValue(double passedValue)
    {
        return Math.abs(passedValue);
    }

    public double cubeIt(double passed_value)
    {
        return Math.cbrt(passed_value);
    }

    public double squareRootIt(double passed_value)
    {
        return Math.sqrt(passed_value);
    }

    public double squareIt(double passed_value, int powerOf)
    {
        return Math.pow(passed_value, powerOf);
    }

    public double roundIt(double passed_value)
    {
        return Math.round(passed_value);
    }

    public static void main (String [] args)
    {
        Facade o = new Facade();
        System.out.println(o.cubeIt(10.0));
        System.out.println(o.getAbsoluteValue(-10.0));
        System.out.println(o.squareRootIt(16));
        System.out.println(o.squareIt(2, 5));
        System.out.println(o.roundIt(2.555555));
        System.out.println("Program Complete");
    }
}
