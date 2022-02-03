public class Field {
    private int value;
    public Field(){
        this.value = 1; // default value means null field
    }
    public void increment(){
        this.value *= 2;
    }

    public void makeNull(){
        this.value = 1;
    }

    public int getValue() {
        return this.value;
    }
}
