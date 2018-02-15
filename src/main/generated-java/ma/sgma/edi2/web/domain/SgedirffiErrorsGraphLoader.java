/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-jsf2-spring-conversation:src/main/java/domain/GraphLoader.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-jsf2-spring-conversation
 */
package ma.sgma.edi2.web.domain;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.jaxio.jpa.querybyexample.EntityGraphLoader;

import ma.sgma.edi2.domain.SgedirffiErrors;
import ma.sgma.edi2.repository.SgedirffiErrorsRepository;

/**
 * Preloads the {@link SgedirffiErrors} associations required by the view layer.
 * 
 * Do not use other GraphLoaders in this GraphLoader. 
 */
@Named
@Singleton
public class SgedirffiErrorsGraphLoader extends EntityGraphLoader<SgedirffiErrors, Integer> {
    // required by cglib to create a proxy around the object as we are using the @Transactional annotation
    protected SgedirffiErrorsGraphLoader() {
        super();
    }

    @Inject
    public SgedirffiErrorsGraphLoader(SgedirffiErrorsRepository sgedirffiErrorsRepository) {
        super(sgedirffiErrorsRepository);
    }

    @Override
    public void loadGraph(SgedirffiErrors sgedirffiErrors) {
        loadSingular(sgedirffiErrors.getCoderffi());
    }
}