import java.util.*;
public class Proov3{
    public static void main(String[] arg){
        List<Isikukood> isikukoodid=new ArrayList<Isikukood>();
        Map<String, Integer> kuusagedused=new HashMap<String, Integer>();
        isikukoodid.add(new Isikukood("39402210247"));
        isikukoodid.add(new Isikukood("48403110347"));

        for(Isikukood kood: isikukoodid){
            String kuu=kood.kuunimi();
            if(kuusagedused.get(kuu)==null){
                kuusagedused.put(kuu, 1);
            }else{
                int kogus=kuusagedused.get(kuu);
                kuusagedused.put(kuu, kogus+1);
            }
        }
        System.out.println(kuusagedused);
        isikukoodid.stream().forEach(System.out::println);
        for(int i=0; i<isikukoodid.size(); i++){
            System.out.println(isikukoodid.get(i));
        }
    }
}