package msa.DAO;

import msa.entity.ProductEntity;

import java.util.List;

public interface ProductDao {
    public ProductEntity getProduct(int id);
    public List<ProductEntity> getProducts();
}
