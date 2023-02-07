package msa.DAO.impl;

import lombok.RequiredArgsConstructor;
import msa.DAO.AccountDao;
import msa.entity.AccountEntity;
import msa.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountDaoImpl implements AccountDao {
    private final AccountRepository accountRepository;

    @Override
    public AccountEntity getAccount(String id) {
        return accountRepository.getById(id);
    }

    @Override
    public List<AccountEntity> getAccounts() {
        return accountRepository.findAll();
    }
}
