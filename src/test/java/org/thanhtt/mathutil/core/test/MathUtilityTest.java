package org.thanhtt.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.thanhtt.mathutil.core.MathUtility;

public class MathUtilityTest {

    @Test

    public void testFactorialGivenRightArgument() {
        //assertEquals(69,69);
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(0));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(120, getFactorial(5));
        

    }
    
    //TTD;Test Driven Development là kỹ thuật lập trình mà
    //    gắn liền với việc các test case để kiểm thử ngay những hàm
    //      dev mình vừa viết 
    //      Viết code chính và viết code test(JUnit, Unit Test) xen kẽ với nnhau. 2 màu XANH ĐỎ LIÊN TỤC
    
    
    //DDT la` 1 phan mo rong cua cac UnitTest Frameword
    // DATA DRIVEN TESTING
    //                KO nham voi TDD: TEST DRIVEN DEVELOPMENT
    //                                 VIET CODE VA VIET TEST CASE SONG HANH VOI NHAU
    //CODE BOC' MUI` (BAD SMELLS) TRUNG` CODE NHIEU
    //NEN NGUOI TA CHE RA CACCH VIET CODE TEST DEP HON, GON HON, DE BAO TRI` HON
    // __+ kỹ thuật tách bộ text data ra 1 chỗ riêng, tách vào mảng, tách vào file Excel, hay table; sau đó nhồi/fill/map
    // cái data từ mảng này vào trong hàm so sánh assertEquals()
    // Giúp code dễ học hơn, để kiểm tra xem còn thiếu test case
    // này hay ko
}
