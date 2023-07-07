package mar23.mar6;
// Checked and Unchecked Exception

// UNCHECKED EXCEPTION
//{
//    public static void main(String[] args)
//    {
//        int result =7/0;
//        System.out.println(result);
//    }
//}
//OUTPUT:Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at mar23.mar6.ExceptionTest.main(ExceptionTest.java:7)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

//CHECKED EXCEPTION
public class ExceptionTest
{
    public static void main(String[] args)
    {
        int result = 7/0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str= br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}