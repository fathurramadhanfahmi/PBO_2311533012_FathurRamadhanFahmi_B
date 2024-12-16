package DAO;

import java.util.List;
import model.Customer;

public interface CustomerDAO {
    void save(Customer costumer);
    List<Customer> show();
    void update(Customer costumer);
    void delete(String id);
}
