package com.ddd.tax.service;

import com.ddd.tax.vo.CallFeeTaxSpecification;

public class TaxService {

    public double getTax(CallFeeTaxSpecification specification) {

        //计算TAX
        return 0;
    }

    private static TaxService instance = new TaxService();

    private TaxService() {

    }

    public static TaxService getInstance() {

        return instance;
    }

}
