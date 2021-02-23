package org.horizoncolumbus.hs;

public class Sort {

    public static void main(String[] args) {
        int[] unsortedArray = new int[]{3, 7, 9, 8, 1, 2, 4, 5, 6};

        for(int i=0; i < unsortedArray.length; i++){
            
            System.out.print(unsortedArray[i] + "\t");
        }
        for(int i = 0; i < unsortedArray.length - 1; i++){
            for(int j = 0; j < unsortedArray.length - i - 1; j++){
                if(unsortedArray[j] > unsortedArray[j+1]){
                    int temp = unsortedArray[j+1];
                    unsortedArray[j+1] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }

        System.out.print("\nsorted Array: ");
        for(int i = 0; i < unsortedArray.length; i++){
            System.out.print(unsortedArray[i] + "\t");
        }
    }
}
