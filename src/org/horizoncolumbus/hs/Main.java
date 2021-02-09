package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
	    int[] a = new int[]{7, 2, 5, 6, 3, 1, 9, 4, 0};

	    //int i = 0;

	    int largest = a[0];

	    for(int i = 0; i < a.length; i++){
	        if( a[i] > largest){
	            largest = a[i];
            }
        }
        System.out.println(largest);
    }
}
