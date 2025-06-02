public class ss10 {
    public static void main(String[] args) {
        String s="abcdaebf";
        char[] ch = s.toCharArray();
        boolean b[] = new boolean[ch.length];
        int uniqueCount= 0;

        for(int i=0;i<=ch.length-1;i++){
            if(b[i]==false){
                int count=1;
                for(int j=0;j<=ch.length-1;j++){
                    if(ch[i]==ch[j]){
                        count++;
                        b[j]=true;
                    }
                }
                if(count==1)
                 System.out.println(ch[i]);
                 uniqueCount++;

                 if(uniqueCount==3)
                 break;
            }        
        }       
    } 
}
