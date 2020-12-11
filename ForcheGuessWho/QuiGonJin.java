public class QuiGonJin extends Jedi implements LightSaber, Pilot{
    public QuiGonJin(){
        super("Qui-Gon Jin","Light Side","Galactic Republic",false);
    }

    public String lightSaber(){
        return "green lightsaber";
    }

    public boolean pilot(){
        return true;
    }
}