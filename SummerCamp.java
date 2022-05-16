public class SummerCamp
{
    private int numberOfBookedDays;
    private int numberOfUnbookedDays;
    private String nameOfSummerCamp;
//creates the summerCamp object with no parameters 
    public SummerCamp()
    {
        numberOfBookedDays = 0;
        numberOfUnbookedDays = 25;
        nameOfSummerCamp = "Unknown";
    }
//creates summerCamp object with name as a parameter 
    public SummerCamp(String name)
    {
        numberOfBookedDays = 0;
        numberOfUnbookedDays = 25;
        nameOfSummerCamp = name;
    }
//returns the name of the summerCamp
    public String getNameOfSummerCamp()
    {
        return nameOfSummerCamp;
    }
//returns the number of days that are booked
    public int getNumberOfBookedDays()
    {
        return numberOfBookedDays;
    }
// returns the number of days that are not booked 
    public int getNumberOfUnbookedDays()
    {
        return numberOfUnbookedDays;
    }
//makes a resveration by adding to the number of booked days and subtracting from the number of unbooked days 
    public void makeReservation(int numDays)
    {
        numberOfBookedDays += numDays;
        numberOfUnbookedDays -= numDays;
        System.out.println("Making reservation. . . ");
    }
// cancels a resveration by subracted from the number of booked days and adding to the number of unbooked days 
    public void cancelReservation(int numDays)
    {
        numberOfBookedDays -= numDays;
        numberOfUnbookedDays += numDays;
        System.out.println("Cancelling reservation. . . ");
    }

}