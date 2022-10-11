package cn.com.dhc;

/**
 * @Auther: Evin_D
 * @Date: 2022/10/10 - 下午6:45
 * @Description: cn.com.dhc
 * @version: 1.0
 */
public class printB {
    public static void main(String[] args) {
        int num = 4;
        print(num);
    }
    /**
    * 功能描述: 显示数字的二进制
    * @param: int num
    * @return: null
    * @auther: Evin_D
    * @date: 2022/10/10 - 下午6:46
     */
    public static void print(int num) {
        for (int i = 32; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
    }
}
