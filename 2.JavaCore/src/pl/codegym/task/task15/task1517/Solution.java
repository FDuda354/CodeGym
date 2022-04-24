package pl.codegym.task.task15.task1517;

/* 
Modyfikatory statyczne i wyjątki
*/

public class Solution {
    public static int A = 0;

    static int foo = 0;

    static
        {
            if (Math.sin(3) < 0.5)
            {
                throw new ArithmeticException();
            }
            else
            {
                foo = 3;
            }
        }


    public static int B = 5;

    public static void main(String[] args) throws Exception{
        Solution t = new Solution();
        System.out.println(Solution.foo);
        System.out.println(B);
    }

}
