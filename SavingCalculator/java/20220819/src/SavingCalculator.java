import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args) {
        DecimalFormat typeConverter = new DecimalFormat("###,###");

        Scanner scanner = new Scanner(System.in);

        System.out.println("적금 이자 계산기");

        System.out.println("월적립액을 입력해주세요(원): ");
        int monthlyPayment = scanner.nextInt();

        System.out.println("적금 기간을 입력해주세요(년): ");
        int years = scanner.nextInt();
        int months = years * 12;


        System.out.println("연이자율을 입력해주세요(%): ");
        double rate = scanner.nextDouble();
        double monthlyInterestRate = rate / 100 / 12;

        int preTaxProfit = (int) (
                monthlyPayment * ((1 + monthlyInterestRate)
                        * (Math.pow((1 + monthlyInterestRate), months) - 1) / monthlyInterestRate)
        );

        int principalSum = monthlyPayment * months;

        int interest = preTaxProfit - principalSum;

        int afterTaxInterest = (int) Math.ceil(interest - interest * (15.4 / 100));

        int afterTaxProfit = principalSum + afterTaxInterest;

        System.out.println("원금합계 : " + typeConverter.format(principalSum) + "원");

        System.out.println("세후이자 : " + typeConverter.format(afterTaxInterest) + "원");

        System.out.println("세후 총 수령액 : " + typeConverter.format(afterTaxProfit) + "원");
    }
}
