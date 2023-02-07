package msa.controller;

import lombok.RequiredArgsConstructor;
import msa.DTO.ProductDTO;
import msa.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductDTO> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public ProductDTO getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }
}