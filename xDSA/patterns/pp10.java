class pp10
{
    public static void main(String[] args) {
        int n=5;
        char c='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
            c='A';
        }
    }
}

// ---op---

// A B C D E 
// A B C D E
// A B C D E
// A B C D E
// A B C D E