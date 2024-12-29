import java.util.*;
class Recur3{
         static int Execute( int num ){
                 if( num==0 ){
                         return 0 ;
                 }
                return num + Execute( --num ) ;
        }

        public static void main( String[]args ){
                Scanner sc = new Scanner(System.in) ;
                int sum = Execute( 5 ) ;
                System.out.println( "Sum is :" + sum ) ;

        }
}
 