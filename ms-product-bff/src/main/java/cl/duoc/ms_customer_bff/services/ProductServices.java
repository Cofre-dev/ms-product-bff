package cl.duoc.ms_customer_bff.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.ms_customer_bff.clients.ProductBSFeingClient;

import cl.duoc.ms_customer_bff.clients.ProductBSFeingClient;
import cl.duoc.ms_customer_bff.model.dto.ProductDTO;

@Service
public class ProductServices {
    @Autowired
    ProductBSFeingClient productBSFeingClient;

    public ProductDTO getProductById(Long id){
        return productBSFeingClient.findProductById(id).getBody();
    }
}
