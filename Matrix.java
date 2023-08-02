  import java.util.*;
class Matrix {
    int row;
    int col;
    int mat[][]=new int[10][10];
    Matrix(int r,int c)
    {
        row=r;
        col=c;
        int i,j;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j]=0;
            }
        }
    }
    void disp(Matrix m)
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=0;i<m.row;i++)
        {
            for(j=0;j<m.col;j++)
            {
                m.mat[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m.row;i++)
        {
            for(j=0;j<m.col;j++)
            {
                System.out.print(m.mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    void hi(Matrix a,Matrix b)
    {
        int i,j,flag=0;
        Matrix c=new Matrix(a.row,a.col);
       mylabel: for(i=0;i<a.row;i++)
        {
            for(j=0;j<a.col;j++)
            {
                if(a.mat[i][j]==b.mat[i][j])
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                    break mylabel;
                }
            }
        }
        System.out.println("OUTPUT MATRIX: ");
        if(flag==1)
        {
          for(i=0;i<a.row;i++)
          {
            for(j=0;j<a.col;j++)
            {
                c.mat[i][j]=a.mat[i][j]+b.mat[i][j];
            }
          }
          for(i=0;i<a.row;i++)
          {
            for(j=0;j<a.col;j++)
            {
                System.out.print(c.mat[i][j]+" ");
            }
            System.out.println();
          }
        }
        else
        {
            for(i=0;i<a.row;i++)
          {
            for(j=0;j<a.col;j++)
            {
                c.mat[i][j]=a.mat[i][j]-b.mat[i][j];
            }
          }
          for(i=0;i<a.row;i++)
          {
            for(j=0;j<a.col;j++)
            {
                System.out.print(c.mat[i][j]+" ");
            }
            System.out.println();
          }
        }
    }
}
class F{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Enter number of rows and columns in Matrix: ");
        r=sc.nextInt();
        c=sc.nextInt();
        Matrix a=new Matrix(r,c);
        System.out.println("Enter terms of Matrix A: ");
        a.disp(a);
        Matrix b=new Matrix(r,c);
        System.out.println("Enter terms of Matrix B: ");
        b.disp(b);
        a.hi(a,b);

    }
}
