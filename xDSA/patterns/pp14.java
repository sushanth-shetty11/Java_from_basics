class pp14
{
    public static void main(String[] args) {
      int n=5;
      int x=1;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.printf("%5d",x);
            x++;   
        }
        System.out.println();
      }
    }
}