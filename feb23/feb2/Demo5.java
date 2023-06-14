package feb23.feb2;
// Anonymous Array:


class Calc1
{
 	public int add(int nums[])
	{
		int result=0;
		for(int n:nums)
		{
			result=result+n;
		}
		return result;
	}
}

public class Demo5
{
	public  void main(String[] args)
    {

	Calc1 obj= new Calc1();
	int result=obj.add(new int[]{5,2,3,7,8,2});
	System.out.println(result);
	}
}
