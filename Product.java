class Product{
        public static void main( String[]args ){
                int arr[] = new int[] { 1 , 2, 3, 4 } ;
                int product = 1 ;
                for( int i =0 ; i<arr.length ; i++ ){
                        product = product * arr[i] ;
                }
                System.out.println( product ) ;
        }
}