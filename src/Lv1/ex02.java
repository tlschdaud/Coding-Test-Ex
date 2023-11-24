package Lv1;
//나머지가 1이 되는 수 찾기
public class ex02 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i < n; i++) {
            if(n%i==1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ex02 ex02 = new ex02();
        System.out.println(ex02.solution(12));
    }
}
