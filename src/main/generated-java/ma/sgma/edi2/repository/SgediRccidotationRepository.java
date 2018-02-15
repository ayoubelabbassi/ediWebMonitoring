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

import ma.sgma.edi2.domain.SgediRccidotation;

/**
 * {@link GenericRepository} for {@link SgediRccidotation} 
 */
@Named
@Singleton
public class SgediRccidotationRepository extends GenericRepository<SgediRccidotation, Integer> {

    public SgediRccidotationRepository() {
        super(SgediRccidotation.class);
    }

    @Override
    public SgediRccidotation getNew() {
        return new SgediRccidotation();
    }

    @Override
    public SgediRccidotation getNewWithDefaults() {
        return getNew().withDefaults();
    }
}