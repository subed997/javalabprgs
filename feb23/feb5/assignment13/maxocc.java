package feb23.feb5.assignment13;

// 8) Write a program to find the maximum occurring character in String
public class maxocc
{
        public static char maxocch(String str) {
            int[] chCnt = new int[128];
            for (int i = 0; i < str.length(); i++)
            {
                chCnt[str.charAt(i)]++;
            }
            char maxChar = ' ';
            int maxCount = -1;
            for (int i = 0; i < chCnt.length; i++) {
                if (chCnt[i] > maxCount) {
                    maxCount = chCnt[i];
                    maxChar = (char) i;
                }
            }
            return maxChar;
        }
        public static void main(String[] args) {
            String str = "programmings skills";
            char maxChar = maxocch(str);
            System.out.println("The maximum occurring character is: " + maxChar);
        }
    }
