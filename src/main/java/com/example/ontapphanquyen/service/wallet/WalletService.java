package com.example.ontapphanquyen.service.wallet;

import com.example.ontapphanquyen.model.Wallet;
import com.example.ontapphanquyen.repo.wallet.RepoWallet;
import com.example.ontapphanquyen.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.Optional;
@Service
public class WalletService implements IWalletService {
    @Autowired
    private RepoWallet repoWallet;

    @Override
    public Iterable<Wallet> findAll() {
        return null;
    }

    @Override
    public Optional<Wallet> findById(Long id) {
        return repoWallet.findById(id);
    }


    @Override
    public Wallet save(Wallet wallet) {
        return repoWallet.save(wallet);
    }

    @Override
    public void remove(Long id) {
        repoWallet.deleteById(id);
    }
}
