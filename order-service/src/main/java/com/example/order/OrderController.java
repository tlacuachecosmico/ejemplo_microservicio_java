
package com.example.order;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @GetMapping("/orders")
    public String orders() {
        return "Listado de órdenes";
    }
}
