/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-backend-jpa:src/main/java/search/MassIndexerService.p.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-backend-jpa
 */
package ma.sgma.edi2.search;

import static org.hibernate.search.jpa.Search.getFullTextEntityManager;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.lang.time.StopWatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;

import ma.sgma.edi2.domain.Account;
import ma.sgma.edi2.domain.Userrole;

@Named
@Lazy(false)
public class MassIndexerService {
    private static final Logger log = LoggerFactory.getLogger(MassIndexerService.class);
    protected static final Class<?>[] CLASSES_TO_BE_INDEXED = { //
            Account.class, // 
            Userrole.class };
    @PersistenceContext
    protected EntityManager entityManager;
    @Value("${massIndexer.nbThreadsToLoadObjects:1}")
    protected int threadsToLoadObjects;
    @Value("${massIndexer.batchSizeToLoadObjects:10}")
    protected int batchSizeToLoadObjects;
    @Value("${massIndexer.nbThreadsForSubsequentFetching:1}")
    protected int threadsForSubsequentFetching;

    @PostConstruct
    public void createIndex() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            for (Class<?> classToBeIndexed : CLASSES_TO_BE_INDEXED) {
                indexClass(classToBeIndexed);
            }
        } finally {
            stopWatch.stop();
            log.info("Indexed {} in {}", Arrays.toString(CLASSES_TO_BE_INDEXED), stopWatch.toString());
        }
    }

    private void indexClass(Class<?> classToBeIndexed) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            getFullTextEntityManager(entityManager) //
                    .createIndexer(classToBeIndexed) //
                    .batchSizeToLoadObjects(batchSizeToLoadObjects) //
                    .threadsToLoadObjects(threadsToLoadObjects) //
                    .threadsForSubsequentFetching(threadsForSubsequentFetching) //
                    .startAndWait();
        } catch (InterruptedException e) {
            log.warn("Interrupted while indexing " + classToBeIndexed.getSimpleName(), e);
            Thread.currentThread().interrupt();
        } finally {
            stopWatch.stop();
            log.info("Indexed {} in {}", classToBeIndexed.getSimpleName(), stopWatch.toString());
        }
    }
}