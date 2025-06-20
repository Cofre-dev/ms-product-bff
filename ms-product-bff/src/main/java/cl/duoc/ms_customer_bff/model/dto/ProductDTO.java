package cl.duoc.ms_customer_bff.model.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class ProductDTO {

    private long id;

    private String name;
    private String description;
    private double price;
    private int stock;
    private String sku;
    private boolean available;
        
}