package ch03.array;

/**
 * @날짜 : 2025. 8. 21.
 * @작성자: 김현희
 * @설명 : 2차원배열 
 */
public class Exam42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double score[] []=new double [] [] {{3.3,3.4},
		                                  {3.5,3.6},  
		                                  {3.7,4.0},
		                                  {4.1,4.2}}; 
		
		double sum = 0.0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				sum+= score[i][j];
			}
		}
		
		System.out.println("전체합:"+ sum);
		//10 int a=10
		//1 2 3 4 5 6 7 8 9 int[] array= new int[]{1....9} array[5]
		
		//1234
		//5678
		//9101112 int[][] array = new int [][] {{.},{.},{.}} array[1][2]
        		
	
		
	}

}
