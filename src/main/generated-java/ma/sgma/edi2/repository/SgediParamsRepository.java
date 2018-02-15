/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-backend-jpa:src/main/java/repository/Repository.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-backend-jpa
 */
package ma.sgma.edi2.repository;

import javax.inject.Named;
import javax.inject.Singleton;

import com.jaxio.jpa.querybyexample.GenericRepository;

import ma.sgma.edi2.domain.SgediParams;

/**
 * {@link GenericRepository} for {@link SgediParams} 
 */
@Named
@Singleton
public class SgediParamsRepository extends GenericRepository<SgediParams, Integer> {

    public SgediParamsRepository() {
        super(SgediParams.class);
    }

    @Override
    public SgediParams getNew() {
        return new SgediParams();
    }

    @Override
    public SgediParams getNewWithDefaults() {
        return getNew().withDefaults();
    }
}