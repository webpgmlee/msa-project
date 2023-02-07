package msa.service;

import msa.DTO.AccountDTO;

import java.util.List;

public interface AccountService {
    public List<AccountDTO> getAccounts();
    public AccountDTO getAccount(String id);
}
