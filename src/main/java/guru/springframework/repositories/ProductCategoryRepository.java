package guru.springframework.repositories;

import guru.springframework.domain.ProductCategory;
import org.springframework.data.repository.CrudRepository;


public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {
}
