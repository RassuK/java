import java.util.Arrays;
public class Proov2{
    public static void main(String[] arg){
        Isikukood[] isikukoodid=new Isikukood[2];
        isikukoodid[0]=new Isikukood("39402210247");
        isikukoodid[1]=new Isikukood("48402210247");
        for(int i=0; i<isikukoodid.length; i++){
            System.out.println(isikukoodid[i].kuunimi());
        }
        for(Isikukood kood: isikukoodid){
            System.out.println(kood.kuunimi());
        }
        Arrays.stream(isikukoodid).forEach(
            (kood)->{System.out.println(kood.kuunimi());});

    }
}