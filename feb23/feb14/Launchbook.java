package feb23.feb14;

class Books
{
    private int pgNo;

    void setPgNo(int x)
    {
        if(x>0)
        {
            pgNo =x;
        }
        else
        {
            System.out.println("invalid input");
        }
    }
    int getPgNo()
    {
        return pgNo;
    }
}


public class Launchbook
{
    public static void main(String[] args)
    {
        Books b = new Books();
        //b.pgNo=100; error
        //System.out.println(b.pgNo); error

        b.setPgNo(-100);
        System.out.println(b.getPgNo());
    }
}
