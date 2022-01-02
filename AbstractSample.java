public class AbstractSample extends AbstractClass {

    void onText(String text) {
        System.out.println(text);
        
    }

    AbstractSample(){
        TextScanner ts=new TextScanner(this);

        ts.scan();


    }
    public static void main(String[] args) {

        AbstractSample s=new AbstractSample();
    }
}
