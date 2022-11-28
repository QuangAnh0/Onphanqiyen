package com.example.ontapphanquyen.controller;

import com.example.ontapphanquyen.mail.IMailService;
import com.example.ontapphanquyen.mail.MailService;
import com.example.ontapphanquyen.model.Mail;
import com.example.ontapphanquyen.model.Wallet;
import com.example.ontapphanquyen.service.wallet.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/wallet")
public class MailController {
    @Autowired
    private IMailService mailService;
    @Autowired
    private WalletService walletService;

    @PostMapping ("/create")
    public ResponseEntity<Wallet> createWallet(@RequestBody Wallet wallet){
        try {
            Mail mail = new Mail();
            mail.setMailFrom("sendmail@gmail.com");
            mail.setMailTo(wallet.getEmail());
            mail.setMailSubject("FC BeHanh");
            mail.setMailContent("Bạn đã tạo ví"+wallet.getName()+"thành công");
            mailService.sendEmail(mail);
            return new ResponseEntity<>(walletService.save(wallet), HttpStatus.CREATED);
        }
        catch (Exception e){
            System.out.println("lỗi gửi email");
        }return null;
    }

    @GetMapping("/get")
    public String get(){
        return "hello";
    }
}
