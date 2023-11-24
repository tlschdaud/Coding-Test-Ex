package Lv0;

public class ex10 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string;
        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        return answer;
    }

    public static void main(String[] args) {
        ex10 ex10 = new ex10();
        System.out.println(ex10.solution("He11oWor1dddddd",	"lloWorl",	2));

    }
}
