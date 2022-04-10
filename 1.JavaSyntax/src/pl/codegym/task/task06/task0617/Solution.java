package pl.codegym.task.task06.task0617;

/* 
Notes na nowe idee
*/

public class Solution
{
    public static void main(String[] args)
    {
        printIdea(new Idea());
    }

 public static class Idea
 {
     public String getOpis()
     {
         return "Pomysł";
     }

 }
    //tutaj wpisz swój kod
    public static void printIdea(Idea idea)
    {

        System.out.println(idea.getOpis());
    }
}
