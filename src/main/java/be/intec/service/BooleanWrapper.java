package be.intec.service;

public class BooleanWrapper {
    private boolean value;

    public BooleanWrapper(boolean value) {
        this.value = value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }
}
