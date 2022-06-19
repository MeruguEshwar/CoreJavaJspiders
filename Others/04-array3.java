class array3
{
public static void main(String argv[])
{
int a[][]=new int [3][];
a[0]=new int[1];
a[1]=new int[2];
a[2]=new int[3];
int i,j,k=1;
for(i=0;i<3;i++)
{
for(j=0;j<a[i].length;j++)
{
a[i][j]=(k*10);
k++;
System.out.print(" "+a[i][j]);
}
System.out.print("\n");
}
}
}