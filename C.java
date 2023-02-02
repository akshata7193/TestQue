//4)Create a class that accepts two numbers. Create another class that fetches the last digit of those two numbers. Create a third class that multiplayer that last two digits.


class A
{
private int num1;
private int num2;

public ClassA()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first no");
num1=sc.nextInt();
System.out.println("enter second no");
num2=sc.nextInt();
}
public int getNum1()
{
return num1;
}
public int getNum2()
{
return num2;
}
}
class B
{
private int num1;
private int num2;

public ClassB(int num1,int num2)
{
this.num1=num1%100;
this.num2=num2%100;
}
public int getNum1()
{
return num1;
}
public int getNum2()
{
return num2;
}
}
public class C
{
public static void main(String arg[])
{
ClassA a=new ClassA();
ClassB b=new ClassB(a.getNum1(),a.getNum2());
System.out,println("Result: "+b.getNum1()*b.getNum2());
}
}
