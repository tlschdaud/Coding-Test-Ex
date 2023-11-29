package Lv1;

public class Ex03 {
    public int solution(String s) {
        char first = s.charAt(0);
        int firstNum = 0;
        int diff = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (firstNum == diff) {
                result++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first) firstNum++;
            else diff++;
        }
        return result;
    }

    public static void main(String[] args) {
        Ex03 divideString = new Ex03();
        System.out.println(divideString.solution("banana"));
        System.out.println(divideString.solution("abracadabra"));    // 6
        System.out.println(divideString.solution("aaabbaccccabba"));    // 3d
    }
}
