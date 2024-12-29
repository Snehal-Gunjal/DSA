class Remove{
        public static void main( String[]args ){
                int arr[] = new int[]{ 1 , 2, 3, 4, 5} ;
                int index = 2 ;
                int n = arr.length ;
                int arr1[] = new int[n-1] ;
                for( int i=0 , k =0 ; i<arr.length ; i++ ){
                        if( index != i ){
                                arr1[k] = arr[i] ;
                                k++ ;
                        }
                }
                for( int i=0 ; i<arr1.length ; i++ ){
                        System.out.println( arr1[i] + " " ) ;
                }

        }
}