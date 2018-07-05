import java.util.Scanner;
public class FindProduct{

public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int t = s.nextInt();
long[] y = new long[t];
for(int i=0;i<t;i++)
{
y[i] = s.nextInt();
}

long product = 1;
for(int j=0;j<t;j++)
{
product = (product*y[j])%1000000007;
}
System.out.println(product);

}
}


//another way....using BIgInteger 
/*...

import java.io.*;
import java.util.*;
import java.math.BigInteger;

class TestClass
{
public static void main(String args[] ) throws Exception
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
BigInteger c = new BigInteger("1");
BigInteger d = new BigInteger("1000000007");
for (int i=1; i<=n; i++) 
{
BigInteger t2 = new BigInteger(sc.nextInt()+"");
c = c.multiply(t2);
c = c.mod(d);
}
System.out.println(c);
}
}
.............*/