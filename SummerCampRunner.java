import java.util.ArrayList;


public class SummerCampRunner 
{
    public static void main(String[] args)
    {
        // testing the SummerCamp class
        SummerCamp outdoorAdventures = new SummerCamp("Outdoor Adventures");
        System.out.println("Number of booked days before reservation: " + outdoorAdventures.getNumberOfBookedDays());
        System.out.println("Number of unbooked days before reservation: " + outdoorAdventures.getNumberOfUnbookedDays());
        outdoorAdventures.makeReservation(4);
        System.out.println("Number of booked days after reservation: " + outdoorAdventures.getNumberOfBookedDays());
        System.out.println("Number of unbooked days after reservation: " + outdoorAdventures.getNumberOfUnbookedDays());
        System.out.println(" ");

        // testing the Dining class
        ArrayList<Dining> allMeals = new ArrayList<Dining>();

        Dining mondayBreakfast = new Dining ("Sausage and Eggs", "Breakfast");
        allMeals.add(mondayBreakfast);
        Dining mondayLunch = new Dining ("Beef Tacos", "Lunch");
        allMeals.add(mondayLunch);
        Dining mondayDinner = new Dining ("Lasagna", "Dinner");
        allMeals.add(mondayDinner);
        Dining sundayBreakfast = new Dining ("Sausage and Eggs", "Breakfast");
        allMeals.add(sundayBreakfast);
        Dining sundayLunch = new Dining ("Salad", "Lunch");
        allMeals.add(sundayLunch);
        Dining sundayDinner = new Dining ("Pizza", "Dinner");
        allMeals.add(sundayDinner);

        ArrayList<String> dupMeals = Dining.findDuplicateMeals(allMeals);
        for (String x : dupMeals)
        {
            System.out.println(x);
        }

        // testing the Housing class
        Housing outdoorAdventuresHousing = new Housing(25, 25, 25);
        System.out.println("Original available number of beds: " + outdoorAdventuresHousing.getAvailableNumberOfBeds());
        System.out.println("Original available number of cabins: " + outdoorAdventuresHousing.getAvailableNumberOfCabins());
        System.out.println("Original available number of tents: " + outdoorAdventuresHousing.getAvailableNumberOfTents());
        outdoorAdventuresHousing.makeHousing("bed");
        System.out.println("Available number of beds after booking: " + outdoorAdventuresHousing.getAvailableNumberOfBeds());
        outdoorAdventuresHousing.changeHousing("bed", "cabin");
        System.out.println("Available number of beds after cancelling: " + outdoorAdventuresHousing.getAvailableNumberOfBeds());
        System.out.println("Available number of cabins after new booking: " + outdoorAdventuresHousing.getAvailableNumberOfCabins());

        // testing the Camper class
        Camper Abby = new Camper("Abby", 14, "Horse Camp");
        Camper Josh = new Camper("Josh", 14, "Kayak Camp");
        Camper Jamie = new Camper("Jamie", 14, "Horse Camp");
        System.out.println("Number of campers: " + Camper.getNumCampers());
        System.out.println("Abby's original program selection: " + Abby.getProgram());
        Abby.setProgram("Kayak Camp");
        System.out.println("Abby's new program selection: " + Abby.getProgram());
    }
}
