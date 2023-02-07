package msa.controller;

import lombok.RequiredArgsConstructor;
import msa.DTO.PaymentDTO;
import msa.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PutMapping("/payments")
    public void buy(@RequestBody PaymentDTO pay){
        paymentService.buy(pay);
    }
}