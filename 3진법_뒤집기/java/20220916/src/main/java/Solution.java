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
        // 0021 -> 3^0 * 1 + 3^1 * 2
        // 0 ~ 3
        String[] words = s.split("");

        int result = 0;

        for(int i = 0; i < words.length; i += 1) {
//            result += Math.pow(3, i) * words[i]
        }

//        return Integer.parseInt(s, 3);
        return result;
    }
}
