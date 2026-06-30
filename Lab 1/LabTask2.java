//Lab Task 02: Decryption Process
class LabTask2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){

        //For this task you'll need to create new arrays
        //we recommend you to use Integer type.
        //example:  Integer[] array = new Integer[5]

        //TO DO
        //DELETE the following return statement when you're ready to return the 2D array
        int x = matrix[0].length;
        Integer[] arr = new Integer[x];

        for(int col=0; col<matrix[0].length; col++){
            for(int row=0; row<matrix.length; row++){
                arr[col] += matrix[row][col];
            }
        }

        Integer[] result = new Integer[x-1];
        for(int i=0; i<result.length; i++){
            result[i]=arr[i+1]-arr[i];
        }
        return result;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}