package converter;

public class DistanceConverter
{
    public static double mil_to_km(double mil)
    {
        return mil*1.609;
    }
    public static double km_to_mil(double km)
    {
        return km*0.621;
    }
}