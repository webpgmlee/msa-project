package msa.DAO.impl;

import lombok.RequiredArgsConstructor;
import msa.DAO.PaymentDao;
import msa.entity.PaymentEntity;
import msa.repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentDaoImpl implements PaymentDao {
    private final PaymentRepository paymentRepository;

    @Override
    public void buy(PaymentEntity paymentEntity) {
        paymentRepository.save(paymentEntity);
    }
}
