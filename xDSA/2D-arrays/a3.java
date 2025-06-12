public class a3 {
    public static void main(String[] args) {
        int a[][]={{5,10,15},{20,25,30},{35,40,45}};
        for(int i=0;i<=a.length-1;i++){
            for(int j=0;j<=a[i].length-1;j++){
                if(i==j || i+j==a.length-1){
                    System.out.print(a[i][j]+"  ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
