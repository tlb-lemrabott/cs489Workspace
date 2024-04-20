package edu.miu.cs489;

import edu.miu.cs489.service.ArrayFlattenerService;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ArrayReversorTest {
    @Mock
    private ArrayReversor arrayReversor;

    private ArrayFlattenerService arrayFlattenerServiceMock;

    @BeforeEach
    void setUp() {
        this.arrayFlattenerServiceMock = mock(ArrayFlattenerService.class);
        this.arrayReversor = new ArrayReversor(arrayFlattenerServiceMock);
    }

    @AfterEach
    void tearDown() {
        this.arrayReversor = null;
        this.arrayFlattenerServiceMock = null;
        this.arrayReversor = null;
    }

    @Test
    void reverseArray() {
        int inputArray[][] = {{1,3},{0},{4,5,9}};
        int flattenedArray[] = {1,3,0,4,5,9};
        when(arrayFlattenerServiceMock.flattenArray(inputArray)).thenReturn(flattenedArray);
        int[] reversedFlattenedArray = arrayReversor.reverseArray(inputArray);
        verify(arrayFlattenerServiceMock).flattenArray(inputArray);
        int[] expectedReversedFlattenedArray = {9,5,4,0,3,1};
        assertThat(expectedReversedFlattenedArray, is(reversedFlattenedArray));
    }

    @Test
    void reverseNullObject() {
        int[][] inputArray = null;
        int[] reversedFlattenedArray = arrayReversor.reverseArray(inputArray);
        Assertions.assertArrayEquals(null, reversedFlattenedArray);
    }

}