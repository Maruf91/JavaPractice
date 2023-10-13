package pwcBaseClass;

public class arrayReverse {

	int M=3;
	int N=3;
	public void reverseArr(int arr[][]) {
		for (int i=0;i<3;i++) {
			int start=0;
			int end=N-1;
			while(start<end) {
				int temp=arr[i][start];
				arr[i][start]=arr[i][end];
				arr[i][end]=temp;
		         
				
				System.out.println("Value of Start: "+start+ "Value of End:"+end);
			start++;
			System.out.println("Value of Start: "+start+ "Value of End:"+end);
			end--;
			
		}
			
		}
	
	for(int i=0;i<M;i++) {
		
		for(int j=0;j<N;j++)
		{
			System.out.println(arr[i][j]);
		}
		
		System.out.println();
	}

	}
	
	
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};

		arrayReverse ar=new arrayReverse();
		ar.reverseArr(arr);
		System.out.println("rev array: "+ar);
	}

}
