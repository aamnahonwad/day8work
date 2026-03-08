import java.util.LinkedHashMap;

class ProductMap {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> products = new LinkedHashMap<>();

        products.put("Laptop", 60000);
        products.put("Phone", 20000);
        products.put("Tablet", 15000);
        products.put("Headphones", 2000);
        products.put("Mouse", 500);

        for(String name : products.keySet()){
            System.out.println(name + " : " + products.get(name));
        }
    }
}
