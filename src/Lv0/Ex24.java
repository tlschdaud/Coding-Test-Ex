package Lv0;
/*
원소들의 곱과 합
* 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
* */
public class Ex24 {
    public static int solution(int[] num_list) {
        int sum = 0;
        int mulSum = 1;

        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mulSum *= num_list[i];
        }

        sum = (int)Math.pow(sum,2);

//        if(sum> mulSum) {
//            return 1;
//        } else {
//            return 0;
//        }
        return sum > mulSum ? 1:0;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
    }

    }
