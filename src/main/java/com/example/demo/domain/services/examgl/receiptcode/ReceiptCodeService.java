package com.example.demo.domain.services.examgl.receiptcode;

import com.example.demo.domain.models.examgl.ReceiptCode;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 2/27/2018
*/
public interface ReceiptCodeService {

    List<ReceiptCode> getAllReceiptCodes();

    ReceiptCode getById(Long id);

    void createReceiptCode(ReceiptCode receiptCode);

    void updateReceiptCode(ReceiptCode receiptCode, Long id);

    void deleteReceiptCode(Long id);
}
