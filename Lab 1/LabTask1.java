//Lab Task 01: Zigzag Walk
class LabTask1{

    //Complete this method so that it gives the Expected Output
    //NO NEED TO SUBMIT LAB TASKS
    public static void walkZigzag( Integer[][] matrix ){

        //For this task you don't need to create new arrays

        //TO DO
        if(matrix.length%2==0){
            for(int row=0; row<matrix[0].length ; row++){
                if(row%2==0){
                    for(int col=0; col<matrix.length ; col+=2){
                        System.out.print(matrix[col][row] + " ");
                    }
                }else{
                    for(int col=matrix.length-1; col>0 ; col-=2){
                        System.out.print(matrix[col][row] + " ");
                    }
                }
                System.out.println();
            }
        }else{
            for(int row=0; row<matrix[0].length ; row++){
                if(row%2==0){
                    for(int col=0; col<matrix.length ; col+=2){
                        System.out.print(matrix[col][row] + " ");
                    }
                }else{
                    for(int col=matrix.length-2; col>=1 ; col-=2){
                        System.out.print(matrix[col][row] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] floor1 = {
            {3 , 8 , 4 , 6 , 1},
            {7 , 2 , 1 , 9 , 3},
            {9 , 0 , 7 , 5 , 8},
            {2 , 1 , 3 , 4 , 0},
            {1 , 4 , 2 , 8 , 6}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(floor1);
        System.out.println("\nExpected Output:");
        System.out.print("3 9 1\n1 2\n4 7 2\n4 9\n1 8 6\n");
        System.out.print("\nYour Output:\n");
        walkZigzag( floor1 );

        System.out.print("\n======================\n");

        Integer[][] floor2 = {
            {3 , 8 , 4 , 6 , 1},
            {7 , 2 , 1 , 9 , 3},
            {9 , 0 , 7 , 5 , 8},
            {2 , 1 , 3 , 4 , 0},
        };
        System.out.println("\nGiven Matrix: ");
        Arr.print2D(floor2);
        System.out.println("\nExpected Output:");
        System.out.print("3 9\n1 2\n4 7\n4 9\n1 8\n");
        System.out.print("\nYour Output:\n");
        walkZigzag( floor2 );

    }
}
