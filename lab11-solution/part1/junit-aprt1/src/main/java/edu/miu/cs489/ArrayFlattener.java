package edu.miu.cs489;

import java.util.Objects;

public class ArrayFlattener {
    public int [] flattenArray(int arr2d[][]){
        if(Objects.isNull(arr2d)){
            return null;
        }
        int totalLength = 0;
        for (int i = 0; i < arr2d.length; i++) {
            totalLength += arr2d[i].length;
        }
        int[] flatArr = new int[totalLength];
        int index = 0;
        for(int i=0; i<arr2d.length; i++){
            for (int j=0; j<arr2d[i].length; j++){
                flatArr[index++] = arr2d[i][j];
            }
        }
        return flatArr;
    }
}
