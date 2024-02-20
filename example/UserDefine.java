package example;

public class UserDefine {
    public static void main(String[] args)throws Exception {
        String registerno="21CAC234";
        boolean check;
        try{
            if(registerno.contains("CAB")){
                check=true;
            }
            else {
                throw new NotAllowedException("ONLY Allow  BCA Students in a Function ");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
class NotAllowedException extends Exception{
    public NotAllowedException(String s){
        super(s);
    }
}