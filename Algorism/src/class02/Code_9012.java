/*괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다.
그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다.
한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다.
그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다.
예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 

여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.*/ 

package class02;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.BufferedReader;
//괄호

public class Code_9012 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); 
		         int n = Integer.parseInt(buffer.readLine()); 
		         Stack<String> stack = new Stack<>(); 
		 
		 
		         for (int i=0; i<n; ++i) 
		         { //temp에 문자가 한글자씩 끊어서 저장이 된다.
		             String[] temp = buffer.readLine().split(""); 
		             for (int j=0; j<temp.length; ++j) 
		             { 
		                 if (temp[j].equals("(")) 
		                     stack.push(temp[j]); 
		                 if(temp[j].equals(")") && stack.isEmpty()) 
		                 { 
		                     stack.push(temp[j]); 
		                     break; 
		                 } 
		                 if (temp[j].equals(")") && !stack.isEmpty()) 
		                     stack.pop(); 
		             } 
		             if (stack.isEmpty()) 
		                 System.out.println("YES"); 
		             else 
		                 System.out.println("NO"); 
		           //stack에 존재하는 모든 자료를 삭제하는 메소드 -> stack.clear()
		             stack.clear(); 
		         }  
		     } 
		 } 
