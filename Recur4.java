import java.util.*;
class Recur4{
        static int count = 0;
         static int Execute( int n ){  // n = 2005 , n = 200 , n=20 , n=2 ,n=0
                 if( n<=1 )                yes 
                         return 1 ;
                 count++ ;             //count = 1 , 2 , 3 , 4 
                 Execute( n / 10 );    // E( 200 ) , E( 20 ) , E( 2 ) , E(0) 
                 return count ;

        }

        public static void main( String[]args ){
                Scanner sc = new Scanner(System.in) ;
                int digit = Execute( 2005 ) ;
                System.out.println( "Digit's are :" + digit ) ;

        }
}