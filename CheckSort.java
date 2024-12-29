class CheckSort{
        public static void main( String[]args ){
                int arr[] = new int[] { 10 , 20 , 30 , 40 , 50 } ;
                int output = 1 ;
                for( int i=0 ; i<arr.length ; i++ ){
                        for( int j=i+1 ; j<arr.length ; j++ ){
                                if( arr[i] > arr[j] ){
                                        output = 0 ;
                                }
                        }
                }
                System.out.println( output ) ;
        }
}