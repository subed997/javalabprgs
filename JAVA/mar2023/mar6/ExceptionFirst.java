package mar23.mar6;
// SYNTAX ERROR
public class ExceptionFirst
{
    public static void main(String[] args) {
        //System.out.printn(); //SYNTAX ERROR
        System.out.println("Hi");
    }
}
//OUTPUT: System.out.printn("Hi");
//                  ^
//  symbol:   method printn(String)
//  location: variable out of type PrintStream
//1 error
//error: compilation failed