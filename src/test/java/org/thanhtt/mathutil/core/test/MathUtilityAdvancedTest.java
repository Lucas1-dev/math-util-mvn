
package org.thanhtt.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
public class MathUtilityAdvancedTest {
    
    
    //tao mang 2 chieu chua data de dung cho viec assertE()
    //gom n dua vao de expected tra ve
    // int  --> long --> Object (wrapper class)
    //                           Interger Long
    public static Object[][] initTestData(){
            Object testData[][] = {{0,1},
                                   {1,1},
                                   {2,2},
                                   {4,24},
                                   {6,720}};
            
            return testData;
    }
    //NHoi` Data nay` vao ham` assertE();
  
    @ParameterizedTest
    @MethodSource("initTestData")
    
    
    public void testFactorialGivenRightArgument(int n, long expected) {
        //assertEquals(69,69);
        assertEquals(expected,getFactorial(n));
    
    
    
}
