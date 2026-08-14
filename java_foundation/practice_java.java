//brute force method

//(a,b) 

// public class practice_java{
   
//    public static int gcd(int N1,int N2){
//           int findgcd=1;
//         for(int i=Math.min(N1,N2);i<=2;i--){
//             if(N1%i==0 && N2%i==0){
//                findgcd=i;
//             }
//         }
//         return findgcd;
//    }


//     public static void main(String args[]){
//         int N1=61;
//         int N2=53;
//         int hcf=gcd(N1,N2);
//         System.out.println(hcf);
//     }
// }

//euclidian algorithm

// gcd(a,b) =gcd(a%b,b)

public class practice_java{

    public static int gcd(int N1,int N2){

        while(N1>0 && N2>0){
        if(N1>N2) N1=N1%N2;
        else      N2=N2%N1;
        }

        if(N1==0) return N2;
        else return N1;
        
       

    }

    public static void main(String args[]){
        int N1=25;
        int N2=50;
        int hcf=gcd(N1,N2);
        System.out.println(hcf);
    }
}