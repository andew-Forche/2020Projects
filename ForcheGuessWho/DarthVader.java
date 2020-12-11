public class DarthVader extends Droid implements LightSaber, Pilot, GotButtWhooped{
    public DarthVader(){
        super("Darth Vader","Dark Side","Empire",false);
    }

    public String lightSaber(){
        return "red lightsaber";
    }

    public boolean pilot(){
        return true;
    }

    public boolean gotButtWhooped(){
        return true;
    }
}