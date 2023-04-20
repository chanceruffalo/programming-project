public class Main {
    public static void main(String[] args) {
        int [][] array = new int[][]
                {{35,1,6,26,19,24},
                {3,32,7,21,23,25},
                {31,9,2,22,27,20},
                {8,28,33,17,10,15},
                {30,5,34,12,14,16},
                {4,36,29,13,18,11}};
        rowSum(array,3,3,0);
        rowSum(array,4,4,0);
        rowSum(array,5,5,0);
        rowSum(array,6,6,0);
        System.out.println("Diagonal Sum of 3x3: " + diagonalSum(array,3,3));
        System.out.println("Diagonal Sum of 4x4: " + diagonalSum(array,4,4));
        System.out.println("Diagonal Sum of 5x5: " + diagonalSum(array,5,5));
        System.out.println("Diagonal Sum of 6x6: " + diagonalSum(array,6,6));

    }


    public static void rowSum(int [][] arr,int rowSize ,int columnSize,int rowNumber){
        // loop from however big starting at rowNumber

        for(int i = rowNumber; i < rowSize; i ++){
            int answerSum = 0;
            for(int j = 0; j < columnSize; j ++){
                answerSum += arr[i][j];
            }
            System.out.println("Sum of " + rowSize + "x" + columnSize + "(column :" + i + "): " + answerSum);
        }
    }

    public static int diagonalSum(int[][] arr,int rowSize,int columneSize){
        int answerSum= 0;
        for(int i = 0; i < rowSize; i ++){
            answerSum += arr[i][i];
        }
        return answerSum;
    }
}