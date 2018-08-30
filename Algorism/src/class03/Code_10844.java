package class03;

import java.util.Scanner;

/*
쉬운 계단 수 


문제
 

45656이란 수를 보자.

이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.

세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)



입력
 

첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.


출력
 

첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.



예제 입력 1 복사 
 1


예제 출력 1 복사 
 9




예제 입력 2 복사 
 2



예제 출력 2 복사 
 17

*/
public class Code_10844 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=0,num=0,count=0;
		int k=9; int m=9;
		//자리의 수 입력
		n = sc.nextInt();
		//자리수 만큼 배열 생성
		int[] arr = new int[n];

		if(n==1) {
			num=9;	
		}
		if((1<=arr[0])&&(arr[0]<=9)) {
				for(int i=n-1; i<0; i--) {
					arr[i]=k; arr[i-1]=m;
					for( k=9;k<0;k--) {
						for( m=9; m<0; m--) {
							if((arr[i]-arr[i-1])==1 || (arr[i]-arr[i-1])== -1) {
								count++;
							}
						}
					}
/*					if(count==(n-1)) {
						num++;
					}*/
			}

	}
		System.out.println(num);
		System.out.println(count);
	}
}
