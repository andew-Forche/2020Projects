public class CountDooku extends Character implements LightSaber, GotButtWhooped, Pilot{
    public CountDooku(){
        super("Count Dooku","Dark Side","Separatist",false);
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