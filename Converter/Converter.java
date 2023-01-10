import converter.CurrencyConverter;
import converter.DistanceConverter;
import converter.TimeConverter;
// import converter.*;
import java.util.*;


public class Converter {

    public static void main(String[] args){
        
        int choice;
        
        Scanner sc=new Scanner(System.in);

        do
        {
            System.out.println("Menu\n1.Distance Converter\n2.Currency Converter\n3.Time Converter\n4.Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();

            switch (choice)
            {
                case 1:
                Distance.distance_conversion();
                break;
                case 2:
                Currency.currency_conversion();
                break;
                case 3:
                Time.time_conversion();
                break;
                case 4:System.out.println("Thank you");
                break;
                default:System.out.println("Invlaid Choice");
                break;
            }
        }while(choice!=4);
    }
}

class Distance {
    public static void distance_conversion()
    {
        int option;
        double km,mil;
        Scanner s2=new Scanner(System.in);
        System.out.println("Menu\n1.Mile to Km\n2.Km to Mile");
        option=s2.nextInt();
        switch (option)
        {
            case 1:
            System.out.print("Enter the value of Mile: ");
            mil=s2.nextDouble();
            km=DistanceConverter.mil_to_km(mil);
            System.out.println("The value of Mile= "+mil+" in Kilometers is "+km);
            break;
            case 2:
            System.out.print("Enter the value of Kilometer: ");
            km=s2.nextDouble();
            mil=DistanceConverter.km_to_mil(km);
            System.out.println("The value of Kilometer= "+km+" in Mile is "+mil);
            break;
            default:
            break;
        }
    }
}
class Currency {
    public static void currency_conversion()
    {
        int option;
        double usd,inr,eur,yen;
        Scanner s2=new Scanner(System.in);
        System.out.println("Menu\n1.USD to INR\n2.INR to USD\n3.EUR to INR\n4.INR to EUR\n5.YEN to INR\n6.INR to YEN");
        option=s2.nextInt();
        switch (option)
        {
            case 1:
            System.out.print("Enter the value of USD: ");
            usd=s2.nextDouble();
            inr=CurrencyConverter.usd_to_inr(usd);
            System.out.println("The value of USD "+usd+" in INR is "+inr);
            break;
            case 2:
            System.out.print("Enter the value of INR: ");
            inr=s2.nextDouble();
            usd=CurrencyConverter.inr_to_usd(inr);
            System.out.println("The value of INR "+inr+" in USD is "+usd);
            break;
            case 3:
            System.out.print("Enter the value of EUR: ");
            eur=s2.nextDouble();
            inr=CurrencyConverter.eur_to_inr(eur);
            System.out.println("The value of EUR "+eur+" in INR is "+inr);
            break;
            case 4:
            System.out.print("Enter the value of INR: ");
            inr=s2.nextDouble();
            eur=CurrencyConverter.inr_to_eur(inr);
            System.out.println("The value of INR "+inr+" in EUR is "+eur);
            break;
            case 5:
            System.out.print("Enter the value of YEN: ");
            yen=s2.nextDouble();
            inr=CurrencyConverter.yen_to_inr(yen);
            System.out.println("The value of YEN "+yen+" in INR is "+inr);
            break;
            case 6:
            System.out.print("Enter the value of INR: ");
            inr=s2.nextDouble();
            yen=CurrencyConverter.inr_to_yen(inr);
            System.out.println("The value of INR "+inr+" in YEN is "+yen);
            break;
            default:
            break;
        }
    }
}
class Time {
    public static void time_conversion()
    {
        int option;
        double hrs,mins,sec;
        Scanner s2=new Scanner(System.in);
        System.out.println("Menu\n1.Hours to Seconds\n2.Seconds to Hours\n3.Hours to Minutes\n4.Minutes to Hours");
        option=s2.nextInt();
        switch (option)
        {
            case 1:
            System.out.print("Enter the value in Hours: ");
            hrs=s2.nextDouble();
            sec=TimeConverter.hrs_to_sec(hrs);
            System.out.println("Hours= "+hrs+" in Seconds= "+sec);
            break;
            case 2:
            System.out.print("Enter the value in Seconds: ");
            sec=s2.nextDouble();
            hrs=TimeConverter.sec_to_hrs(sec);
            System.out.println("Seconds= "+sec+" in Hours= "+hrs);
            break;
            case 3:
            System.out.print("Enter the value in Hours: ");
            hrs=s2.nextDouble();
            mins=TimeConverter.hrs_to_mins(hrs);
            System.out.println("Hours= "+hrs+" in Minutes= "+mins);
            break;
            case 4:
            System.out.print("Enter the value in Minutes: ");
            mins=s2.nextDouble();
            hrs=TimeConverter.mins_to_hrs(mins);
            System.out.println("Minutes= "+mins+" in Hours= "+hrs);
            break;
            default:
            break;
        }
    }
}