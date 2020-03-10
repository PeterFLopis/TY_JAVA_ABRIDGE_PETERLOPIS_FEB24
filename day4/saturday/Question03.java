package com.capgemini.quiz.day4.saturday;

public class Question03 {

    public static void main(String args[])
    {
        display arr = new display();
        arr.x = 0;      
        arr.cal(2);
        System.out.print(arr.x);
    }

}

interface calculate
{
    void cal(int item);
}
class display implements calculate
{
    int x;
    public void cal(int item)
    {
        x = item * item;            
    }
}

/* what is the output: */

/*
a) 0
b) 2
c) 4
d) None of the mentioned

*/