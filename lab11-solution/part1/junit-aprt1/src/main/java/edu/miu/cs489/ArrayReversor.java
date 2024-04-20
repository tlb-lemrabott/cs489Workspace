package edu.miu.cs489;

import edu.miu.cs489.service.ArrayFlattenerService;

import java.util.Objects;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int [][] arr2D){
        if(Objects.isNull(arr2D)){
            return null;
        }
        int []flattenedArray = arrayFlattenerService.flattenArray(arr2D);
        for(int i=0; i<flattenedArray.length/2; i++){
            int temp = flattenedArray[i];
            flattenedArray[i] = flattenedArray[flattenedArray.length-i-1];
            flattenedArray[flattenedArray.length-i-1] = temp;
        }
        return flattenedArray;
    }
}
