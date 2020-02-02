package javademo;

public class Diamond 
{
	public static void main(String[] args) 
	{
		int n=4,i,j, space;
       space = n-1;		
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            space--;
            for(j=1; j<=(2*i-1); j++)
            {
            	if (j%2==0) {
            		System.out.print(" ");
					
				} else {
					System.out.print("*");
				}                
            }
            System.out.println();
        }		
        space = 1;		
        for(i=1; i<=(n-1); i++)
        {
            for(j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            space++;
            for(j=1; j<=(2*(n-i)-1); j++)
            {
            	if (j%2==0) {
            		System.out.print(" ");
					
				} else {
					System.out.print("*");
				}
            }
            System.out.println();
        }
	}
}
