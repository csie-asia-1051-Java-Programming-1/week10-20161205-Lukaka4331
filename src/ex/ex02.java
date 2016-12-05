package ex;
import java.util.Scanner;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021044 鐘岑哲
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scn=new Scanner(System.in);
          System.out.print("輸入度數=");
          float n=scn.nextInt();
		 if(n<=120){
			  System.out.print("夏月="+n*2.10);
			  System.out.print("非夏月="+n*2.10);

		 }
		 if(n<=330&&n>120){
			 System.out.print("夏月="+((n-120)*3.02+120*2.10));
			 System.out.print("非夏月="+((n-120)*2.68+120*2.10));

			 
		 }
		 if(n<=500&&n>330){
			 System.out.print("夏月="+((n-330)*4.39+210*3.02+120*2.10));
			 System.out.print("非夏月="+((n-330)*3.61+210*2.68+120*2.10));
			 
		 }
		 if(n<=700&&n>500){
			 System.out.print("夏月="+((n-500)*4.97+170*4.39+210*3.02+120*2.10));
			 System.out.print("非夏月="+((n-500)*4.01+170*3.61+210*2.68+120*2.10));
			 
		 }
		 if(n>700){
			 System.out.print("夏月="+((n-700)*5.63+200*4.97+170*4.39+210*3.02+120*2.10));
			 System.out.print("非夏月="+((n-700)*4.50+200*4.01+170*3.61+210*2.68+120*2.10));

			 
		 }
		
		
		
	}

}
