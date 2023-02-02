//5)Write a program that accepts an email string and validates that email. If email is valid must display success message and If email is not valid must display error message

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidEmail
{
public static void main(String arg[])
{
String regex="^(.+)@(.+)$";
Scanner sc=new Scanner(System.in);
String email=sc.nextLine();
Pattern pattern=Pattern.compile(regex);

Matcher matcher=pattern.matcher(email);

if(matcher.matches())
{
System.out.println("valid email");
}
else
{
System.out.println("invalid");
}
}
}
