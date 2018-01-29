public class start{
    public static void main(String[] arg){
        System.out.println("Tere");
        int temperatuur = -10;
        if(arg.length<0){
            temperatuur=Integer.parseInt(arg[0]);
        }
        if(temperatuur<-28){
            System.out.println("Külmapüha");
        } if(temperatuur>20){
            System.out.println("Kanna täna lühikesi varrukaid");
        } else {
            System.out.println("Hommikul koolli");
        }
    }
}