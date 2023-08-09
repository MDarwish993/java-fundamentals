/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void testRoll(){
        Library sut=new Library();
        int[] result= sut.roll(4);
        for (int i = 0; i < result.length; i++) {
            assertFalse(result[i]<1 || result[i]>6);
        }
    }

    @Test void testIsContainsDuplicates(){
        Library sut=new Library();
        int[] array={1,2,3,4,2};
        boolean result= sut.isContainsDuplicates(array);
        Assertions.assertEquals(true,result);
    }

    @Test void testArrayAverage(){
        Library sut=new Library();
        int[] array={1,2,3,4,5};
        double result= sut.arrayAverage(array);
        Assertions.assertEquals(3.0,result);
    }

    @Test void testLowestArrayAverage(){
        Library sut=new Library();
        int[][] arrays= {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] arr={55, 54, 60, 53, 59, 57, 61};
        int[] result= sut.lowestArrayAverage(arrays);
        Assertions.assertArrayEquals(arr,result);
    }


}