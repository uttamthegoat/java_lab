package converter;

public class TimeConverter
{
    public static double hrs_to_sec(double hrs)
    {
        return hrs*3600;
    }
    public static double sec_to_hrs(double sec)
    {
        return sec*0.000278;
    }
    public static double hrs_to_mins(double sec)
    {
        return sec*60;
    }
    public static double mins_to_hrs(double sec)
    {
        return sec*0.0167;
    }
}
