import java.util.ArrayList;

class IntegerList {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for(Integer num : list){
            System.out.println(num);
        }
    }
}
