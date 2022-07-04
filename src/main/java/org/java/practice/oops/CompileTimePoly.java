package org.java.practice.oops;

public class CompileTimePoly{

    int multiPly(int a, int b)
    {
        return a*b;
    }

    int multiPly(int a, int b, int c)
    {
        return a*b*c;
    }

    float multiPly(float a, float b, float c)
    {
        return a*b*c;
    }

    public static void main(String[] args) {
        CompileTimePoly p = new CompileTimePoly();
        System.out.println(p.multiPly(3,4));
        System.out.println(p.multiPly(3,4,8));
        System.out.println(p.multiPly(3f,4f,1f));
    }
}


