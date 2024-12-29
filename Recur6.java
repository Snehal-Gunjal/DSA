import java.util.*;
class Recur6{
         static int Execute( int n ){
                 if( n<=0 ){
                         return 0;
                 }
                 return ( n % 10 ) + Execute( n/10 ) ;
        }
        public static void main( String[]args ){
                Scanner sc = new Scanner(System.in) ;
                int sum = Execute(1234) ;
                System.out.println( sum ) ;


        }
}