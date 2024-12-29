class SortArray{
        public static void main( String[]args ){
                int arr[] = new int[]{ 0 , 1 , 0  } ;
                int n = arr.length ;
                for( int i = 0 ; i< n ; i++ ){
                        for( int j=i+1 ; j<arr.length ; j++ ){ 
                                if( arr[i] >= arr[j] ){ 
                                        int temp = arr[i] ; 
                                        arr[i] = arr[j] ;
                                        arr[j] = temp ; 
                                }
                        }
                }
                System.out.println( "Show Sorted Array:" ) ;
                for( int i = 0 ; i< n ; i++ ){
                        System.out.print( arr[i] + " " ) ;
                }
                System.out.println() ;

        }
}
