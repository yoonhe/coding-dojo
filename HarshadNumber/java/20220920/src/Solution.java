/*
18
1 + 8 = 9
18 / 9 = 2
*/

class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String[] words = Integer.toString(x).split("");

        int sum = 0;

        for (String word : words) {
            sum += Integer.parseInt(word);
        }

        return x % sum == 0;
    }
}
