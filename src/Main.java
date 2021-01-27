// Program: Mr. Tarazi, ASK HS Technology Teacher
// Date: January 27th, 2021
// Objective: A Java program to demonstrate Array Shifting Algorithm

import java.util.Arrays;

public class Main {

    // Array before [1, 3, 8, 0, 19, 24, 0, 7, 2, 0]
    // Array after [1, 3, 8, 19, 24, 7, 2, 0, 0, 0]

    // Array before [7, 3, 0, 4, 6, 0, 0, 13, 0, 78, 0, 0, 19]
    // Array after [ 7, 3, 4, 6, 13, 78, 19, 0, 0, 0, 0, 0 , 0]

    // Array before [0]
    // Array after [0]

    public static void main(String[] args) {
    //  int[] theArray = new int[10];
        int[] array1 = {1, 3, 8, 0, 19, 24, 0, 7, 2, 0};
        print(array1);
    }

    // Method to printout the Array before and after shifting of ZEROS
    public static void print(int[] list) {
        System.out.println("before: " + Arrays.toString(list));
        moveZeros(list);
        System.out.println("after: " + Arrays.toString(list));
    }

    // Method to SHIFT ZEROS to the end of the Array
    public static void  moveZeros(int[] list) {

        int[] temp = new int[list.length];
        int count = 0; // To count how many non-zeros values I have in the original array

        for (int i=0; i<list.length; i++) {
            if (list[i] != 0) {
                temp[count] = list[i];
                count++;
            }
        }

        for (int i=0; i<temp.length;i++) {
            list[i] = temp[i];
        }
    }
}
