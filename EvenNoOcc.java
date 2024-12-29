class EvenNoOcc{
        public static void main( String[]args ){
                int arr[] = new int[]{ 9 , 12 , 23 , 10 , 12 , 12, 15, 23 , 14 , 12 , 15 } ;                      int n =0 ;
                for( int i=0 ; i<arr.length ; i++ ){
                        n = arr[i] ;
                        int count = 0;
                        for( int j=i; j<arr.length ; j++ ){
                                if( n==arr[j] ){
                                        count++ ;
                                }
                        }
                        if( count % 2 == 0 ){
                                System.out.println(n);
                        }
                }
        }
}
//Change code required !