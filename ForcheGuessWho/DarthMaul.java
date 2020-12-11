public class DarthMaul extends Character implements LightSaber{
    public DarthMaul(){
        super("Darth Maul","Dark Dide","Separatist",false);
    }

    public boolean pilot(){
        return true;
    }

    public String lightSaber(){
        return "red lightsaber";
    }
}