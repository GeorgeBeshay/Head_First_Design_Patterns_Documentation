package Ch05_TheSingletonPattern;

public enum SignletonEnum {
    UNIQUE_INSTANCE;

    public SignletonEnum get(){
        return this;
    }
}
