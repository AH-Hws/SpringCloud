package com.javabase.bigdecimal;

import java.math.BigDecimal;

/**
 * UP-小数部分不是0四舍五入，等于0舍去
 * DOWN-直接舍去
 * CEILING-正数四舍五入，负数舍去
 * FLOOR-正数舍去，负数四舍五入
 * HALF_UP-小数部分大于等于0.5四舍五入，小于0.5舍去
 * HALF_DOWN-小数部分大于0.5四舍五入，小于等于0.5舍去
 * HALF_EVEN（even:偶数）- 整数部分是奇数，等价HALF_UP；整数部分是奇数，等价HALF_DOWN
 */

/**
 * 1.加减：获取小数部分位数，转整数，再进行加减操作，对结果以最大小数位进行缩小
 * 2.乘：获取小数部分位数，转整数，将两数值小数位数相加，得到结果需调整的小数位数，再进行乘法操作，对结果以两数值小数位数相加后的值进行缩小
 * 3.被除数-除数去小数点转整数，并记录小数位数。【正常商小数位数(scale)=被除数小数位数(dividendScale)-除数小数位数(divisorScale)】根据需保留的小数【商scale】加除数小数位数【divisorScale】和来与被除数小数位数(dividendScale)比较:
 *      A:若scale+divisorScale > dividendScale，则dividendScale-(scale+divisorScale)得到被除数需要补0的个数
 *      B:若scale+divisorScale <= dividendScale，则dividendScale - scale - divisorScale得到除数需要补0的个数
 *      从而得到以正常商小数位数(scale)为准的结果，然后在以scale对结果进线缩小【除以10^scale】
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal d2 = new BigDecimal("8");
        BigDecimal d3 = new BigDecimal("1");
        BigDecimal d4 = d2.divide(d3, -1, BigDecimal.ROUND_HALF_EVEN);

        System.out.println(d4.toString());
//        System.out.println(d2.setScale(1, BigDecimal.ROUND_HALF_EVEN).toString());
    }
}