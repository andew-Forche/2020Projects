public class EmperorPalpatine extends Droid implements LightSaber{
    public EmperorPalpatine(){
        super("Sheev Palpatine","Dark Side","Empire, Separatist, Galactic Republic", true);
    }

    public String lightSaber(){
        return "red lightsaber";
    }
}