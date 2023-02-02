//1)Create a function to return the longest word in a string.


public class SmallestLargestWord
{
public static void main(String arg[])
{
String string="dummy text of the printing and typesetting industry.";
String word="",small="",large="";
String[] words = new String[100];
int length=0;

//String=string+"";
for(int i=0;i<string.length();i++)
{
if(string.charAt(i)!=0)
{
word=word+string.charAt(i);
}
else
{
words[length]=word;
length++;
word="";
}
} 
small=large=words[0];
for(int k=0;k<string.length();k++)
{
if(small.length()>words[k].length())
small=words[k];

if(large.length()<words[k].length())
large=words[k];
}
System.out.println("smallest word"+small);
System.out.println("largest word"+large);
}
}