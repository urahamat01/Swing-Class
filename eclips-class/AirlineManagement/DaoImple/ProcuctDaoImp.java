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

public class ProcuctDaoImp implements ProductDao {

	Connection conn = DBConnection.getConnection();

	@Override
	public void createTable() {
		String sql = "create table if not Exists product(id int(4) auto_increment primary key,product_name varchar(20),product_code varchar(20),buy_date date,quantity int(20),unit_price double,total_amount double)";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			System.out.println("table create complete");
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	@Override
	public void save(Product p) {
		String sql = "insert into product(product_name,product_code,buy_date,quantity,unit_price,total_amount)values(?,?,?,?,?,?)";

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
		String sql = "update product set product_name=?,product_code=?, buy_date=?,quantity=?,unit_price=?,total_amount=? where id=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, p.getProductName());
			ps.setString(2, p.getProductCode());
			ps.setDate(3, p.getDate());
			ps.setInt(4, p.getQty());
			ps.setDouble(5, p.getuPrice());
			ps.setDouble(6, p.getTotalAmount());
			ps.setInt(7, p.getId());
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		String sql = "delete from product where id=?";

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
		Product product = null;
		String sql = "select * from product where product_code=?";

		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, code);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5),
						rs.getDouble(6), rs.getDouble(7));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return product;
	}

	@Override
	public List<Product> getProducts() {
		List<Product> list = new ArrayList<Product>();
		String sql = "select * from product";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getInt(5),
						rs.getDouble(6), rs.getDouble(7));

				list.add(p);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}

}
