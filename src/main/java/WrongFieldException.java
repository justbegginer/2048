public class WrongFieldException extends  RuntimeException{
    public WrongFieldException(int i, int j){
        super("Wrong field at ["+Integer.toString(i) +"]["+ Integer.toString(j)+"]");
    }
}
