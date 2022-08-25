package org.java.practice.oops;

class BankAccountInfo
{
    private String name;
    private String accountNumber;
    private String bankName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}


public class EncapsulationTest {
    public static void main(String[] args) {
        BankAccountInfo bankInfo1 = new BankAccountInfo();
        bankInfo1.setBankName("HDFC");
        bankInfo1.setAccountNumber("123456789");
        bankInfo1.setName("Lohith Kumar");

        System.out.println(bankInfo1.getBankName());
        System.out.println(bankInfo1.getAccountNumber());
        System.out.println(bankInfo1.getName());
    }
}
