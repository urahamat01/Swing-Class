
package swing.MySqlDemo.Table.Demo.service;

public class Test {
    
    public static void main(String[] args) {
        Student s1 new Student();
        
        s1.setName("Rony");
       // s1.getName();
        
        ConnectionDemo ConnectionDemo = new StudentService();
        ConnectionDemo.save(s1);
    }
    
}
