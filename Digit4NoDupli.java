public class Digit4NoDupli {
    public static void main(String args[])
    {
                int a[]={1,2,3,4};
                int i,j,k,l,n;
                System.out.println("Combinations of 4 digit numbers= ");
                for(i=0;i<4;i++)
                {
                    for(j=0;j<4;j++)
                    {
                        if(a[j]==a[i])
                        {
                            continue;
                        }
                        for(k=0;k<4;k++)
                        {
                            if(a[k]==a[i]||a[j]==a[k])
                            continue;
                            for(l=0;l<4;l++)
                            {
                                if(a[k]==a[l]||a[l]==a[i]||a[l]==a[j])
                                {
                                    continue;
                                }
                                    n=(1000*a[i])+(100*a[j])+(10*a[k])+a[l];
                                    System.out.print(n+" ");
                            }
                        }
                    }
                }
        
            }
        }
