public class ss7 {
    public static void main(String[] args) {
        String s="abac";
        char[] ch = s.toCharArray();
        boolean b[] = new boolean[ch.length];

        for(int i=0;i<=ch.length-1;i++){
            if(b[i]==false){
                int count=1;
                for(int j=0;j<=ch.length-1;j++){
                    if(ch[i]==ch[j]){
                        count++;
                        b[j]=true;
                    }
                }
                 System.out.println(ch[i]+ " : "+ count);
                 
            }        
        }       
    } 
}
