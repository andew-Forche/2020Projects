public class Yoda extends Jedi implements LightSaber{
    public Yoda(){
        super("Yoda","Light Side","Galactic Republic",true);
    }

    public String lightSaber(){
        return "green lightsaber";
    }
}