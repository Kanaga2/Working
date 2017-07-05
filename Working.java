# Working
import java.io.*;
import java.util.*;
public class Working
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a day");
String day=br.readLine();
if(day.equalsIgnoreCase("sunday"))
return false;
else
return true;
}
}
