class pp5
{
    public static void main(String[] args) {
      int n=5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.printf("%2d",j%2);
            }
            System.out.println();
        }
    }
}

// ---op---

// 1 0 1 0 1
//  1 0 1 0 1
//  1 0 1 0 1
//  1 0 1 0 1
//  1 0 1 0 1