
package swing;



public class Test {
    
    public static void m1(int x){
        System.out.println("General method");
    }
    public static void m1(double...x){
        System.out.println("var-arg method");
    }
    
    
//    public Test(String[][][]...x){
//        System.out.println("aasijfdik");
//    }
//    
    public static void rony(String...agrs) {
        
        m1(10);
        m1(10.7);
        m1(10,20);
        
    }
    
}
