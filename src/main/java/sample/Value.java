package sample;

public enum Value {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);


    public int value;

    Value(int cValue){

        value = cValue;
    }

    public int getNumericalValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
