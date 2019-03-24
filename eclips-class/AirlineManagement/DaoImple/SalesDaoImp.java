package DaoImple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import DAO.ProductDao;
import DBConnection.DBConnection;
import Pojo.Product;

public class SalesDaoImp implements ProductDao {

	Connection conn = DBConnection.getConnection();
	public static void main (String[]agrs ) 
	{
		
		SalesDaoImp obj = new SalesDaoImp();
		obj.createTable();
	}
	
	@Override
	public void createTable() {

		
			String sql ="create table if not Exists sales(id int(4) auto_increment primary key,product_name varchar(20),product_code varchar(20),sales_date date,quantity int(20),unit_price double,total_amount double)";
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.execute();
				System.out.println("table create");
			
			} catch (Exception e) {
			
				
				
				e.printStackTrace();
			}
			
			
			
	}

	@Override
	public void save(Product p) {
		String sql ="insert into sales (product_name, product _code, sales_date, quantity, unit_price, total_amount) values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(parameterIndex, x);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
