package msa.service;

import msa.DTO.ProductDTO;

import java.util.List;

public interface ProductService {
    public ProductDTO getProduct(int id);
    public List<ProductDTO> getProducts();
}
