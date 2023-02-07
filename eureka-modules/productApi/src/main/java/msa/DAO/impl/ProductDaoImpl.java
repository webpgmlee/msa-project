package msa.DAO.impl;

import lombok.RequiredArgsConstructor;
import msa.DAO.ProductDao;
import msa.entity.ProductEntity;
import msa.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductDaoImpl implements ProductDao {
    private final ProductRepository productRepository;

    @Override
    public ProductEntity getProduct(int id) {
        return productRepository.getById(id);
    }

    @Override
    public List<ProductEntity> getProducts() { return productRepository.findAll(); }
}
