class Solution {
    public int solution(int n) {
        String ternary = decimalToTernary(n);

        return ternaryToDecimal(ternary);
    }

    public String decimalToTernary(int n) {
        String result = "";

        int initNumber = n;

        while (initNumber >= 3) {
            int restNumber = initNumber % 3;

            result += restNumber;

            initNumber = initNumber / 3;
        }

        result += initNumber;

        return result;
    }

    public int ternaryToDecimal(String s) {
        return Integer.parseInt(s, 3);
    }
}
