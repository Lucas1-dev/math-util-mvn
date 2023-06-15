
package org.thanhtt.mathutil.core;


//class nay` clone class java.util.Math
//
public class MathUtility {
  public static final double PI = 3.1415;
  
  //Class nay` chua' ham` static
  // tinh' giai thua` n! = 1.2.3.4.5.....
  //quy uoc' thiet' ke' ham` nay` nhu sau
  // 0! = 1! = 1
  // khong co giai thua` so am. Neu dua so am, chui
  // giai thua` tang nhanh, 20! vua` kip full kieu long
  // do do 21! ko dung` kieu long dc. Neu dua > 21, chui
  // Chui: ko tra ve gia tri gi ca ma NEM RA NGOAI LE EXCEPTION
  
  public static long getFactorial(int n){
      
      if(n < 0 || n > 20)
          throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz!");
      if(n == 0 || n == 1)
          return 1;
      
      
      long product = 1; // tich nhan don` khoi dong tu 1
      
      for(int i = 2; i <= n; i++)
           product *= 1;
      return product;
      
      
  }
  
}

//TDD: Test Driven Development phat trien phan mem theo phong cach
// code den' dau kiem thu den do', viet code va` viet test case run
//dien ra song song, dan xen


//cu co ham la co test case
//viet ra cac test case du bao quat cac tinh huong xai ham
//test case: la bo du lieu dung de dua vao`.app/ham` de mo phong lai
// 1 tinh huong xai` app/ham`. No co input data, giai thich cach dung ham
//va co gia tri tra ve expected
// lat hoi run( test run/ test execution) de luan dung sai
//dan DEV giong dan QC o cho nay`:
// deu phai viet/tao ra testCase, deu` phai tien hanh run/chay test
// va deu phai doc ket qua dung sai
// DEV khac TESTER la phai viet CODE lam APP!!!

// Tese case ko viet tu do ma` viet theo template
//Viet tu do: 0!->1; 1! ->1; 2! ->2; 3->6; 5->120
//Viet chuan lai testcase (XUAT HIEN TRONG DE THI, PE, KHOA LUAN T/N VA` 
//DI LAM

//TEST CASE #1: (muc tieu test) check getF() with n=0
//Steps-Procedures (cach tien hanh test - input/output....)
//          1.Given n=0
//          2.Call the getF(n) getF(0)
// Expected results: (ket qua ky vong)
//              getF(0) must return 1

//TEST CASE #1: (muc tieu test) check getF() with n=0
//Steps-Procedures (cach tien hanh test - input/output....)
//          1.Given n=1
//          2.Call the getF(n) getF(1)
// Expected results: (ket qua ky vong)
//              getF(1) must return 1