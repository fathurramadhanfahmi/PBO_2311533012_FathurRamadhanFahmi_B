package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import config.Database;
import model.Customer;

public class CustomerRepo implements CustomerDAO {
	
	private Connection connection;
	final String insert = "INSERT INTO user (name, alamat, nomorhp) VALUES (?,?,?);";
	final String select = "SELECT * FROM user;";
	final String delete = "DELETE FROM user WHERE id=?;";
	final String update = "UPDATE user SET name=?, username=?, password=? WHERE id=?;";

public CustomerRepo() {
	connection = Database.koneksi();



}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(insert);
			st.setString(1,  customer.getNama());
			st.setString(2, customer.getAlamat());
			st.setString(3,  customer.getNomor_hp());
			st.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Customer> show() {
		// TODO Auto-generated method stub
		List<Customer> ls=null;
		try {
			ls = new ArrayList<Customer>();
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next()) {
				Customer customer = new Customer();
				customer.setId(rs.getString("id"));
				customer.setNama(rs.getString("name"));
				customer.setAlamat(rs.getString("Address"));
				customer.setNomor_hp(rs.getString("phone number"));
				ls.add(customer);
			}
		}catch(SQLException e) {
			Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null,e);
		}
		return ls;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(delete);
			st.setString(1, id);
			st.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				st.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(update);
			st.setString(1, customer.getNama());
			st.setString(2, customer.getAlamat());
			st.setString(3, customer.getNomor_hp());
			st.setString(4, customer.getId());
			st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				st.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}	
		}
	}
	
}


