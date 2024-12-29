import java.util.*;
class Recur1{
         static void Execute( int num ){
                if( num== 0 )
                        return  ;
                Execute( --num );
                System.out.println( num ) ;
        }

        public static void main( String[]args ){
                Scanner sc = new Scanner(System.in) ;
                Execute( 10 ) ;

        }
}