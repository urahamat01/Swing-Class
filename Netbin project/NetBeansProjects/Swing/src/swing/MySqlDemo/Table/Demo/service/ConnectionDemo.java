
package swing.MySqlDemo.Table.Demo.service;


public interface ConnectionDemo {
    
    void save (Student obj);
    void update(Student obj);
    void delete (Student obj);
    void deleteById(Student id);
    Object getById(Student id);
    list<Student>findAll();
    
}
