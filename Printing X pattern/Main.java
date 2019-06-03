import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args) 
  
{
  Scanner in=new Scanner(System.in);
  int x=in.nextInt();

 char[] chars = new char[x];
 for (int i = 0; i < x; i++) {
 chars[i] = '*';
 chars[x - 1 - i] = '*';
 for (int j = 0; j < x; j++) 
  {
    if (j == i || j == (x - 1 - i)) 
      {
        continue;
      }
  chars[j] = ' ';
  }
System.out.println(new String(chars));
}
}
}