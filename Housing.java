public class Housing 
{
    private final int totalNumberOfCabins;
    private final int totalNumberOfTents;
    private final int totalNumberOfBeds;
    private int availableNumberOfCabins;
    private int availableNumberOfTents;
    private int availableNumberOfBeds;
//constrictor for housing object, constructs the housing object taking three int parameters 
    public Housing(int totalCabins, int totalTents, int totalBeds)
    {
        totalNumberOfCabins = totalCabins;
        totalNumberOfTents = totalTents;
        totalNumberOfBeds = totalBeds;
        availableNumberOfCabins = totalCabins;
        availableNumberOfTents = totalTents;
        availableNumberOfBeds = totalBeds;
    }
//returns total number of tents 
    public int getTotalNumberOfTents()
    {
        return totalNumberOfTents;
    }
//returns total number of cabins
    public int getTotalNumberOfCabins()
    {
        return totalNumberOfCabins;
    }
// returns total number of beds 
    public int getTotalNumberOfBeds()
    {
        return totalNumberOfBeds;
    }
//reurns number of available tents 
    public int getAvailableNumberOfTents()
    {
        return availableNumberOfTents;
    }
//returns number of available cabins
    public int getAvailableNumberOfCabins()
    {
        return availableNumberOfCabins;
    }
//returns number of available beds
    public int getAvailableNumberOfBeds()
    {
        return availableNumberOfBeds;
    }
//makes a reservation for either a cabin, tent or bed, depending on the parameter 
    public void makeHousing (String type)
    {
        if (type.equalsIgnoreCase("cabin"))
        {
            availableNumberOfCabins--;
            System.out.println("Saving a cabin. . .");
        }
        else if (type.equalsIgnoreCase("tent"))
        {
            availableNumberOfTents--;
            System.out.println("Saving a tent. . .");
        }
        else if (type.equalsIgnoreCase("bed"))
        {
            availableNumberOfBeds--;
            System.out.println("Saving a bed. . .");
        }
    }
//cancels reservation for either a cabin, tent, or bed depending on the parameter 
    public void cancelHousing (String type)
    {
        if (type.equalsIgnoreCase("cabin"))
        {
            availableNumberOfCabins++;
        }
        else if (type.equalsIgnoreCase("tent"))
        {
            availableNumberOfTents++;
        }
        else if (type.equalsIgnoreCase("bed"))
        {
            availableNumberOfBeds++;
        }
    }
//changes reservation from one housing type to another depending on the parameter 
    public void changeHousing (String originalType, String newType)
    {
        if (originalType.equalsIgnoreCase("cabin"))
        {
            if (newType.equalsIgnoreCase("tent"))
            {
                availableNumberOfCabins++;
                availableNumberOfTents--;
                System.out.println("Changing from cabin to tent. . .");
            }
            else if (newType.equalsIgnoreCase("bed"))
            {
                availableNumberOfCabins++;
                availableNumberOfBeds--;
                System.out.println("Changing from cabin to bed. . .");
            }
        }
        else if (originalType.equalsIgnoreCase("tent"))
        {
            if (newType.equalsIgnoreCase("cabin"))
            {
                availableNumberOfBeds++;
                availableNumberOfCabins--;
                System.out.println("Changing from tent to cabin. . .");
            }
            else if (newType.equalsIgnoreCase("bed"))
            {
                availableNumberOfTents++;
                availableNumberOfBeds--;
                System.out.println("Changing from tent to bed. . .");
            }
        }
        else if (originalType.equalsIgnoreCase("bed"))
        {
            if (newType.equalsIgnoreCase("tent"))
            {
                availableNumberOfBeds++;
                availableNumberOfTents--;
                System.out.println("Changing from bed to tent. . .");
            }
            else if (newType.equalsIgnoreCase("cabin"))
            {
                availableNumberOfCabins--;
                availableNumberOfBeds++;
                System.out.println("Changing from bed to cabin. . .");
            }
        }
    }

}
