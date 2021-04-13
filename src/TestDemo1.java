import java.util.Scanner;

/**
 * User：huyue_dxm
 * Date:2021/4/13
 * Time:10:28 下午
 *
 * 位操作符的练习
 */
public class TestDemo1 {
    // 获取一个二进制序列中所有的奇数位和偶数位
    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 31; i >= 1; i-=2) {
            System.out.print(((n >> i) & 1) + " ");
        }
        System.out.println();
        for (int i = 30; i >= 0; i-=2) {
            System.out.print(((n >> i) & 1) + " ");
        }
    }




    // 写一个函数返回参数二进制中 1 的个数（比如15，有4个1）
    // 7&6=6 6&5=4 4&3=0
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println("count: " + count);
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(((n >> i) & 1) == 1) {
                count++;
            }
            if((n >> i) == 0) {
                break;
            }
        }
        System.out.println("count: " + count);
    }
}
