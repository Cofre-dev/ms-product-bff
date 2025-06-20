package cl.duoc.ms_customer_bff.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.duoc.ms_customer_bff.model.dto.ProductDTO;

@FeignClient(name="ms-product-bs", url="https://localhost:8081/api/product")
public interface ProductBSFeingClient {

    @GetMapping("/{id}")
    ResponseEntity<ProductDTO> findProductById(@PathVariable("id") Long id);

}