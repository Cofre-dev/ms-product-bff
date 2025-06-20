package cl.duoc.ms_customer_bff.model.dto;

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

public class ProductDetailDTO {

    private Long id;
    private ProductDTO product;
    private Long quantity; 
    private Long salesId;

}
