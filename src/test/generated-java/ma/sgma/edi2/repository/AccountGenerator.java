/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-backend-jpa:src/test/java/service/ModelGenerator.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-backend-jpa
 */
package ma.sgma.edi2.repository;

import java.util.Date;

import javax.inject.Named;
import javax.inject.Singleton;

import ma.sgma.edi2.domain.Account;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class AccountGenerator {

    /**
     * Returns a new Account instance filled with random values.
     */
    public Account getAccount() {
        Account account = new Account();

        // simple attributes follows
        account.setUsername("aaaa");
        account.setPassword("a");
        account.setIsEnabled(true);
        account.setLastConnection(new Date());
        account.setMdpExpiration(new Date());
        account.setEmail("dummy@dummy.com");
        return account;
    }

}