package DaoImple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.ProductDao;
import DBConnection.DBConnection;
import Pojo.Product;

public class SalesDaoImp implements ProductDao {

	Connection conn = DBConnection.getConnection();

	public static void main(String[] agrs) {

		SalesDaoImp obj = new SalesDaoImp();
		obj.createTable();
	}

	@Override
	public void createTable() {

		String sql = "create table if not Exists sales(id int(4) auto_increment primary key,product_name varchar(20),product_code varchar(20),sales_date date,quantity int(20),unit_price double,total_amount double)";
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
		String sql = "insert into sales (product_name, product _code, sales_date, quantity, unit_price, total_amount) values(?,?,?,?,?,?)";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getProductName());
			ps.setString(2, p.getProductCode());
			ps.setDate(3, p.getDate());
			ps.setInt(4, p.getQty());
			ps.setDouble(5, p.getuPrice());
			ps.setDouble(6, p.getTotalAmount());
			ps.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void update(Product p) {
		String sql = "update sales set product_name=?,product_code=?, sales_date=?,quantity=?,unit_price=?,total_amount=? where id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getProductName());
			ps.setString(2, p.getProductCode());
			ps.setDate(3, p.getDate());
			ps.setInt(4, p.getQty());
			ps.setDouble(5, p.getuPrice());
			ps.setDouble(6, p.getTotalAmount());
			ps.setInt(7, p.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(int id) {
		String sql = "delete from sales where id =?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

		List<Product> list = new ArrayList<Product>();
		String sql = "select * from sales";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5),
						rs.getDouble(6), rs.getDouble(7));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
