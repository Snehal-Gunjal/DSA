import java.util.*;
class Recur2{
         static void Execute( int num ){
                if( num== 0 )
                        return  ;
                System.out.println( num ) ;
                Execute( --num ) ;
        }

        public static void main( String[]args ){
                Scanner sc = new Scanner(System.in) ;
                Execute( 10 ) ;

        }
}
