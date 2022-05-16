import java.util.ArrayList;

public class Dining
{

    private String mealName;
    private String typeMeal;
//constructor for dining object with two string parameters 
    public Dining (String name, String type)
    {
        mealName = name;
        typeMeal = type;
    }
//takes a parameter and sets it as the mealName
    public void setMealName(String name)
    {
        mealName = name;
    }
//takes paramter and sets it as the type meal
    public void setTypeMeal(String type)
    {
        typeMeal = type;
    }
//returns meal name
    public String getMealName()
    {
        return mealName;
    }
// returns meal type 
    public String getTypeMeal()
    {
        return typeMeal;
    }
//returns an arrayliost of strings of the names of meals of which there are duplicates in the arrayLists of dining, given as the paramter 
    public static ArrayList<String> findDuplicateMeals(ArrayList<Dining> allMeals)
    {
        ArrayList<String> duplicateMeals = new ArrayList<String>();
        for (int i = 0; i < allMeals.size(); i++)
        {
            Dining firstMeal = allMeals.get(i);
            for (int j = i + 1; j < allMeals.size(); j++)
            {
                Dining secondMeal = allMeals.get(j);
                if (firstMeal.getMealName().equals(secondMeal.getMealName()))
                {
                    duplicateMeals.add(firstMeal.getMealName());
                    j = allMeals.size();
                }
            }
        }
        return duplicateMeals;
    }
}
