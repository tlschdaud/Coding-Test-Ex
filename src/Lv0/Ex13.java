package Lv0;

public class Ex13 {
    public String solution(String my_string, int k) {
        String answer = my_string;
        return answer.repeat(k);
    }

    public static void main(String[] args) {
        Ex13 ex13 = new Ex13();
        System.out.println(ex13.solution("String", 3));
    }
}
