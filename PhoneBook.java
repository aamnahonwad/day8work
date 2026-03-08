import java.util.HashMap;
class PhoneBook  {
    public static void main(String[] args){
           HashMap<String,String> hm=new HashMap<>();
           hm.put("aamna","8618581138");
           hm.put("rahul","1324546789");
           hm.put("raj","1324546679");
           hm.put("ria","178944678");
           hm.put("rhia","1324546785");

           if(hm.containsKey("rahul")){
            System.out.println(hm.get("rahul"));
           }
           else{
            System.out.println("contact not found");
           }
    }
}
