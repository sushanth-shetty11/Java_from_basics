public class aa3 {
    public static void main(String[] args) {
        int a[]= {5,10,15,20};
        int smallest = a[0];
        for(int i=1;i<=a.length-1;i++){
            if(smallest>a[i]){
                smallest=a[i];
            }
        }
        System.out.println(smallest);
    }
}
