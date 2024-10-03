package table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Customer;

public class TableCustomer extends AbstractTableModel {
	List<Customer> ls;
	private String[] columnNames = {"ID", "Name", "Alamat","NoHP"};
	
	public TableCustomer(List<Customer> ls) {
		super();
		this.ls = ls;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return ls.size();
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
		
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0:
			return ls.get(rowIndex).getId();
		case 1:
			return ls.get(rowIndex).getNama();
		case 2:
			return ls.get(rowIndex).getAlamat();
		case 3:
			return ls.get(rowIndex).getNomor_hp();
		default:
			return null;
		}
	}
}



