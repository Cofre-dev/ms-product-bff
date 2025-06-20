package cl.duoc.ms_customer_bff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import cl.duoc.ms_customer_bff.services.ProductServices;
import cl.duoc.ms_customer_bff.model.dto.ProductDTO;

@RestController
@RequestMapping("/api/bff/product")
public class ProductController {

    @Autowired
    ProductServices productServices;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findProductById(@PathVariable("id") Long id) {
        ProductDTO productDTO = productServices.getProductById(id);
        return (productDTO != null)? new ResponseEntity<>(productDTO, HttpStatus.OK) :
                                     new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    

}
