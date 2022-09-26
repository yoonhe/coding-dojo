/*
*
1. 정수 제곱근을 구한다
2. 제곱근이 정수인지 아닌지 판별한다
   - 정수는 1로 나누었을 경우 항상 나머지가 0이 되는 속성을 이용하여 정수인지 체크한다
3. 정수라면 ? 제곱근 + 1 의 제곱을 반환
4. 정수가 아니라면 ? -1 반환
*
* */

class Solution {
    private long n;

    public long solution(long n) {
        this.n = n;

        long squareRoot = (long) Math.sqrt(n);

        if(checkSquareRoot(n)) {
            return (squareRoot + 1) * (squareRoot + 1);
        }

        return -1;
    }

    public boolean checkSquareRoot(long number) {
        boolean isSquareRoot = Math.sqrt(number) % 1 == 0;

        return isSquareRoot;
    }
}
