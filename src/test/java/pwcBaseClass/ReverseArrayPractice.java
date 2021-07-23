package pwcBaseClass;

public class ReverseArrayPractice {
	static int N =3;
	static int M=3;
	public static void RevArray(int a[][])
	{
		
		for(int i=0;i<N;i++) {
			
			int Start=0;
			int End=N-1;
			
			while(Start<End) {
				
				int temp=a[i][Start];
				System.out.println("temp: "+temp);
				a[i][Start]=a[i][End];
				System.out.println("a[Start][i]"+a[Start][i]);
				a[i][End]=temp;
				System.out.println("a[i][End]"+a[i][End]);
				
				
				
				Start++;
				System.out.println("Start is: "+Start);
				End--;
			}
			}
		for(int j=0;j<M;j++) {
			
			for(int k=0;k<N;k++) {
				
				System.out.println(a[j][k]);
			}
			System.out.println();
		}
		
		
	}
	

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},
				      {4,5,6},
				      {7,8,9}};
		
		
		
		RevArray(arr);

	}

}
