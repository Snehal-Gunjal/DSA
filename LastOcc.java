class LastOcc{
        public static void main( String[]args ){
                int arr[] = new int[] { 1 , 3 , 3 ,3 , 3 , 4 } ;
                int x = 3 ;
                int last = 0 ;
                int first = 0 ;
                for( int i =0 ; i<arr.length ; i++ ){
                        if( arr[i] == x ){
                                first = i ;
                                break;
                        }
                }
                for( int i = 0 ; i<arr.length ; i++ ){
                        if( arr[i]==x ){
                                last = i ;
                        }
                }
                System.out.println( first + " "+last ) ;
        }
}
