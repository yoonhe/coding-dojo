/*
    1. 전체 길이 - 4 까지의 문자열의 길이를 구한다 길이만큼 *을 만든다
    2. 1번 뒤에 전체길이 -4 ~ 전체길이 까지의 문자열을 더해준다
*/

class Solution {
    public String solution(String phone_number) {
        String answer = "";

        int lastIndex = phone_number.length();

        String visibleNumber = phone_number.substring(lastIndex - 4);
        String unVisibleNumber = "*".repeat(lastIndex - 4);


        return unVisibleNumber + visibleNumber;
    }
}
