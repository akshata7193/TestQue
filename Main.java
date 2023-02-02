//2)Find the maximum number in a jagged array of numbers or array of numbers.

class Main
{
public static void main(String arg[])
{
int[][] array={2,4,10,{12,4,{100,99},4},{3,2,99},0};
int max=array[0][0];
for(int i=0;i<array.length;i++)
{
for(int j=0;j<array[i].length;j++)
{
if(array[i][j>max])
{
max=array[i][j];
}
}
}
System.out.println("maximum number is: "+max);
}
}
