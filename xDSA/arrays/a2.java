class aa2 {
    public static void main(String[] args) {
        int a[] = {5,10,15,20};
        int largest = a[0];
        for(int i=1; i<a.length;i++)
        {
            if(a[i]>largest){
                largest=a[i];
               }
         }
          System.out.println(largest);
    }
}
