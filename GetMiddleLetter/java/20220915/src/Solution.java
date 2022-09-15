class Solution {
    public String solution(String s) {
        String answer = "";

        boolean isEven = s.length() % 2 == 0;

        int midPoint = s.length() / 2;

        if(isEven) {
            return s.substring(midPoint - 1, midPoint + 1);
        }

        return s.substring(midPoint, midPoint + 1);
    }
}
