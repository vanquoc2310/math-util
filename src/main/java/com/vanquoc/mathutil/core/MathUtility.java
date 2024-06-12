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
        // sửa lại từ 10 thành 1 để có màu xanh trở lại
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0...20");
        
        if (n == 0 || n == 1) 
            return 1;
        
        return n * getFactorial(n-1);
        // n! = n * (n-1)!; // stack LIFO - last in first out
        // USING RECURSION TO DEMONSTRATE REGRESSION TEST
    }
    
}

// HỌC VỀ REGRESSION TEST - KIỂM THỬ HỒI QUY
// KIỂM THỬ LẠI NHỮNG THỨ ĐÃ TỪNG KIỂM THỬ. TẠI SAO PHẢI LÀM ĐIỀU NÀY
// LÍ DO: CODE ĐANG ỔN, MÀ KO ĐỤNG VÀO NÓ, THÌ NÓ VẪN ỔN
//        NHƯNG NẾU CÓ FIX BUG, CÓ SỬA HÀM, CÓ TỐI ƯU THUẬT TOÁN TRONG HÀM
//        THÌ HÀM CẦN PHẢI ĐC TEST LẠI - TEST LẠI THỨ ĐÃ TỪNG TEST
//        TEST LẠI HÀM ĐÃ TỪNG TEST, ĐỂ XÁC NHẬN RẰNG NÓ CÒN NGON - CÒN
//        XANH HAY KO SAU KHI CODE ĐC SỬA

// NẾU CÓ UNIT TEST CODE (JUNIT) VIỆC TEST LẠI CODE CỰC NHANH
// CHỈ CẦN THẤY MÀU XANH CỦA CÁC JUNIT TEST CASE ĐC RUN LÀ ĐỦ
// NHANH NỮA: ĐƯA UNIT TEST LÊN GITHUB, CÀI CI SCRIPT (FILE YAML YML) VÀO
// MỌI THỨ TỰ ĐỘNG BÁO XANH ĐỎ LUÔN

// IỂM THỬ LẠI NHỮNG THỨ ĐÃ KIỂM THỬ GỌI LÀ TEST HỒI QUY - REGRESSION TEST
// NÊN DÙNG TỰ ĐỘNG BẰNG CÁCH XÀI UNIT TEST FRAMEWORK
// NHÌN - MẮT TỪ HÀM MAIN() CÁCH TRUYỀN THỐNG LÀ KO NÊN

// 5! = 1.2.3.4.5 = 1.2.3.4   .5
//                    4!      .5
//  .............................
// RETURN, ĐC TÍNH =
// 1! = 1

// N! = N x (N-1)!
// CÔNG THỨC ĐỆ QUY - RECRRUSION - GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
