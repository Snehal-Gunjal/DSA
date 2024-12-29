class Unique{
        public static void main( String[]args ){
                int k = 4 ;
                int arr[] = new int[]{ 2 , 2 , 2, 10 , 2} ;
                for( int i=0 ; i<arr.length ; i++ ){
                        int n = arr[i] ;
                        int count = 0;
                        for( int j=0 ; j<arr.length ; j++ ){
                                if( n==arr[j] ){
                                        count++ ;
                                }
                        }
                        if( count != k ){
                                System.out.println( n ) ;
                        }
                }


        }
}
~                                                                                                 