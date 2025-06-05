//write a program to count how many words are present in a given string

// public class ss13 {
//     public static void main(String[] args) {
//         String s=" where  is    raju ";
//         s=s.trim().replaceAll("\\s+", " ");
//         String[] a = s.split(" ");
//         System.out.println(a.length);
//     }
// }

// -----or-----

public class ss13{
    public static void main(String[] args) {
        String s= "where  is  raju";
        char[] ch = s.toCharArray();
        int count=0;
        for(int i=0;i<=ch.length-1;i++){
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}

//wap to convert every word first char into upper case and remaining character into lowercase --- rAm iS gOOd
//wap to convert every word last character into upper and remaining characters into lowercase --- rAm is goOd  op--raM iS gooD
//wap to swap every word first and last character  --- Scanner is class  -op- rcanneS si slasc