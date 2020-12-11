public class Board {
    private Tile tiles [][] = {
        //create the board of boxes
        {new Tile(), new Tile(), new Tile(), new Tile(), new Tile()},
        {new Tile(), new Tile(), new Tile(), new Tile(), new Tile()},
        {new Tile(), new Tile(), new Tile(), new Tile(), new Tile()},
        {new Tile(), new Tile(), new Tile(), new Tile(), new Tile()},
        {new Tile(), new Tile(), new Tile(), new Tile(), new Tile()}
    };

    //create a getter for board
    //since I'm returning Box[][] I need to declare this method as Box[][]
    public Tile[][] getTiles(){
        return tiles;
    }

    public String toString (){
        //return string s that is a print out of the board
        String s="";
        //s+="-------------\n"; //this is used to print the dash and vertical line method
        //accesses the rows
	    for(Tile[] row:tiles){
            //accesses the columns(items)
		    for(Tile item:row){
			    s+="["+item.getTileStat()+"]";
            }
            s+="\n";
		    //s+="|\n-------------\n";//this is used to print the dash and vertical line method
        }
        return s;
    }
}