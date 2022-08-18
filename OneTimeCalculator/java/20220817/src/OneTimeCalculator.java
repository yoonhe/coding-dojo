import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OneTimeCalculator {
    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);

        System.out.println("급할 때 사용하는 일회용 계산기 숫자를 입력해 주세요:");

        double x = scanner.nextDouble();

        System.out.println("연산자를 선택해주세요:");
        System.out.println("1. + (더하기)");
        System.out.println("2. - (빼기)");
        System.out.println("3. * (곱하기)");
        System.out.println("4. / (나누기)");

        int operatorIndex = scanner.nextInt();

        String operator = "";

        if(operatorIndex == 1) {
            operator = "+";
        }

        if(operatorIndex == 2) {
            operator = "-";
        }

        if(operatorIndex == 3) {
            operator = "*";
        }

        if(operatorIndex == 4) {
            operator = "/";
        }

        System.out.println("숫자를 입력해 주세요:");

        double y = scanner.nextDouble();

        double result = 0;

        if(operator.equals("+")) {
            result = x + y;
        }

        if(operator.equals("-")) {
            result = x - y;
        }

        if(operator.equals("*")) {
            result = x * y;
        }

        if(operator.equals("/")) {
            result = x / y;
        }

        System.out.println("계산 결과: " + result);
    }
}