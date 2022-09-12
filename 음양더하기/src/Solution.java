class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < absolutes.length; i += 1) {
            int num = absolutes[i];

            if(!signs[i]) {
                answer -= num;
                continue;
            }

            answer += num;
        }

        return answer;
    }
}
