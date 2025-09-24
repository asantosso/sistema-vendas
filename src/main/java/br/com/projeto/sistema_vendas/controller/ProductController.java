package br.com.projeto.sistema_vendas.controller;


import br.com.projeto.sistema_vendas.entity.Product;
import br.com.projeto.sistema_vendas.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity <Product> save (@RequestBody Product product){
        Product salvo = productService.save(product);
        return new ResponseEntity<>(salvo, HttpStatus.CREATED);
    }
}
