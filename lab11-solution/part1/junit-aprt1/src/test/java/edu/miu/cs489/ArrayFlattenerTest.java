package edu.miu.cs489;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFlattenerTest {

    private ArrayFlattener arrayFlattener;

    @BeforeEach
    void setUp() {
        this.arrayFlattener = new ArrayFlattener();
    }

    @AfterEach
    void tearDown() {
        this.arrayFlattener = null;
    }

    @Test
    void flattenNonEmpty2DArrayTo1DArrayTest() {
        int arr[][] = {{1,3},{0},{4,5,9}};
        int arrayFlattenerResult[] = this.arrayFlattener.flattenArray(arr);
        int expected[] = {1, 3, 0, 4, 5, 9};
        Assertions.assertArrayEquals(expected, arrayFlattenerResult);
    }

    @Test
    void flattenNullObjectTo1DArrayTest() {
        int arr[][] = null;
        int arrayFlattenerResult[] = this.arrayFlattener.flattenArray(arr);
        int expected[] = null;
        Assertions.assertArrayEquals(expected, arrayFlattenerResult);
    }
}