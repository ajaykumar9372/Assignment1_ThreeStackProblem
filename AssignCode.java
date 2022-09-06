

class PEMS {
	
	
	public int maxSum(int stack1[], int stack2[],int stack3[], int n1, int n2,int n3)
	{
	int sum1 = 0, sum2 = 0, sum3 = 0;
	

	for (int i=0; i < n1; i++)
		sum1 += stack1[i];
	
	
	for (int i=0; i < n2; i++)
		sum2 += stack2[i];
	
	
	for (int i=0; i < n3; i++)
		sum3 += stack3[i];
	

	int top1 =0, top2 = 0, top3 = 0;
	int ans = 0;
	while (true)
	{
	
		if (top1 == n1 || top2 == n2 || top3 == n3)
			return 0;
	

		if (sum1 == sum2 && sum2 == sum3)
			return sum1;
		

		if (sum1 >= sum2 && sum1 >= sum3)
			sum1 -= stack1[top1++];
		else if (sum2 >= sum1 && sum2 >= sum3)
			sum2 -= stack2[top2++];
		else if (sum3 >= sum2 && sum3 >= sum1)
			sum3 -= stack3[top3++];
	}
	}
}



public class AssignCode {
    
public static void main(String[] args) {
    
    int stack1[] = { 8, 5, 3};
    int stack2[] = { 6, 9, 4, 2, 2 };
    int stack3[] = { 3, 2, 1, 2 };
    
    int n1 = stack1.length;
    int n2 = stack2.length;
    int n3 = stack3.length;
PEMS ans=new PEMS();




System.out.println(ans.maxSum(stack1, stack2, stack3, n1, n2, n3));


}








}
