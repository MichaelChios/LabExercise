package gr.upatras.rest.example;

import java.util.List;

public interface ICategoryService {
	List<Category> findAll();
	Category findById(int id);
	Category addCategory(Category c);
	Category editCategory(Category c);
	Void deleteCategory(int id);
}