/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-backend-jpa:src/test/java/service/RepositoryIT.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-backend-jpa
 */
package ma.sgma.edi2.repository;

import static com.google.common.collect.Sets.newHashSet;
import static org.fest.assertions.Assertions.assertThat;

import java.util.Set;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ma.sgma.edi2.domain.Account;

/**
 * Integration test on AccountRepository
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class AccountRepositoryIT {
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(AccountRepositoryIT.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private AccountRepository accountRepository;

    @Inject
    private AccountGenerator accountGenerator;

    @Test
    @Rollback
    public void saveAndGet() {
        Account account = accountGenerator.getAccount();

        // add it to a Set before saving (force equals/hashcode)
        Set<Account> set = newHashSet(account, account);
        assertThat(set).hasSize(1);

        accountRepository.save(account);
        entityManager.flush();

        // reload it from cache and check equality
        Account model = new Account();
        model.setId(account.getId());
        assertThat(account).isEqualTo(accountRepository.get(model));

        // clear cache to force reload from db
        entityManager.clear();

        // pk are equals...
        assertThat(account.getId()).isEqualTo(accountRepository.get(model).getId());

        // but since you do not use a business key, equality is lost.
        assertThat(account).isNotEqualTo(accountRepository.get(model));
    }

}