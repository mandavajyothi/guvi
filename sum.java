static int findsum(int N,int K)
{ 
int ans=0;
int y=N/K;
int x=N%K;
ans=(k*(k-1)/2)*y+(x*(x+1))/2;
return ans;
}
static public void main(String args[])
{
int N,K;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
K=sc.nextInt();
System.out.println(findsum(N,K));
}
