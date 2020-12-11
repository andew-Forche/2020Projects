import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class GuessWhoRunner{

    static Random r = new Random();
    Scanner s = new Scanner(System.in);

    //why are these private...
    //row and column and board are all used in other files.
    private Board board = new Board();
    private int row,column;
    private ArrayList<Character> characters = new ArrayList<Character>();
                //  p1 is for deteting if player1 or player2
                //  vsPC is for detecting if the PC is playing

    private boolean p1, win1=false, win2=false,  vsPC;

    public static void main(String[] args) {
        GuessWhoRunner game = new GuessWhoRunner();
        //since play is not static, it needs a object to run the method
        addCharacters(game.characters);
        createRandomList(game.characters);
        printArray(game.characters);
        //game.play();
        //System.out.println(game.lightSaberFinder(game.characters));

    }
    /*
    public void gameMenu(){
        //give the option to for the user on single or two player
        System.out.println( "1: for single player\n"+
                            "2: for two players\n"+
                            "3: for quit\n");
        //have an event to run the choose who goes first methods (get and set player)
        int menuSelection = s.nextInt();                        //TODO: May need to check for proper input
        if(menuSelection==1){
            this.vsPC=true;             //since we are using this based on an object and it was initialized as private
                                        //we have to use this so it knows what we are refering to 
        }
        else if(menuSelection==2){
            this.vsPC=false;
        }
        else{
            System.out.println("Shutting down.......... beoooooooop");
            //the exit method stops the program, the status tells the JVM why we exited the program
            System.exit(1);     
        }
        System.out.println("Press enter to determine who is first (or press enter to begin) ");
        s.nextLine();
        String in = s.nextLine();   //stalls the program until I press enter

        setPlayer();
        System.out.println(getPlayer()+" will begin");

    }
    */
    public static void addCharacters(ArrayList<Character> characters){
        characters.add(new AdmiralAckbar());
        characters.add(new AdmiralHoldo());
        characters.add(new AdmiralPiett());
        characters.add(new AhsokaTano());
        characters.add(new AnakinSkywalker());
        characters.add(new BB8());
        characters.add(new BiggsDarklighter());
        characters.add(new BobaFett());
        characters.add(new Bossk());
        characters.add(new C3PO());
        characters.add(new Chewbacca());
        characters.add(new ChirrutImwe());
        characters.add(new CountDooku());
        characters.add(new DarthMaul());
        characters.add(new DarthVader());
        characters.add(new Dengar());
        characters.add(new Droideka());
        characters.add(new EmperorPalpatine());
        characters.add(new EnfysNest());
        characters.add(new EzraBridger());
        characters.add(new Finn());
        characters.add(new GeneralGrievous());
        characters.add(new GrandMoffTarkin());
        characters.add(new Greedo());
        characters.add(new HanSolo());
        characters.add(new IG11());
        characters.add(new JabbaTheHut());
        characters.add(new JangoFett());
        characters.add(new JarJarBinks());
        characters.add(new K2SO());
        characters.add(new KiAdiMundi());
        characters.add(new KyloRen());
        characters.add(new LandoCalrissian());
        characters.add(new Luke());
        characters.add(new MaceWindu());
        characters.add(new MonMothma());
        characters.add(new NuteGunray());
        characters.add(new ObiWanKenobi());
        characters.add(new PadmeAmidala());
        characters.add(new PloKoon());
        characters.add(new PoeDameron());
        characters.add(new PrincessLeia());
        characters.add(new Qira());
        characters.add(new QuiGonJin());
        characters.add(new R2D2());
        characters.add(new Rex());
        characters.add(new Rey());
        characters.add(new WedgeAntilles());
        characters.add(new Wicket());
        characters.add(new Yoda());
    }

    public static void createRandomList(ArrayList<Character> characters){
        for(int i = 0; characters.size()>25; i++){
            characters.remove(i);
            i=r.nextInt(50);
        }
    }

    public static void printArray(ArrayList<Character> c){
        for(Character i: c){
            System.out.println(i.getName());
        }
    }

    public String lightSaberFinder(ArrayList <Character> characters)
    {
        String msg = "";
        for(Character c : characters){
            if(c instanceof LightSaber) {
                LightSaber l = (LightSaber) c;
                msg += c.getName() + ": \n       " 
                + l.lightSaber() + "\n";
            }
        }
        return msg;

    }


}