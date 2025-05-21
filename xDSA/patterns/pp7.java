class pp7
{
    public static void main(String[] args) {
      int n=5;
      int x=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
            System.out.print(x%2+" ");
            x++;
        }
        System.out.println();
      }
      
    }
}

// ---op---

// 1 0 1 0 1 
// 0 1 0 1 0
// 1 0 1 0 1
// 0 1 0 1 0
// 1 0 1 0 1