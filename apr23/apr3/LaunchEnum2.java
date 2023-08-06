package apr23.apr3;
enum Result
{
    PASS,FAIL,NR;
    int marks;
    Result()
    {
        System.out.println("Constructor is Enum");
    }
    int getMarks()
    {
        return marks;
    }
    void setMarks(int marks)
    {
        this.marks = marks;
    }
    //        public static final Result PASS = new Result();
//        public static final Result FAIL = new Result();
//        public static final Result NR=new Result();
        }
public class LaunchEnum2
{
    public static void main(String[] args)
    {
        Result.PASS.setMarks(50);
        int m1=Result.PASS.getMarks();
        System.out.println(m1);

        int m2=Result.FAIL.getMarks();
        System.out.println(m2);

        Result.NR.setMarks(45);
        int m3= Result.NR.getMarks();
        System.out.println(m3);

    }
}
