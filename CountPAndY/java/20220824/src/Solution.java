/*
 1. 문자를 소문자로 변환한다
 2. p의 개수와 y의 개수를 파악한다
 3. p와 y의 개수가 동일하다면 ? true : fase
 4. p와 y가 하나도 없다면 true
*/

class Solution {
    boolean solution(String string) {
        boolean answer = true;

        String lowercase = string.toLowerCase();

        String[] strings = lowercase.split("");

        int countOfp = 0;
        int countOfy = 0;

        for(int i = 0; i < strings.length; i += 1) {
            if(strings[i].equals("p")) {
                countOfp += 1;
            }

            if(strings[i].equals("y")) {
                countOfy += 1;
            }
        }

        if(countOfp != countOfy) {
            answer = false;
        }

        return answer;
    }
}
