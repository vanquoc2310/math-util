/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vanquoc.mathutil.core.test;

import com.vanquoc.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author 84868
 */
public class MathUtilityDDTest {
    // chuẩn bị data, sau này đưa vào hàm assert() của Framework
    // data này sẽ từ từ đc trích vào trong hàm assert
    // nó nằm trong hàm có style là static - nằm cố định ở 1 vùng ram
    // Test case
    // 0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 4! -> 24; 5! -> 120; 6! -> 720;  
    // ta thấy có các bộ data
    // {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}...
    // [7][2]
    // ta để riêng data này 1 mảng 2 chiều

    public static Object[][] initData() {
        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    
    // Test case so sánh hàm có trả về kì vọng hay ko
    @ParameterizedTest // chỉ ra rằng phương thức kiểm thử sẽ được chạy nhiều lần, mỗi lần với một bộ dữ liệu khác nhau.
                       // Thay vì viết nhiều phương thức kiểm thử riêng biệt cho từng bộ dữ liệu,
                       // bạn có thể sử dụng một phương thức kiểm thử tham số hóa để tiết kiệm thời gian và công sức.
    @MethodSource("initData")
    // chỉ ra rằng dữ liệu kiểm thử sẽ được cung cấp bởi một phương thức khác.
    //Phương thức này trả về một luồng (stream) các tham số sẽ được sử dụng để chạy các bài kiểm thử.
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}

// PHẦN KIẾN THỨC BỔ SUNG VÀO CV
// TDD - TEST DRIVEN DEVELOPMENT
// LÀ KĨ THUẬT VIẾT CODE CỦA DÂN DEV ĐI KÈM VỚI VIẾT CÁC TEST CASE
// ĐỂ KIỂM THỬ NGAY NHỮNG CODE VỪA VIẾT
// TỨC LÀ CODE CỦA MỖI HÀM, LUÔN ĐI KÈM CODE KIỂM THỬ
// KẾT QUẢ KIỂM THỬ HIỂN THỊ THEO 2 MÀU XANH - CODE NGON, PASS CÁC TEST CASE
// MÀU ĐỎ, CODE ĐÃ KO PASS TEST CASE
// VIỆC NÀY CỨ LIÊN TỤC NHƯ VẬY, VIẾT CODE, VIẾT TEST CASE, RUN TEST CASE
// ĐỂ XEM XANH ĐỎ, KĨ THUẬT NÀY GỌI LÀ TDD
// MỌI NNLT ĐỀU HỖ TRỢ CÁC BỘ THƯ VIỆN, FRAMEWORK GIÚP TEST CODE 2 MÀU XANH ĐỎ
// GỌI LÀ UNIT TESTING FRAMEWORK
// MỌI NGÔN NGỮ ĐỀU HỖ TRỢ TDD, VẤN ĐỀ LÀ DEV TEAM CÓ XÀI HAY KO
// NHÓM LÀM OBS CÓ XÀI
// ĐỀ BÀI THUYẾT TRÌNH NHÓM
// NHÓM HÃY CHỌN 1 UNIT TESTING FRAMEWORK ĐỂ DEMO
// VÀO GOOGLE GÕ UNIT TESTING FRAMEWORK FOR <NNLT>
// C#: NUNIT, XUNIT. MS TEST...
// JAVA: TESTNG...
// JS: MOCHA, JASMINE...
// DÒNG THỨ 2 TRONG CV
// DDT - DATA DRIVEN TESTING | TỪ TƯƠNG ĐƯƠNG
//                             PARAMETERIZED TESTING
//                      VIẾT TEST CASE THEO STYLE THAM SỐ HÓA
// (ĐỪNG NHẦM VỚI TDD - TEST DRIVEN DEVELOPMENT Ở TRÊN)
// DDT LÀ PHẦN MỞ RỘNG THÊM, KĨ THUẬT NÂNG CAO ĐỂ GIÚP TỔ CHỨC
// CÁC TEST CASE KHI VIẾT CODE UNIT TEST, NÓ CÓ BÀ CON VỚI TDD
// DDT - PARAMETERIZED TESTING LÀ KĨ THUẬT VIẾT CÁC TEST CASE
// MÀ TA TÁCH RIÊNG PHẦN DATA RA KHỎI CÁC CÂU LỆNH ASSERT()
// CHO DỄ QUẢN LÍ TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE
// DỄ THEO DÕI CÁC PHẦN CODE LIÊN QUAN ĐẾN TEST HÀM
// VÌ CÂU LỆNH SO SÁNH EXPECTED VS. ACTUAL TRỞ NÊN GỌN NHẸ HƠN
