public class ss11 {
    public static void main(String[] args) {
        String s="abcdaebfcda";
        char[] ch = s.toCharArray();
        boolean b[] = new boolean[ch.length];
        int dubCount= 0;
        int n=3;

        for(int i=0;i<=ch.length-1;i++){
            if(b[i]==false){
                int count=1;
                for(int j=i+1;j<=ch.length-1;j++){
                    if(ch[i]==ch[j]){
                        count++;
                        b[j]=true;
                    }
                }
                if(count>1){
                System.out.println(ch[i]);
                 dubCount++;   

                if(dubCount==n){
                    System.out.println(ch[i]);
                    break;
                    
                }
              }
             
            }        
        }       
    } 
}
