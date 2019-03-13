
package swing.MySqlDemo.Table;

public class createTableStudents {
    
    
    String sql = "create table students (id int (11) primary key auto_increment, name varchar(50) not null)";
    
    String sql1 = "create table students1(id int(15) primary key auto_increment, name varchar(50) bir null)";
    try{
    preparedStatment ps = .preparedStudent(sql);
    ps.excute();
            System.out.println("Student Table create ");  
            }catch(SQLException ex){
    Logger.getLogger(CreateStdentTable.class.getName().log(level.severl,null, ex));
}

   
        }
    }
}
