import java.util.*;
class Recur5{
        static int flag = 0;
         static int Execute( int n ){
                 for( int i=2 ; i<n ; i++ ){
                         if( n % i == 0 ){
                                 flag = 1 ;
                                 break;
                         }
                 }
                 if(flag==0)
                         return 1 ;
                 else
                         return -1 ;

        }
        public static void main( String[]args ){
                Scanner sc = new Scanner(System.in) ;
                int check = Execute( 4) ;
                if( check==1 ){
                        System.out.println( "Number is Prime:" );
                }else{
                        System.out.println( "Number is not-prime:" ) ;
                }      
		}
}