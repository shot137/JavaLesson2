import java.util.Arrays;
   public class JavaLesson2 {
       public static void main(String args[]) {
           int[] Array = {1, 0, 1, 1, 0, 0, 0, 1, 1, 0};
           for (int i = 0; i < Array.length; i++) {
               if (Array[i] == 1) {
                   Array[i] = 0;
               } else {
                   Array[i] = 1;
               }
           }
           System.out.println(Arrays.toString(Array));

           int ArrayQ[] = new int[8];
           for (int i = 0; i < ArrayQ.length; i++) {
               ArrayQ[i] = i * 3;
           }
           System.out.println(Arrays.toString(ArrayQ));

           int ArrayW[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < ArrayW.length; i++) {
               if (ArrayW[i] < 6) {
                    ArrayW[i] = ArrayW[i] * 2;
               }
            }
           System.out.println(Arrays.toString(ArrayW));


            int[][] ArrayT = new int[4][4];
            for(int i = 0; i<ArrayT.length; i++){
                ArrayT[i][i] = 1;
                ArrayT[i][ArrayT.length-i-1] = 1;
            }
            for(int i = 0; i<ArrayT.length; i++) {
                System.out.println(Arrays.toString(ArrayT[i]));


            }
       }


   }
