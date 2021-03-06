/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-backend-jpa:src/test/java/domain/ModelTest.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-backend-jpa
 */
package ma.sgma.edi2.domain;

import static org.fest.assertions.Assertions.assertThat;

import java.io.*;
import java.util.*;

import org.junit.Test;

import ma.sgma.edi2.util.ValueGenerator;

/**
 * Basic tests for Sgedirffi
 */
@SuppressWarnings("unused")
public class SgedirffiTest {

    // test unique primary key
    @Test
    public void newInstanceHasNoPrimaryKey() {
        Sgedirffi model = new Sgedirffi();
        assertThat(model.isIdSet()).isFalse();
    }

    @Test
    public void isIdSetReturnsTrue() {
        Sgedirffi model = new Sgedirffi();
        model.setId(ValueGenerator.getUniqueInteger());
        assertThat(model.getId()).isNotNull();
        assertThat(model.isIdSet()).isTrue();
    }

    //-------------------------------------------------------------
    // Many to One:  Sgedirffi.idXml ==> Sgedixml.id
    //-------------------------------------------------------------

    @Test
    public void manyToOne_setIdXml() {
        Sgedirffi many = new Sgedirffi();

        // init
        Sgedixml one = new Sgedixml();
        one.setId(ValueGenerator.getUniqueInteger());
        many.setIdXml(one);

        // make sure it is propagated properly
        assertThat(many.getIdXml()).isEqualTo(one);

        // now set it to back to null
        many.setIdXml(null);

        // make sure null is propagated properly
        assertThat(many.getIdXml()).isNull();
    }

    @Test
    public void manyToOne_setTypeIdentification() {
        Sgedirffi many = new Sgedirffi();

        // init
        SgediDictodc one = new SgediDictodc();
        one.setId(ValueGenerator.getUniqueInteger());
        many.setTypeIdentification(one);

        // make sure it is propagated properly
        assertThat(many.getTypeIdentification()).isEqualTo(one);

        // now set it to back to null
        many.setTypeIdentification(null);

        // make sure null is propagated properly
        assertThat(many.getTypeIdentification()).isNull();
    }

    @Test
    public void manyToOne_setStatutInt() {
        Sgedirffi many = new Sgedirffi();

        // init
        SgediParams one = new SgediParams();
        one.setId(ValueGenerator.getUniqueInteger());
        many.setStatutInt(one);

        // make sure it is propagated properly
        assertThat(many.getStatutInt()).isEqualTo(one);

        // now set it to back to null
        many.setStatutInt(null);

        // make sure null is propagated properly
        assertThat(many.getStatutInt()).isNull();
    }

    @Test
    public void manyToOne_setQualite() {
        Sgedirffi many = new Sgedirffi();

        // init
        SgediDictodc one = new SgediDictodc();
        one.setId(ValueGenerator.getUniqueInteger());
        many.setQualite(one);

        // make sure it is propagated properly
        assertThat(many.getQualite()).isEqualTo(one);

        // now set it to back to null
        many.setQualite(null);

        // make sure null is propagated properly
        assertThat(many.getQualite()).isNull();
    }

    @Test
    public void manyToOne_setCodeRole() {
        Sgedirffi many = new Sgedirffi();

        // init
        Userrole one = new Userrole();
        one.setId(ValueGenerator.getUniqueInteger());
        many.setCodeRole(one);

        // make sure it is propagated properly
        assertThat(many.getCodeRole()).isEqualTo(one);

        // now set it to back to null
        many.setCodeRole(null);

        // make sure null is propagated properly
        assertThat(many.getCodeRole()).isNull();
    }

    @Test
    public void manyToOne_setCategorieFormule() {
        Sgedirffi many = new Sgedirffi();

        // init
        SgediDictodc one = new SgediDictodc();
        one.setId(ValueGenerator.getUniqueInteger());
        many.setCategorieFormule(one);

        // make sure it is propagated properly
        assertThat(many.getCategorieFormule()).isEqualTo(one);

        // now set it to back to null
        many.setCategorieFormule(null);

        // make sure null is propagated properly
        assertThat(many.getCategorieFormule()).isNull();
    }

    @Test
    public void manyToOne_setSensOperation() {
        Sgedirffi many = new Sgedirffi();

        // init
        SgediDictodc one = new SgediDictodc();
        one.setId(ValueGenerator.getUniqueInteger());
        many.setSensOperation(one);

        // make sure it is propagated properly
        assertThat(many.getSensOperation()).isEqualTo(one);

        // now set it to back to null
        many.setSensOperation(null);

        // make sure null is propagated properly
        assertThat(many.getSensOperation()).isNull();
    }

    @Test
    public void manyToOne_setStatutEch() {
        Sgedirffi many = new Sgedirffi();

        // init
        SgediParams one = new SgediParams();
        one.setId(ValueGenerator.getUniqueInteger());
        many.setStatutEch(one);

        // make sure it is propagated properly
        assertThat(many.getStatutEch()).isEqualTo(one);

        // now set it to back to null
        many.setStatutEch(null);

        // make sure null is propagated properly
        assertThat(many.getStatutEch()).isNull();
    }

