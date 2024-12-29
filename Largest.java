class Largest{
        public static void main( String[]args ){
                int max = Integer.MIN_VALUE ;
                int arr[] = new int[]{ 1 , 8 , 7 , 56 , 90 } ;
                for( int i = 0 ; i<arr.length ; i++ ){
                        if( arr[i] > max ){
                                max = arr[i] ;
                        }
                }
                System.out.println( max ) ;
        }
}