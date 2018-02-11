public class Proov1{
    public static void main(String[] arg){
        Isikukood rasmus=new Isikukood("39402210247");
        Isikukood juss=new Isikukood("38401110447");

        int year[] = rasmus.fullYear();
        System.out.println("Kuu nr: " + rasmus.kuunr() + " nimega " + rasmus.kuunimi() + " Aastal: " + year[0] + year[1]);
    }
}