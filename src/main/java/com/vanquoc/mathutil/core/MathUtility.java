/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vanquoc.mathutil.core;

/**
 *
 * @author 84868
 */
public class MathUtility {
    // ta sẽ viết những hàm cung cấp cho bên ngoài sử dụng
    // giống như thư viện Math. của JDK
    // Các hàm mang ý nghĩa tiện ích dùng chung cho nhiều nơi
    // thì sẽ được thiết kế là static
    // static sẽ đc gọi trực tiếp qua tên class
    
    // hàm tính n! = 1.2.3.4...n
    // n 0...20; do 21! tràn kiểu long, ko có âm giai thừa
    // 0! = 1;
    public static long getFactorial(int n) {
        long product = 1; // biến con heo đất, biết nhân dồn
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0...20");
        
        if (n == 0) 
            return 1;
        
        // code chạy đến đây, n = {1...20}
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    
    
}
