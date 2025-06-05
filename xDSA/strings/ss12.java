// import javax.sql.rowset.spi.SyncResolver;

public class ss12 {
    public static void main(String[] args) {
        String s= "abacdbb";
        char mostRepChar=' ';
        int maxCount=0;
        char[] ch= s.toCharArray();
        boolean b[]= new boolean[ch.length];

        for(int i=0;i<ch.length;i++){
            if(b[i]==false){
                int count=1;
                for(int j=0;j<=ch.length;j++){
                    if(ch[i]==ch[j]){

                        count++;
                        b[j]=true;
                    }
                }
                 if(count>maxCount){
                maxCount=count;
                mostRepChar=ch[i];
            }
           
            }
        }
         System.out.println(mostRepChar);
    }
   
    
}


//write a program to count how many words are present in a given string