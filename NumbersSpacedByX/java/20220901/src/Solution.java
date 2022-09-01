/*
        만약 x = 2, n 5 라면
        2 2+2 2+2+2 2+2+2+2 2+2+2+2+2
        
        x = 4 n = 3
        4 4+4 4+4+4
        
        1 ~ n 까지 순회
        각 루프의 i와 x를 곱한값을 준비된 배열에 넣어준다!
*/
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        // TODO : 13, 14 왜 통과가 안될까? 놓친부분은 ?
        // 

        for(int i = 0; i < n; i += 1) {
            // long number = (i + 1) * x; -> 테스트코드가 실패한 이유를 알아보자

            // (i + 1) 을 먼저 long으로 바꿔주고 x를 곱해주는거랑
            // (i + 1) * x 가 int로 계산되고 long으로 변환해주는거랑 무슨 차이지?

            answer[i] = (long) (i + 1) * x;;
        }

        return answer;
    }
}
