/*
    // 체크용 numbers [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    // 입력받은 numbers
    // 0과 numbers를 모두 비교
    // 0과 일치하는 숫자가 있다면 루프 종료
    // 0과 일치하는 숫자가 하나도 없다면 answer에 숫자를 더해준다
    // 즉 2중 루프를 돌아야 함
    // 체크용 number 루프 
        // 입력받은 numbers 루프
*/

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for(int i = 0; i < 10; i += 1) {
            Boolean isExisted = false;

            for(int number:numbers) {
                if(i == number) {
                    isExisted = true;
                    break;
                }
            }

            if(!isExisted) {
                answer += i;
            }
        }

        return answer;
    }
}
