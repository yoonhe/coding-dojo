class Solution {
    public String solution(String[] seoul) {
        int index = findKimIndex(seoul);

        return "김서방은 " + index + "에 있다";
    }

    public int findKimIndex(String[] seoul) {
        for(int i = 0; i < seoul.length; i += 1) {
            if (checkKim(seoul[i])) {
                return i;
            }
        }

        return 0;
    }

    public boolean checkKim(String name) {
        return name.equals("Kim");
    }
}
