package feb23.feb5.assignment13;

import java.sql.SQLOutput;

// 1) Write a program to remove duplicates from a string
public class remdups {
    public static void main(String[] args) {
        String s1 = "balloon";
        String s2 = "";
        char ar[] = s1.toCharArray();

        for (int i = 0; i <= ar.length - 1; i++) {
            if (s2.indexOf(ar[i]) < 0) {
                s2 = s2 + ar[i];
            }
        }
        System.out.println(s2);
    }
}

