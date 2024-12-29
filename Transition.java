class Transition{
        public static void main( String[]args ){
                int arr[] = new int[]{ 0 ,  0 , 0 , 1 , 1 } ;
                int n = -1 ;
                for( int i = 0; i<arr.length ; i++ ){
                        if( arr[i] == 1 ){
                                n = i ;
                                break ;
                        }
                }
                System.out.println( n ) ;

        }
}