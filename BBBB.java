public class BBBB extends AAAA {
    int a;

    BBBB(){
        System.out.println("-----its B constractor-----");
    }
    BBBB(int a){
        super(10);
        System.out.println("------it's argument constractor of B");
    }
    void display(){
        System.out.println("-----it's B-----");
        
        a=20;

        super.a=30;

        int c=a+super.a;

        System.out.println(c);
    
    }

    void baseDisplay(){
        super.display();

    }


    public static void main(String[] args) {
        BBBB b=new BBBB();
       /* b.display();
        b.baseDisplay();*/
    }
}
