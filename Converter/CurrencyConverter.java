package converter;

public class CurrencyConverter
{
    public static double usd_to_inr(double amt)
    {
        return amt*81.70;
    }
    public static double inr_to_usd(double amt)
    {
        return amt*0.012;
    }
    public static double eur_to_inr(double amt)
    {
        return amt*87.64;
    }
    public static double inr_to_eur(double amt)
    {
        return amt*0.011;
    }
    public static double yen_to_inr(double amt)
    {
        return amt*0.62;
    }
    public static double inr_to_yen(double amt)
    {
        return amt*1.62;
    }
}