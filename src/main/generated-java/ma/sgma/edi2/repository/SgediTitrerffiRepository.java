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

import ma.sgma.edi2.domain.SgediTitrerffi;

/**
 * {@link GenericRepository} for {@link SgediTitrerffi} 
 */
@Named
@Singleton
public class SgediTitrerffiRepository extends GenericRepository<SgediTitrerffi, Integer> {

    public SgediTitrerffiRepository() {
        super(SgediTitrerffi.class);
    }

    @Override
    public SgediTitrerffi getNew() {
        return new SgediTitrerffi();
    }

    @Override
    public SgediTitrerffi getNewWithDefaults() {
        return getNew().withDefaults();
    }
}