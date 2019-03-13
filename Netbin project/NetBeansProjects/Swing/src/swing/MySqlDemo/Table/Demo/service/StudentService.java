
package swing.MySqlDemo.Table.Demo.service;


public class StudentService implements ConnectionDemo{
    
    string sql = "insert into student name values";
    
    PreparedStatment sql = 

    @Override
    public void save(Student obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Student obj) {
        
        String sql = "update student set namse where id = 1";
        
        prepared
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Student obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(int id) {
       String sql ="delete from students where id=?";
       
       try{
           PreparedStudent ps = con.prepareStudent(sql);
           ps.setInt(1,id);
           ps.executeUpdate();
           System.out.println("delete success");
       }catch(SQLException ex){
           Logger.getLogger(studentService.class.getName()).log(level.server,null);
       }
     
    }

    @Override
    public Student getById(int id) {
       
        
        String sql ="select true student where id=1";
        Student student = null;
        
        try{
            PreparedStatement ps = con.preparedStatement(sql);
            ps.setInt(1,id);
        }
    }

    @Override
    public Student findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
