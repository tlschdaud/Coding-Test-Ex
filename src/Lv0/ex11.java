package Lv0;

public class ex11 {
    public String solution(String str1, String str2) {
        String answer = "";

        for(int i = 0; i < str1.length(); i++) {
            answer += str1.substring(i, i+1);
            answer += str2.substring(i, i+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        ex11 ex11 = new ex11();
        System.out.println(ex11.solution("aaaaa", "bbbbb"));
    }
}
