import java.util.Arrays;
public class Andmed1{
    public static void main(String[] arg){
        Arrays.sort(arg);
        System.out.println(Arrays.toString(arg));
        for(int i = 0; i < arg.length; i++){
            System.out.println(i+": "+arg[i]);
        }
        for(String a: arg){
            System.out.println(a);
        }
        Arrays.stream(arg).forEach(System.out::println);
    }
}