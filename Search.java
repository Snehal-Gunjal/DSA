//Given an integer array and another integer element . The task is to find 
// if the given element is present in the array or not ;
class Search{
        public static void main( String[]args ){
                int n = 4 ;
                int arr[] = new int[] { 1 , 2, 3 ,4 } ;
                int x = 3 ;
                for( int i=0 ; i< arr.length ; i++ ){
                        if( x==arr[i] ){
                                System.out.println( i ) ;
                        }
                }
        }
}