    //-------------------------------------------------------------
    // One to Many: SimpleOneToMany sgedirffi.id ==> sgedirffi_errors.coderffi
    //-------------------------------------------------------------

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // sgedirffiErrors.sgedirffiErrors <-- sgedirffi.coderffis
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @Test
    public void oneToMany_addSgedirffiErrors() {
        Sgedirffi one = new Sgedirffi();
        SgedirffiErrors many = new SgedirffiErrors();

        // init
        one.addSgedirffiErrors(many);

        // make sure it is propagated
        assertThat(one.getSgedirffiErrorss()).contains(many);
        assertThat(one).isEqualTo(many.getCoderffi());

        // now set it to null
        one.removeSgedirffiErrors(many);

        // make sure null is propagated
        assertThat(one.getSgedirffiErrorss().contains(many)).isFalse();
        assertThat(many.getCoderffi()).isNull();
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // sgediTitrerffi.sgediTitrerffi <-- sgedirffi.idrffis
    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    @Test
    public void oneToMany_addSgediTitrerffi() {
        Sgedirffi one = new Sgedirffi();
        SgediTitrerffi many = new SgediTitrerffi();

        // init
        one.addSgediTitrerffi(many);

        // make sure it is propagated
        assertThat(one.getSgediTitrerffis()).contains(many);
        assertThat(one).isEqualTo(many.getIdrffi());

        // now set it to null
        one.removeSgediTitrerffi(many);

        // make sure null is propagated
        assertThat(one.getSgediTitrerffis().contains(many)).isFalse();
        assertThat(many.getIdrffi()).isNull();
    }

    /*
    public void equalsUsingPk() {
        Sgedirffi model1 = new Sgedirffi();
        Sgedirffi model2 = new Sgedirffi();
    
        Integer id = ValueGenerator.getUniqueInteger();
        model1.setId(id);
        model2.setId(id);
    
        model1.setCodeLigne("a");
        model2.setCodeLigne("a");
    
        model1.setCodeBanque("a");
        model2.setCodeBanque("a");
    
        model1.setNumeroGuichet("a");
        model2.setNumeroGuichet("a");
    
        model1.setAnneRffi("a");
        model2.setAnneRffi("a");
    
        model1.setMoisRffi("a");
        model2.setMoisRffi("a");
    
        model1.setDecadeRffi("a");
        model2.setDecadeRffi("a");
    
        model1.setBicSwift("a");
        model2.setBicSwift("a");
    
        model1.setNcp("a");
        model2.setNcp("a");
    
        model1.setNomRsociale("a");
        model2.setNomRsociale("a");
    
        model1.setNumIdentification("a");
        model2.setNumIdentification("a");
    
        model1.setCentreRc("a");
        model2.setCentreRc("a");
    
        model1.setRc("a");
        model2.setRc("a");
    
        model1.setPays("a");
        model2.setPays("a");
    
        model1.setVille("a");
        model2.setVille("a");
    
        model1.setAdresse("a");
        model2.setAdresse("a");
    
        model1.setNomRsocialePartenaire("a");
        model2.setNomRsocialePartenaire("a");
    
        model1.setPaysPartenaire("a");
        model2.setPaysPartenaire("a");
    
        model1.setCodeNoperation("a");
        model2.setCodeNoperation("a");
    
        model1.setPprovenanceDestination("a");
        model2.setPprovenanceDestination("a");
    
        model1.setCodeDevise("a");
        model2.setCodeDevise("a");
    
        model1.setMontantDevise(1d);
        model2.setMontantDevise(1d);
    
        model1.setCoursApplique(1d);
        model2.setCoursApplique(1d);
    
        model1.setMontantApplique(1d);
        model2.setMontantApplique(1d);
    
        model1.setDateExecution(new Date());
        model2.setDateExecution(new Date());
    
        model1.setNumeroAutorisationOc("a");
        model2.setNumeroAutorisationOc("a");
    
        model1.setNumeroDossier("a");
        model2.setNumeroDossier("a");
    
        model1.setInformationOperation("a");
        model2.setInformationOperation("a");
    
        model1.setChampSupp2("a");
        model2.setChampSupp2("a");
    
        model1.setChampSupp3("a");
        model2.setChampSupp3("a");
    
        model1.setChampSupp4("a");
        model2.setChampSupp4("a");
    
        model1.setChampSupp5("a");
        model2.setChampSupp5("a");
    
        model1.setCreationDate(new Date());
        model2.setCreationDate(new Date());
    
        model1.setCreationAuthor("a");
        model2.setCreationAuthor("a");
    
        model1.setLastModificationDate(new Date());
        model2.setLastModificationDate(new Date());
    
        model1.setLastModificationAuthor("a");
        model2.setLastModificationAuthor("a");
    
        model1.setCodeErr(1);
        model2.setCodeErr(1);
    
        model1.setMotif("a");
        model2.setMotif("a");
    
        model1.setProperties("a");
        model2.setProperties("a");
    
        model1.setValeurErr("a");
        model2.setValeurErr("a");
    
        model1.setLib1("a");
        model2.setLib1("a");
    
        model1.setLib2("a");
        model2.setLib2("a");
    
        model1.setLib3("a");
        model2.setLib3("a");
    
        model1.setNumeroFormule("a");
        model2.setNumeroFormule("a");
    
        model1.setClient("a");
        model2.setClient("a");
    
        model1.setCodeLocalite("a");
        model2.setCodeLocalite("a");
    
        model1.setDateComptable(new Date());
        model2.setDateComptable(new Date());
    
        model1.setMotifoc("a");
        model2.setMotifoc("a");
    
        model1.setCodeerrodc("a");
        model2.setCodeerrodc("a");
    
        model1.setAffectprofil("a");
        model2.setAffectprofil("a");
    
        model1.setDateAffect(new Date());
        model2.setDateAffect(new Date());
        assertThat(model1.isIdSet()).isTrue();
        assertThat(model2.isIdSet()).isTrue();
        assertThat(model1.hashCode()).isEqualTo(model2.hashCode());
        assertThat(model1).isEqualTo(model2);
        assertThat(model2).isEqualTo(model1);
    }
     */
}