import java.io.*;
import java.util.*;

public class Queue
{
        final int size=100000;
        int[] stack1=new int[size];
        int[] stack2=new int[size];
        int top1=-1;
        int top2=-1;

    public  void enque(int number)
    {

        stack1[++top1]=number;
    }
     void deque()
     {
        while(top1!=-1)
        {
            top2++;
            stack2[top2]=stack1[top1];
            top1--;
        }
        top2--;
        while(top2!=-1)
        {
            top1++;
            stack1[top1]=stack2[top2];
            top2--;
        }
    }
     void print()
     {
        System.out.println(stack1[0]);
    }

    public static void main(String[] args)
    {
      Scanner in=new Scanner(System.in);
      int operations=in.nextInt();
      Queue s=new Queue();
     while(operations-- >0)
     {
        int option=in.nextInt();
        switch(option)
        {
            case 1:
                    int number=in.nextInt();
                    s.enque(number);
                    break;
            case 2:
                    s.deque();
                    break;
            case 3:
                    s.print();
                     break;
        }



       }
    }
}
