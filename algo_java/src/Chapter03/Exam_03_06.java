package Chapter03;

import java.util.Scanner;

public class Exam_03_06 {
    public static int solution(int n, int k, int[] arr){
        // count는 0을 1로 바꾼 횟수.
        int answer = 0, count = 0, lt = 0;

        for(int rt = 0; rt < n; rt++){
            if(arr[rt] == 0) count++;

            while(count > k){
                if(arr[lt] == 0) count--;
                lt++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = input.nextInt();

        System.out.print(solution(n, k, arr));
    }
}
