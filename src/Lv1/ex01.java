package Lv1;

public class ex01 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        double cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            cnt += 1;
        }
        answer = sum / cnt;
        return answer;
    }

    public static void main(String[] args) {
        ex01 solution = new ex01();
        int[] x = {3, 5, 6};
        System.out.println(solution.solution(x));

    }
}

