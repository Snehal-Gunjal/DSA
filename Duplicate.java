class Duplicate{
        public static void main( String[]args ){
                int arr[] = new int[]{ 2 ,3,1,2,3} ;
                int pre = 0;
                for( int i=0 ; i<arr.length ; i++ ){
                        int num =0 ;
                        for( int j=i+1 ; j<arr.length ; j++ ){
                                if( arr[i] == arr[j] )
                                        num = arr[i] ;
                        }
                        if( num != pre ) 
                        System.out.println( num ) ;
                }
        }
}
 