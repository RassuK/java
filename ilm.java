public class ilm{
    public static String kooliminekuHinnang(int temperatuur){
        if(temperatuur<-28){return "Pead külmapüha";}
        return "Lähed kooli";
    }

    public static String riietusHinnang(int temperatuur, int sademed){
        if(temperatuur>20 && sademed==0){return "Kanna lühikesi riideid";}
        if(temperatuur<0 && sademed==1){return "Kanna talveriideid";}
        return "Runtime error : Programm on liiga rumal et sellist ilma arvesse võtta";
    }

    public static void main(String[] arg){
        int temperatuur=10;
        int sademed=0;
        System.out.println(kooliminekuHinnang(temperatuur));
        System.out.println(riietusHinnang(temperatuur, sademed));
    }
}