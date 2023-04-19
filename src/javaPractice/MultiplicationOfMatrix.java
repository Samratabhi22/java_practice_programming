package javaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size for first matrix");
		int firstMatrixRowSize = sc.nextInt();
		System.out.println("Enter first matrix col size or second matrix row size");
		int firstMatrixColOrSecondMatrixRow=sc.nextInt();
		System.out.println("Enter col size for second matrix");
		int secondMatrixCol=sc.nextInt();
		int[][] firstMatrix=new int[firstMatrixRowSize][firstMatrixColOrSecondMatrixRow];
		int[][] secondMatrix=new int[firstMatrixColOrSecondMatrixRow][secondMatrixCol];
		int[][] productOfMatrix=new int[firstMatrixRowSize][secondMatrixCol];
		System.out.println("Enter values for first matrix");
		for(int i=0;i<firstMatrixRowSize;i++) {
			for(int j=0;j<firstMatrixColOrSecondMatrixRow;j++) {
				firstMatrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter values for second matrix");
		for(int i=0;i<firstMatrixColOrSecondMatrixRow;i++) {
			for(int j=0;j<secondMatrixCol;j++) {
				secondMatrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("First Matrix");
		for (int[] is : firstMatrix) {
			System.out.println(Arrays.toString(is));
		}
		System.out.println("Second matrix");
		for (int[] is : secondMatrix) {
			System.out.println(Arrays.toString(is));
		}
		System.out.println("Product of 2 Matrix");
		for(int i = 0;i<firstMatrixRowSize;i++) {
			for(int j = 0;j<secondMatrixCol;j++) {
				for(int k =0;k<firstMatrixColOrSecondMatrixRow;k++) {
					productOfMatrix[i][j]+=firstMatrix[i][k]*secondMatrix[k][j];
				}
				System.out.print(productOfMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
