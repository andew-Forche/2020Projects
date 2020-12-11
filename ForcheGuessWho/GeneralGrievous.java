public class GeneralGrievous extends Droid implements LightSaber, Pilot, GotButtWhooped{
    public GeneralGrievous(){
        super("General Grievous","Dark Side","Separatist",false);
    }

    public String lightSaber(){
        return "green and yellow lightsaber";
    }

    public boolean pilot(){
        return true;
    }

    public boolean gotButtWhooped(){
        return true;
    }
}