package gr.upatras.rest.example;

import java.util.List;

public interface IProductService {
	List<Product> findAll();
	Product findById(int id);
	Product addProduct(Product p);
	Product editProduct(Product p);
	Void deleteProduct(int id);
}