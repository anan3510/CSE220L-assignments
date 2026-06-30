//Assignment Task 03: Game Arena
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame( Integer[][] arena ){

        //For this task you don't need to create any new 2D array
        //just print the result inside the function
        
        //TO DO
        int count = 0;
        for(int col=0; col<arena.length; col++){
            for(int row=0; row<arena[0].length; row++){
                if(arena[col][row]!=0 && arena[col][row]%50==0){
                    if(col-1>=0 && arena[col-1][row] == 2 ){
                        count+=2;
                    }if(col+1<arena.length && arena[col+1][row] == 2 ){
                        count+=2;
                    }if(row-1>=0 && arena[col][row-1] == 2 ){
                        count+=2;
                    }if(row+1<arena[0].length && arena[col][row+1] == 2 ){
                        count+=2;
                    }
                }
            }
        }
            if(count>=10){
                System.out.print("Points Gained: "+count+". Your team has survived the game.\n");
            }else{
               System.out.print("Points Gained: "+count+". Your team is out.\n"); 
            }
    }
        

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}
