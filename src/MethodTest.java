import java.util.Scanner;

/**
 * User：huyue_dxm
 * Date:2021/4/13
 * Time:11:31 下午
 */
public class MethodTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 求三个数中的最大数
//        int n1 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        int n3 = scanner.nextInt();
//        System.out.println(maxThreeNum(n1, n2, n3));


        // 求前 n 个数的阶乘之和  （求前 5 个数的阶乘之和：1! + 2! + 3! + 4! + 5!）
        int n = scanner.nextInt();
        System.out.println(factor(n));
    }

    public static int factor(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int ret = 1;
            for (int j = 1; j <= i; j++) {
                ret *= j;
            }
            sum += ret;
        }
        return sum;
    }


    public static int maxThreeNum(int num1, int num2, int num3) {
        return maxNum(maxNum(num1, num2), num3);
    }

    public static int maxNum(int num1, int num2) {
        return Math.max(num1, num2);
    }
}
