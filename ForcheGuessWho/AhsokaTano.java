public class AhsokaTano extends Jedi implements LightSaber, Pilot{
    public AhsokaTano(){
        super("Ahsoka Tano","Light Side","Galactic Republic",true);
    }

    public String lightSaber(){
        return "white lightsaber";
    }

    public boolean pilot(){
        return true;
    }
}