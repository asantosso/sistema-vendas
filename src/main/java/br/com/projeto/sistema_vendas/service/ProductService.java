package br.com.projeto.sistema_vendas.service;


import br.com.projeto.sistema_vendas.entity.Product;
import br.com.projeto.sistema_vendas.repository.ProductRepository;
import org.hibernate.sql.Delete;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save (Product product){
        this.productRepository.save(product);
        return product;
    }

    public List <Product> list () {
        return productRepository.findAll();
    }
    public Optional <Product> listId(Long listId){
        return productRepository.findById(listId);
    }

    public void delete (){
        productRepository.deleteAll();
    }
    public void deleteId (Long id){
        productRepository.deleteById(id);
    }

}
