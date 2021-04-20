package hw29.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Textile {

    private String name;

    public void getStatus (String string){
        System.out.println("Sold Out!");
    }
}
