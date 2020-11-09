package Task2;
import java.util.*;


class Task2_10
   {
   static Scanner sc=new Scanner(System.in);
   static List st=new ArrayList();
   public static int answer(int p,int a,int d)
      {
	     int [] arr=new int[p];
		 for(int i=0;i<p;i++)
		    {
			    System.out.println("Enter the elements of the array");
				
				arr[i]=sc.nextInt();
				
			}
		
		 int x=1;
		 for(int k=0;k<arr.length;k++)
		 {
			 x=2*x;
		 }
		 x=x-1;
		 
		 for(int i=1;i<=x;i++)
		     {
			    String sty=Integer.toString(i,2);
				int m=0;
				int t=arr.length-sty.length();
				for(int n=0;n<t;n++)
				  {
				  sty="0"+sty;
				  }
				  //System.out.println(sty);
				for(int j=0;j<sty.length();j++)
				{
				if(sty.charAt(j)=='1')
				   {
				   m++;
				   }
				}
				int [] arru=new int[m];
				int h=0;
				for(int j=0;j<sty.length();j++)
				{
				if(sty.charAt(j)=='1')
				   {
				   arru[h]=arr[j];
				   h++;
				   }
				}
				if(arru.length==a)
				   {
				   int sum=0;
				   for(int o=0;o<a;o++)
				      {
					  sum=sum+arru[o];
					  }
					  st.add(sum);
				    }
				/*int expectedSum=(Integer)st.get(0);
				int actualSum=(Integer)st.get(d-1);
				int result=actualSum-expectedSum;*/
				System.out.println(st);
			
			}
			Object [] arr3=st.toArray();
			Arrays.sort(arr3);
			int expectedSum=(Integer)arr3[0];
				int actualSum=(Integer)arr3[d-1];
				int result=actualSum-expectedSum;
				System.out.println(result);
				return result;
		}	
			
			
			
	
   public static void main(String[] args)
       {
		System.out.println("Enter the Number of Testcases");
		int f=sc.nextInt();
		for(int i=0;i<f;i++)
		{
			System.out.println("Enter the size of the array");
			int d=sc.nextInt();
			System.out.println("Enter the size of subset");
			int r=sc.nextInt();
	        System.out.println("Enter how many times data will be pop out");
			int e=sc.nextInt();
			int v=answer(d,r,e);
			System.out.println(v);
			
		}
	   
	   }
   
 }
   