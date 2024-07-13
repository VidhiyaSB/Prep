class HelloWorld {
    public static void main(String[] args){
        int arr[] = {1,1,2, 2,5};
        int dup[] = new int[arr.length];
        int nondup=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                dup[i] = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=dup[i]) {
                nondup = arr[i];
            }
        }
        System.out.println(nondup);
    }
    }
