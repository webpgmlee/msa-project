package msa.service.impl;

import lombok.RequiredArgsConstructor;
import msa.DAO.ProductDao;
import msa.DTO.ProductDTO;
import msa.entity.ProductEntity;
import msa.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductDao userDao;

    @Override
    public ProductDTO getProduct(int id) {
        ProductEntity productEntity = userDao.getProduct(id);
        ProductDTO userDTO = new ProductDTO(productEntity.getId(), productEntity.getProductName(), productEntity.getPrice(), productEntity.getImgPath());
        return userDTO;
    }

    @Override
    public List<ProductDTO> getProducts() {
        List<ProductEntity> productEntity = userDao.getProducts();
        List<ProductDTO> list = new ArrayList<>();
        ProductDTO productDTO;
        for(ProductEntity p: productEntity){
            productDTO = new ProductDTO(p.getId(), p.getProductName(), p.getPrice(), p.getImgPath());
            list.add(productDTO);
        }
        return list;
    }
}
