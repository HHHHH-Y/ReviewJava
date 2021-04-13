import java.util.Scanner;

/**
 * User：huyue_dxm
 * Date:2021/4/13
 * Time:10:28 下午
 */
public class TestDemo1 {
    // 15 的二进制序列中有多少个 1 （0000 0000 0000 1111）
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println("count: " + count);
    }

    public static void main1(String[] args) {
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
