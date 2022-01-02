

public class TextScanner {
    AbstractClass obj;

    public TextScanner(AbstractClass obj){

        this.obj=obj;
    }

    void scan(){

        String text="scanned text";
        obj.onText(text);
    }
}
