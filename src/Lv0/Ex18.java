package Lv0;

//홀짝에 따라 다른 값 반환하기
//양의 정수 n이 매개변수로 주어질 때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고
// n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
public class Ex18 {
    public static int solution(int n) {
        int answer = 0;
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i += 2) {
                 answer += i;
            }
        } else {
            for (int i = 0; i <= n; i += 2) {
                answer = (int) Math.pow(i, 2);
            }
        }
        return answer;
        // 남이 푼 방식
//            int answer = 0;
//
//            for (int i = n; i >= 0; i-=2 ) {
//                answer += n % 2 == 1 ? i : i*i;
//            }
//
//            return answer;
        }
    


        public static void main (String[]args){
            System.out.println(solution(9));

        }
    }
