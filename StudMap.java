import java.util.TreeMap;
class StudMap {
    public static void main(String[] args){
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("aamna",50);
        tm.put("poooja",89);
        tm.put("poornima",79);
        tm.put("priya",78);

        for(String name: tm.keySet()){
            System.out.println("after sorting them " + tm.get(name));
        }
    }
}
