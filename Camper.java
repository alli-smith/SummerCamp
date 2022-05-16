public class Camper
{
    public static int numCampers = 0;
    private String name;
    private int age;
    private String program;
//constructor for camper object with two string parameters and one int parameter
    public Camper (String n, int a, String p)
    {
        name = n;
        age = a;
        program = p;
        numCampers++;
    }
//sets name
    public void setName(String n)
    {
        name = n;
    }
//returns name
    public String getName()
    {
        return name;
    }
//sets age
    public void setAge(int a)
    {
        age = a;
    }
//returns age
    public int getAge()
    {
        return age;
    }
//returns program 
    public String getProgram()
    {
        return program;
    }
//sets program
    public void setProgram(String p)
    {
        program = p;
        System.out.println("Changing program. .  .");
    }
//returns the number of campers 
    public static int getNumCampers()
    {
        return numCampers;
    }

}
