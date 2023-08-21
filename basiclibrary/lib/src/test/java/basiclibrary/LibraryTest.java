/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    //===========================lab03Solution======================

    @Test public void testWeatherData() {
        Library sut=new Library();
        int[][] data1 = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String expected1 = "High: 72\nLow: 51\nNever saw temperature: 63\nNever saw temperature: 67\nNever saw temperature: 68\nNever saw temperature: 69\n";
        String result= sut.weatherData(data1);
        assertEquals(expected1, result);
    }

    @Test public void testTally() {
        Library sut = new Library();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String result = sut.tally(votes);
        assertEquals("Bush", result);
    }

}