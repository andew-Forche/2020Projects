public class Rey extends Jedi implements LightSaber, Pilot{
    public Rey(){
        super("Rey","Both","Resistance",true);
    }

    public String lightSaber(){
        return "yellow lightsaber";
    }

    public boolean pilot(){
        return true;
    }
}