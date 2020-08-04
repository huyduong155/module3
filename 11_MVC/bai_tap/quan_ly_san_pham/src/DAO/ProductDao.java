package DAO;

import model.Product;

import java.util.List;

public interface ProductDao {
List<Product> findAll();
void save(Product product);
Product findById(int id);
void update(int id,Product product);
void remove(int id);
List<Product> search(String name);
}
