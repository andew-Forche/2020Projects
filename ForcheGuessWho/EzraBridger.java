public class EzraBridger extends Jedi implements LightSaber {
    public EzraBridger(){
        super("Ezra Bridger","Light Side","Rebel",false);
    }

    public String lightSaber(){
        return "green lightsaber";
    }

    public boolean pilot(){
        return true;
    }
}