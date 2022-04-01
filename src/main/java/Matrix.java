import java.util.Random;

public class Matrix {

    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MATRIX_LENGTH = 5;

    public static void main(String[] args) {
        //int[][] matrix = new int[MATRIX_LENGTH][MATRIX_LENGTH];
        int[][] matrix = {{1,1,0,4,5},
                           {1,1,11111,2,5},
                            {1,1,0,3,5},
                         {1,3,0,3,5},
                           {1,1,0,0,5}};
        int x = numberOfNonZeroValues(matrix);

        indexOfColumnsWithSameValues(matrix);
    }

    public static int numberOfNonZeroValues (int[][] matrix){
        int szamlalo = 0;
        for(int i = 0; i < MATRIX_LENGTH; i++){
            for(int j = 0; j < MATRIX_LENGTH; j++){
                if(matrix[i][j] != 0){
                    szamlalo++;
                }
            }
        }
        System.out.printf("Az alábbi mátrixban ennyi nem 0 érték található: %d\n", szamlalo);
        return szamlalo;
    }
    public static void indexOfColumnsWithSameValues(int[][] matrix){
        int szamlalo2 = 0;
        int szam2 = 0;
        int[] oszlopok = new int[MATRIX_LENGTH];

        for(int j = 0; j < MATRIX_LENGTH; j++) {
            szam2 = matrix[0][j];
            for (int i = 0; i < MATRIX_LENGTH; i++) {

                if (matrix[i][j] == szam2) {
                    szamlalo2++;
                }
            }
            if (szamlalo2 == MATRIX_LENGTH) {
                oszlopok[j] = 1;
            }
            szamlalo2 = 0;
        }
        System.out.print("Az alábbi oszlopok tartalmaznak azonos értékeket: ");
        for(int i = 0; i < MATRIX_LENGTH; i++){
            if(oszlopok[i] == 1){
                System.out.printf("%d ",i+1);
            }
        }
        System.out.print("\n");
    }
}
