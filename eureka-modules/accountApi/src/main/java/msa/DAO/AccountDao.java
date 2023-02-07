package msa.DAO;

import msa.entity.AccountEntity;

import java.util.List;

public interface AccountDao {
    public AccountEntity getAccount(String id);
    public List<AccountEntity> getAccounts();
}
