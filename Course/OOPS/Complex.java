import java.util.*;

public class Complex 
{
    public static void main(String[] args)
    {
        Test c1 = new Test(2, 3);
        Test c2 = new Test(4, 5);
        Test a = Test.add(c1, c2);
        Test s = Test.subtract(c1, c2);
        Test p = Test.product(c1, c2);
        a.printComplex();
        s.printComplex();
        p.printComplex();
    }
}

class Test
{
    int real, img;
    public Test(int r, int c)
    {
        real = r;
        img = c;
    }
    public static Test add(Test a, Test b)
    {
        return new Test((a.real+b.real), (a.img+b.img));
    }
    public static Test subtract(Test a, Test b)
    {
        return new Test((a.real-b.real), (a.img-b.img));
    }
    public static Test product(Test a, Test b)
    {
        return new Test((a.real*b.real), (a.img*b.img));
    }
    public void printComplex()
    {
        if(real == 0 && img != 0)
        {
            System.out.println(img + "i");
        }
        else if(img == 0 && real != 0)
        {
            System.out.println(real);
        }
        else
        {
            System.out.println(real + "+" + img + "i");
        }
    }
}
