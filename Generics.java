class Generics {

    public static <T> void printArray(T[] arr){
        for(T element : arr){
            System.out.println(element);
        }
    }

    public static void main(String[] args){

        Integer[] numbers = {1,2,3,4};
        String[] words = {"Java","Python","C++"};

        printArray(numbers);
        printArray(words);
    }
}
