package arraypractice;

import java.util.Scanner;

public class MatrisExample {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

    //kullanıcıdan matrisboyutlarını al
        System.out.println("Satır sayısını girin:");
        int rows = scanner.nextInt();
        System.out.println("Sütun sayısını girin:");
        int cols= scanner.nextInt();

        int[][] matrix= new int[rows][cols];
        int[][] transpose= new int[cols][rows];

        // kullanıcını matrisini al

        System.out.println("Matrisin elemanlarını girin:");
        for (int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

            //matrisin tranpozunu al
            for (int i = 0; i <rows ; i++) {
                for (int j = 0; j <cols ; j++) {
                    transpose[j][i] = matrix[i][j];
                }

                }
                //orjinal matris
        System.out.println("orjinal matris");
            printMatrix(matrix);

        System.out.println("trnpose matris");
        printMatrix(transpose);

            }
            // matrisi ekrana yazdıran yardımcı metod
            public static void printMatrix(int[][]matrix) {
        for (int[] row:matrix){
            for (int element:row){
                System.out.print(element+ " ");
            }
            System.out.println();
        }

            }

            }



