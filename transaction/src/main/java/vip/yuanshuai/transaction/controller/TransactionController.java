package vip.yuanshuai.transaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.yuanshuai.transaction.service.TransactionService;

/**
 * @program: debug
 * @description: 事务控制器
 * @author: yuanshuai
 * @create: 2023-07-07 13:23
 **/
@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final TransactionService transactionService;


    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/insertTestNoRollbackFor")
    public void insertTestNoRollbackFor() {
        transactionService.insertTestNoRollbackFor();
    }

    @GetMapping("/insertTestRollback")
    public void insertTestRollback() {
        transactionService.insertTestRollback();
    }

    @GetMapping("/insertTest")
    public void insertTest() {
        transactionService.insertTest();
    }

}
