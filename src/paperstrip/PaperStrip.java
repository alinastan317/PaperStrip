/*
 * You are given two paper strips. On each strip, numbers (1, 2.... n) are written in random order.
 * Cut the original paper strip in several pieces adn rearrange those pieces to form the desired sequence.
 * Write a function that returns the minimum number of pieces to form the desired operation.
 *      For example, the following code should display 3 beacuse the pieces shoudl be (1), (4,3) and (2). 
        int[] original = new int[]{1, 4, 3, 2};
        int[] desired = new int[]{1, 2, 4, 3};
        System.out.println(PaperStrip.minPieces(original, desired));
 */
package paperstrip;

/**
 *
 * @author Alina
 */
public class PaperStrip {

    public static int minPieces(int[] original, int[] desired) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        int strips = original.length;

        for(int i = 0; i<original.length-1; i++){
            for (int j=0; j<desired.length-1; j++){
                if ((original[i]== desired[j])&&(original[i+1]== desired[j+1])) {
                   strips--; 
                }
            }
        }      
    return strips ;
}

public static void main(String[] args) {
        int[] original = new int[]{2, 3, 7, 5, 6, 1, 8, 4, 12, 10, 11, 9};
        int[] desired = new int[]{1, 2, 3, 4, 7, 5, 6, 8, 11, 9, 12, 10};
        System.out.println(PaperStrip.minPieces(original, desired));
    }
}
