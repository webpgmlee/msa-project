package msa.service.impl;

import lombok.RequiredArgsConstructor;
import msa.DAO.PaymentDao;
import msa.DTO.PaymentDTO;
import msa.entity.PaymentEntity;
import msa.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentDao paymentDao;

    @Override
    public void buy(PaymentDTO paymentDTO) {
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setUserId(paymentDTO.getUserId());
        paymentEntity.setProductId(paymentDTO.getProductId());
        paymentDao.buy(paymentEntity);
    }
}
