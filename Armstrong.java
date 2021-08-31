public class armstrong
{
	public static void main(String[] args){
		
	int number=371, orignalNo, remainder,result=0;
	orignalNo=num;
	while(orignalNo!=0)
	{
		remainder=orignalNo%10;
		result+=Math.pow(remainder,3);
		orignalNo /=10;
	}
	
		if(result==num)
			system.out.println(num +"is an armstrong no.");
		else
			system.out.println(num +"is not an armstrong no.");
	}
}
		