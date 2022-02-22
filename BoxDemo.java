
class BoxDemo{
void method(){
    System.out.println("THis m");
}
BoxDemo(double w,double h,double l) {
    System.out.println(w*h*l);
}
}

class Box{
    public static void main(String[] args) {
        BoxDemo myBox1=new BoxDemo(21,23,32);
        BoxDemo myBox2=new BoxDemo(42,34,65); 
        myBox1.method();
        myBox2.method();       
    }
}