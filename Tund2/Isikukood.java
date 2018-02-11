public class Isikukood{
    protected String andmed;
    public Isikukood(String uusKood){
        andmed=uusKood;
    }
    public int kuunr(){
        return Integer.parseInt(andmed.substring(3, 5));
    }
    public int paevanr(){
        return Integer.parseInt(andmed.substring(5, 7));
    }
    public String kuunimi(){
        String[] kuunimed={"", "Jaanuar", "Veebruar", "Märts", "Aprill", 
        "Maa", "Juuni", "Juuli", "August", 
        "September", "Oktoober", "November", "Detsember"};
        return kuunimed[kuunr()];
    }
    public int getYear(){
        return Integer.parseInt(andmed.substring(1, 3));
    }
    public int getCentury(){
        return Integer.parseInt(andmed.substring(0, 1));
    }
    public int yearFirstHalf(){
        if(getCentury() == 3 || getCentury() == 4){
            return 19;
        }
        if(getCentury() == 1 || getCentury() == 2){
            return 18;
        }
        return 0;
    }
    public int[] fullYear(){
        return new int[] {yearFirstHalf(),getYear()};
    }
    @Override
    public String toString(){
        return paevanr() + ". " + kuunimi() + " ";
    }
}