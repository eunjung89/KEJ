package src;

import java.util.Scanner;

public class AddExam {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a=0;
        int b=0;
        int c=0;
        Scanner in = new Scanner(System.in);
        System.out.print("���� ���� :");
        a = in.nextInt();
        System.out.print("������ ���� :");
        b = in.nextInt();
        for(int i=a; i<=b;i++)
            c +=i; //c=c+i;
        System.out.println(a+"���� "+b+"������ ���� "+c);
    }

}