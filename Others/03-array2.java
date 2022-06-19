class array2
{
public static void main(String argv[])
{
int a[][]=new int [2][2];
int i,j;
a[0][0]=10;
a[0][1]=20;
a[1][0]=30;
a[1][1]=40;
System.out.print("\n values of a[]a[]\n");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print("\t" +a[i][j]);
}
System.out.print("\n");
}
}
}



