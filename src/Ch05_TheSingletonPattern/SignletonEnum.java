package Ch05_TheSingletonPattern;

public enum SignletonEnum {
    UNIQUE_INSTANCE;

    public String foo(){
        return "Hello from singleton enum !";
    }
}
