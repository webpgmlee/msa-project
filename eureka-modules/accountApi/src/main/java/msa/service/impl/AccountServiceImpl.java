package msa.service.impl;

import lombok.RequiredArgsConstructor;
import msa.DAO.AccountDao;
import msa.DTO.AccountDTO;
import msa.entity.AccountEntity;
import msa.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountDao accountDao;

    @Override
    public List<AccountDTO> getAccounts() {
        List<AccountEntity> accountEntity = accountDao.getAccounts();
        List<AccountDTO> list = new ArrayList<>();
        AccountDTO accountDTO;
        for(int i=0;i<accountEntity.size();i++){
            accountDTO = new AccountDTO();
            accountDTO.setUserId(accountEntity.get(i).getUserId());
            accountDTO.setAcctNo(accountEntity.get(i).getAcctNo());
            accountDTO.setBalance(accountEntity.get(i).getBalance());
            accountDTO.setBank(accountEntity.get(i).getBank());
            list.add(accountDTO);
        }
        return list;
    }

    @Override
    public AccountDTO getAccount(String id) {
        return null;
    }
}
