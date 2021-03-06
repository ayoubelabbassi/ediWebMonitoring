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

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import ma.sgma.edi2.domain.SgediDictodc;
import ma.sgma.edi2.domain.Sgedircci;

/**
 * Helper class to create transient entities instance for testing purposes.
 * Simple properties are pre-filled with random values.
 */
@Named
@Singleton
public class SgedircciGenerator {

    /**
     * Returns a new Sgedircci instance filled with random values.
     */
    public Sgedircci getSgedircci() {
        Sgedircci sgedircci = new Sgedircci();

        // simple attributes follows
        sgedircci.setCodeLigne("a");
        sgedircci.setCodeBanque("a");
        sgedircci.setCodeLocalite("a");
        sgedircci.setNumeroGuichet("a");
        sgedircci.setAnneeRcc("a");
        sgedircci.setMoisRcc("a");
        sgedircci.setNcompteCarte(1);
        sgedircci.setRcompteCarte(1);
        sgedircci.setDouvertureEmission(1);
        sgedircci.setDcompteCarte("a");
        sgedircci.setNomRsociale("a");
        sgedircci.setNumIdentification("a");
        sgedircci.setCentreRc("a");
        sgedircci.setRc("a");
        sgedircci.setPays("a");
        sgedircci.setVille("a");
        sgedircci.setAdresse("a");
        sgedircci.setSdebut(1l);
        sgedircci.setTotalMcredit(1l);
        sgedircci.setTotalMdebit(1l);
        sgedircci.setSoldeFmois(1l);
        sgedircci.setChampSupp2("a");
        sgedircci.setChampSupp3("a");
        sgedircci.setChampSupp4("a");
        sgedircci.setChampSupp5("a");
        sgedircci.setCreationDate(new Date());
        sgedircci.setCreationAuthor("a");
        sgedircci.setLastModificationDate(new Date());
        sgedircci.setLastModificationAuthor("a");
        sgedircci.setMotif("a");
        sgedircci.setLib1("a");
        sgedircci.setLib2("a");
        sgedircci.setLib3("a");
        // mandatory relation
        SgediDictodc typeIdentification = sgediDictodcGenerator.getSgediDictodc();
        sgediDictodcRepository.save(typeIdentification);
        sgedircci.setTypeIdentification(typeIdentification);
        return sgedircci;
    }

    @Inject
    private SgediDictodcRepository sgediDictodcRepository;
    @Inject
    private SgediDictodcGenerator sgediDictodcGenerator;
}