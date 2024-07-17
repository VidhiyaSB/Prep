class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int d = 3;
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        
        for(int i=d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }
        for(int i= arr.length-d;i<arr.length;i++){
            arr[i] = temp[i-(arr.length-d)];
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
