package javasessions;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-1,0,1,2,3,4,6,7,8,9,10};
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int j=-1;j<=10;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		int miss=(sum1-sum);
		if(miss==0) {
			System.out.println("No missing number found");
		}else {
			System.out.println("Missing number is::>"+miss);
		}
	}

}
