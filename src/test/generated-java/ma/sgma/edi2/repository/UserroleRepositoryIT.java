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

import ma.sgma.edi2.domain.Userrole;

/**
 * Integration test on UserroleRepository
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/applicationContext-test.xml" })
@Transactional
public class UserroleRepositoryIT {
    @SuppressWarnings("unused")
    private static final Logger log = LoggerFactory.getLogger(UserroleRepositoryIT.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private UserroleRepository userroleRepository;

    @Inject
    private UserroleGenerator userroleGenerator;

    @Test
    @Rollback
    public void saveAndGet() {
        Userrole userrole = userroleGenerator.getUserrole();

        // add it to a Set before saving (force equals/hashcode)
        Set<Userrole> set = newHashSet(userrole, userrole);
        assertThat(set).hasSize(1);

        userroleRepository.save(userrole);
        entityManager.flush();

        // reload it from cache and check equality
        Userrole model = new Userrole();
        model.setId(userrole.getId());
        assertThat(userrole).isEqualTo(userroleRepository.get(model));

        // clear cache to force reload from db
        entityManager.clear();

        // pk are equals...
        assertThat(userrole.getId()).isEqualTo(userroleRepository.get(model).getId());

        // but since you do not use a business key, equality is lost.
        assertThat(userrole).isNotEqualTo(userroleRepository.get(model));
    }

}