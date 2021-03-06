/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-backend-jpa:src/main/java/printer/Printer.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-backend-jpa
 */
package ma.sgma.edi2.printer;

import java.util.Locale;

import javax.inject.Named;
import javax.inject.Singleton;

import ma.sgma.edi2.domain.Account;
import ma.sgma.edi2.domain.Account_;
import ma.sgma.edi2.printer.support.GenericPrinter;

/**
 * {@link GenericPrinter} for {@link Account} 
 *
 * @see GenericPrinter
 * @see TypeAwarePrinter
 */
@Named
@Singleton
public class AccountPrinter extends GenericPrinter<Account> {
    public AccountPrinter() {
        super(Account.class, Account_.username, Account_.password);
    }

    @Override
    public String print(Account account, Locale locale) {
        if (account == null) {
            return "";
        }
        StringBuilder ret = new StringBuilder();
        appendIfNotEmpty(ret, account.getUsername());
        appendIfNotEmpty(ret, account.getPassword());
        return ret.toString();
    }
}