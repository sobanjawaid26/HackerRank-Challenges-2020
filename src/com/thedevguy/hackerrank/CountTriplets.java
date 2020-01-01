package com.thedevguy.hackerrank;

public class CountTriplets {

    public static int countTriplets(int[]a, int r){
        int counter = 0;
        for (int i = 1; i <a.length - 1; i++){
            if(a[i] % r == a[i-1] && a[i] * r == a[i + 1]){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,16,64};
        int r = 4;
        System.out.println(countTriplets(arr,r));
    }
}
