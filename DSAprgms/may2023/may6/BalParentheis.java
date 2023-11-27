package may2023.may6;
// print balanced parenthesis
public class BalParentheis
{
    public static void balParenthPrint(int n,int oc,int cc,String ans)
    {
        if(oc == n && cc == n)
        {
            System.out.println(ans);
            return;
        }
        if(oc < n)
        {
            balParenthPrint(n,oc+1,cc,ans+'(');
        }
        if(oc >cc)
        {
            balParenthPrint(n,oc,cc+1,ans+')');
        }
    }
    public static void main(String[] args)
    {
        balParenthPrint(2,0,0,"");
    }
}
