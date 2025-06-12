public class a2 {
 public static void main(String[] args) {
    int a[][]={{5,10,15},{20,25,30},{35,40,45}};
    for(int i=0;i<=a.length-1;i++){
        for(int j=0;j<=a[i].length-1;j++){
            if(a[i][j]%2==0){
                System.out.println(a[i][j]+" ");
            }
        }
    }
  }   
}

//WAP to print given elements present in th matrix
//WAP to print sum of diagonal elements present in the 2D array
//WAP for transpose the matrix