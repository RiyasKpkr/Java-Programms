public class Sample {

    int a=100,b=200;    //global variable

    Sample(int a,int b){       //local variable

        this.a=a;
        this.b=b;


        System.out.println(this.a+" "+this.b);

    }

    public Sample() {
    }
}
