// numbers1[0][0] numbers2[0][0]
// numbers1[0][1] numbers2[0][1]
// numbers1[1][0] numbers2[1][0]
//
// 1. 부모 배열을 순회한다
// 2. 자식 배열을 순회한다
// 3. 부모 배열의 index - i, 자식 배열의 index -j 을 뽑는다
// 4. 내부 배열을 순회할 떄마다 부모 배열[i][j] + 자식 배열[i][j] 더한 값을 answer[i][j] 에 넣어준다

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i += 1) {
            for(int j = 0; j < arr1[i].length; j += 1) {
                int sum = arr1[i][j] + arr2[i][j];

                answer[i][j] = sum;
            }
        }

        return answer;
    }
}
