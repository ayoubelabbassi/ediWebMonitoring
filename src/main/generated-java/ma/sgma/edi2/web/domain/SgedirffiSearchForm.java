/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-jsf2-spring-conversation:src/main/java/domain/SearchForm.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-jsf2-spring-conversation
 */
package ma.sgma.edi2.web.domain;

import static com.jaxio.jpa.querybyexample.PropertySelector.newPropertySelector;
import static com.jaxio.jpa.querybyexample.Range.newRange;

import java.util.Date;

import javax.inject.Named;

import com.jaxio.jpa.querybyexample.PropertySelector;
import com.jaxio.jpa.querybyexample.Range;
import com.jaxio.jpa.querybyexample.SearchParameters;

import ma.sgma.edi2.domain.SgediDictodc;
import ma.sgma.edi2.domain.SgediParams;
import ma.sgma.edi2.domain.Sgedirffi;
import ma.sgma.edi2.domain.Sgedirffi_;
import ma.sgma.edi2.domain.Sgedixml;
import ma.sgma.edi2.domain.Userrole;
import ma.sgma.edi2.web.domain.support.GenericSearchForm;
import ma.sgma.edi2.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link Sgedirffi}.
 * It exposes a {@link Sgedirffi} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class SgedirffiSearchForm extends GenericSearchForm<Sgedirffi, Integer, SgedirffiSearchForm> {
    private static final long serialVersionUID = 1L;
    protected Sgedirffi sgedirffi = new Sgedirffi();
    protected Range<Sgedirffi, Double> montantDeviseRange = newRange(Sgedirffi_.montantDevise);
    protected Range<Sgedirffi, Double> coursAppliqueRange = newRange(Sgedirffi_.coursApplique);
    protected Range<Sgedirffi, Double> montantAppliqueRange = newRange(Sgedirffi_.montantApplique);
    protected Range<Sgedirffi, Date> dateExecutionRange = newRange(Sgedirffi_.dateExecution);
    protected Range<Sgedirffi, Integer> codeErrRange = newRange(Sgedirffi_.codeErr);
    protected Range<Sgedirffi, Date> dateComptableRange = newRange(Sgedirffi_.dateComptable);
    protected Range<Sgedirffi, Date> dateAffectRange = newRange(Sgedirffi_.dateAffect);
    protected PropertySelector<Sgedirffi, String> codeLigneSelector = newPropertySelector(Sgedirffi_.codeLigne);
    protected PropertySelector<Sgedirffi, String> codeBanqueSelector = newPropertySelector(Sgedirffi_.codeBanque);
    protected PropertySelector<Sgedirffi, String> numeroGuichetSelector = newPropertySelector(Sgedirffi_.numeroGuichet);
    protected PropertySelector<Sgedirffi, String> anneRffiSelector = newPropertySelector(Sgedirffi_.anneRffi);
    protected PropertySelector<Sgedirffi, String> moisRffiSelector = newPropertySelector(Sgedirffi_.moisRffi);
    protected PropertySelector<Sgedirffi, String> decadeRffiSelector = newPropertySelector(Sgedirffi_.decadeRffi);
    protected PropertySelector<Sgedirffi, String> bicSwiftSelector = newPropertySelector(Sgedirffi_.bicSwift);
    protected PropertySelector<Sgedirffi, String> ncpSelector = newPropertySelector(Sgedirffi_.ncp);
    protected PropertySelector<Sgedirffi, String> nomRsocialeSelector = newPropertySelector(Sgedirffi_.nomRsociale);
    protected PropertySelector<Sgedirffi, String> numIdentificationSelector = newPropertySelector(Sgedirffi_.numIdentification);
    protected PropertySelector<Sgedirffi, String> centreRcSelector = newPropertySelector(Sgedirffi_.centreRc);
    protected PropertySelector<Sgedirffi, String> rcSelector = newPropertySelector(Sgedirffi_.rc);
    protected PropertySelector<Sgedirffi, String> paysSelector = newPropertySelector(Sgedirffi_.pays);
    protected PropertySelector<Sgedirffi, String> villeSelector = newPropertySelector(Sgedirffi_.ville);
    protected PropertySelector<Sgedirffi, String> adresseSelector = newPropertySelector(Sgedirffi_.adresse);
    protected PropertySelector<Sgedirffi, String> nomRsocialePartenaireSelector = newPropertySelector(Sgedirffi_.nomRsocialePartenaire);
    protected PropertySelector<Sgedirffi, String> paysPartenaireSelector = newPropertySelector(Sgedirffi_.paysPartenaire);
    protected PropertySelector<Sgedirffi, String> codeNoperationSelector = newPropertySelector(Sgedirffi_.codeNoperation);
    protected PropertySelector<Sgedirffi, String> pprovenanceDestinationSelector = newPropertySelector(Sgedirffi_.pprovenanceDestination);
    protected PropertySelector<Sgedirffi, String> codeDeviseSelector = newPropertySelector(Sgedirffi_.codeDevise);
    protected PropertySelector<Sgedirffi, Double> montantDeviseSelector = newPropertySelector(Sgedirffi_.montantDevise);
    protected PropertySelector<Sgedirffi, Double> coursAppliqueSelector = newPropertySelector(Sgedirffi_.coursApplique);
    protected PropertySelector<Sgedirffi, Double> montantAppliqueSelector = newPropertySelector(Sgedirffi_.montantApplique);
    protected PropertySelector<Sgedirffi, String> numeroAutorisationOcSelector = newPropertySelector(Sgedirffi_.numeroAutorisationOc);
    protected PropertySelector<Sgedirffi, String> numeroDossierSelector = newPropertySelector(Sgedirffi_.numeroDossier);
    protected PropertySelector<Sgedirffi, String> informationOperationSelector = newPropertySelector(Sgedirffi_.informationOperation);
    protected PropertySelector<Sgedirffi, String> champSupp2Selector = newPropertySelector(Sgedirffi_.champSupp2);
    protected PropertySelector<Sgedirffi, String> champSupp3Selector = newPropertySelector(Sgedirffi_.champSupp3);
    protected PropertySelector<Sgedirffi, String> champSupp4Selector = newPropertySelector(Sgedirffi_.champSupp4);
    protected PropertySelector<Sgedirffi, String> champSupp5Selector = newPropertySelector(Sgedirffi_.champSupp5);
    protected PropertySelector<Sgedirffi, Integer> codeErrSelector = newPropertySelector(Sgedirffi_.codeErr);
    protected PropertySelector<Sgedirffi, String> motifSelector = newPropertySelector(Sgedirffi_.motif);
    protected PropertySelector<Sgedirffi, String> propertiesSelector = newPropertySelector(Sgedirffi_.properties);
    protected PropertySelector<Sgedirffi, String> valeurErrSelector = newPropertySelector(Sgedirffi_.valeurErr);
    protected PropertySelector<Sgedirffi, String> lib1Selector = newPropertySelector(Sgedirffi_.lib1);
    protected PropertySelector<Sgedirffi, String> lib2Selector = newPropertySelector(Sgedirffi_.lib2);
    protected PropertySelector<Sgedirffi, String> lib3Selector = newPropertySelector(Sgedirffi_.lib3);
    protected PropertySelector<Sgedirffi, String> numeroFormuleSelector = newPropertySelector(Sgedirffi_.numeroFormule);
    protected PropertySelector<Sgedirffi, String> clientSelector = newPropertySelector(Sgedirffi_.client);
    protected PropertySelector<Sgedirffi, String> codeLocaliteSelector = newPropertySelector(Sgedirffi_.codeLocalite);
    protected PropertySelector<Sgedirffi, String> motifocSelector = newPropertySelector(Sgedirffi_.motifoc);
    protected PropertySelector<Sgedirffi, String> codeerrodcSelector = newPropertySelector(Sgedirffi_.codeerrodc);
    protected PropertySelector<Sgedirffi, String> affectprofilSelector = newPropertySelector(Sgedirffi_.affectprofil);
    protected PropertySelector<Sgedirffi, Sgedixml> idXmlSelector = newPropertySelector(Sgedirffi_.idXml);
    protected PropertySelector<Sgedirffi, SgediDictodc> typeIdentificationSelector = newPropertySelector(Sgedirffi_.typeIdentification);
    protected PropertySelector<Sgedirffi, SgediParams> statutIntSelector = newPropertySelector(Sgedirffi_.statutInt);
    protected PropertySelector<Sgedirffi, SgediDictodc> qualiteSelector = newPropertySelector(Sgedirffi_.qualite);
    protected PropertySelector<Sgedirffi, Userrole> codeRoleSelector = newPropertySelector(Sgedirffi_.codeRole);
    protected PropertySelector<Sgedirffi, SgediDictodc> categorieFormuleSelector = newPropertySelector(Sgedirffi_.categorieFormule);
    protected PropertySelector<Sgedirffi, SgediDictodc> sensOperationSelector = newPropertySelector(Sgedirffi_.sensOperation);
    protected PropertySelector<Sgedirffi, SgediParams> statutEchSelector = newPropertySelector(Sgedirffi_.statutEch);

    public Sgedirffi getSgedirffi() {
        return sgedirffi;
    }

    @Override
    protected Sgedirffi getEntity() {
        return getSgedirffi();
    }

    @Override
    public SgedirffiSearchForm newInstance() {
        return new SgedirffiSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.range(montantDeviseRange, coursAppliqueRange, montantAppliqueRange, dateExecutionRange, codeErrRange, dateComptableRange, dateAffectRange);
        sp.property(codeLigneSelector, codeBanqueSelector, numeroGuichetSelector, anneRffiSelector, moisRffiSelector, decadeRffiSelector, bicSwiftSelector,
                ncpSelector, nomRsocialeSelector, numIdentificationSelector, centreRcSelector, rcSelector, paysSelector, villeSelector, adresseSelector,
                nomRsocialePartenaireSelector, paysPartenaireSelector, codeNoperationSelector, pprovenanceDestinationSelector, codeDeviseSelector,
                montantDeviseSelector, coursAppliqueSelector, montantAppliqueSelector, numeroAutorisationOcSelector, numeroDossierSelector,
                informationOperationSelector, champSupp2Selector, champSupp3Selector, champSupp4Selector, champSupp5Selector, codeErrSelector, motifSelector,
                propertiesSelector, valeurErrSelector, lib1Selector, lib2Selector, lib3Selector, numeroFormuleSelector, clientSelector, codeLocaliteSelector,
                motifocSelector, codeerrodcSelector, affectprofilSelector);
        sp.property(idXmlSelector, typeIdentificationSelector, statutIntSelector, qualiteSelector, codeRoleSelector, categorieFormuleSelector,
                sensOperationSelector, statutEchSelector);
        return sp;
    }

    @Override
    public void resetWithOther(SgedirffiSearchForm other) {
        this.sgedirffi = other.getSgedirffi();
        this.montantDeviseRange = other.getMontantDeviseRange();
        this.coursAppliqueRange = other.getCoursAppliqueRange();
        this.montantAppliqueRange = other.getMontantAppliqueRange();
        this.dateExecutionRange = other.getDateExecutionRange();
        this.codeErrRange = other.getCodeErrRange();
        this.dateComptableRange = other.getDateComptableRange();
        this.dateAffectRange = other.getDateAffectRange();
        this.codeLigneSelector = other.getCodeLigneSelector();
        this.codeBanqueSelector = other.getCodeBanqueSelector();
        this.numeroGuichetSelector = other.getNumeroGuichetSelector();
        this.anneRffiSelector = other.getAnneRffiSelector();
        this.moisRffiSelector = other.getMoisRffiSelector();
        this.decadeRffiSelector = other.getDecadeRffiSelector();
        this.bicSwiftSelector = other.getBicSwiftSelector();
        this.ncpSelector = other.getNcpSelector();
        this.nomRsocialeSelector = other.getNomRsocialeSelector();
        this.numIdentificationSelector = other.getNumIdentificationSelector();
        this.centreRcSelector = other.getCentreRcSelector();
        this.rcSelector = other.getRcSelector();
        this.paysSelector = other.getPaysSelector();
        this.villeSelector = other.getVilleSelector();
        this.adresseSelector = other.getAdresseSelector();
        this.nomRsocialePartenaireSelector = other.getNomRsocialePartenaireSelector();
        this.paysPartenaireSelector = other.getPaysPartenaireSelector();
        this.codeNoperationSelector = other.getCodeNoperationSelector();
        this.pprovenanceDestinationSelector = other.getPprovenanceDestinationSelector();
        this.codeDeviseSelector = other.getCodeDeviseSelector();
        this.montantDeviseSelector = other.getMontantDeviseSelector();
        this.coursAppliqueSelector = other.getCoursAppliqueSelector();
        this.montantAppliqueSelector = other.getMontantAppliqueSelector();
        this.numeroAutorisationOcSelector = other.getNumeroAutorisationOcSelector();
        this.numeroDossierSelector = other.getNumeroDossierSelector();
        this.informationOperationSelector = other.getInformationOperationSelector();
        this.champSupp2Selector = other.getChampSupp2Selector();
        this.champSupp3Selector = other.getChampSupp3Selector();
        this.champSupp4Selector = other.getChampSupp4Selector();
        this.champSupp5Selector = other.getChampSupp5Selector();
        this.codeErrSelector = other.getCodeErrSelector();
        this.motifSelector = other.getMotifSelector();
        this.propertiesSelector = other.getPropertiesSelector();
        this.valeurErrSelector = other.getValeurErrSelector();
        this.lib1Selector = other.getLib1Selector();
        this.lib2Selector = other.getLib2Selector();
        this.lib3Selector = other.getLib3Selector();
        this.numeroFormuleSelector = other.getNumeroFormuleSelector();
        this.clientSelector = other.getClientSelector();
        this.codeLocaliteSelector = other.getCodeLocaliteSelector();
        this.motifocSelector = other.getMotifocSelector();
        this.codeerrodcSelector = other.getCodeerrodcSelector();
        this.affectprofilSelector = other.getAffectprofilSelector();
        this.idXmlSelector = other.getIdXmlSelector();
        this.typeIdentificationSelector = other.getTypeIdentificationSelector();
        this.statutIntSelector = other.getStatutIntSelector();
        this.qualiteSelector = other.getQualiteSelector();
        this.codeRoleSelector = other.getCodeRoleSelector();
        this.categorieFormuleSelector = other.getCategorieFormuleSelector();
        this.sensOperationSelector = other.getSensOperationSelector();
        this.statutEchSelector = other.getStatutEchSelector();
    }

    // Ranges
    public Range<Sgedirffi, Double> getMontantDeviseRange() {
        return montantDeviseRange;
    }

    public Range<Sgedirffi, Double> getCoursAppliqueRange() {
        return coursAppliqueRange;
    }

    public Range<Sgedirffi, Double> getMontantAppliqueRange() {
        return montantAppliqueRange;
    }

    public Range<Sgedirffi, Date> getDateExecutionRange() {
        return dateExecutionRange;
    }

    public Range<Sgedirffi, Integer> getCodeErrRange() {
        return codeErrRange;
    }

    public Range<Sgedirffi, Date> getDateComptableRange() {
        return dateComptableRange;
    }

    public Range<Sgedirffi, Date> getDateAffectRange() {
        return dateAffectRange;
    }

    // Property selectors
    public PropertySelector<Sgedirffi, String> getCodeLigneSelector() {
        return codeLigneSelector;
    }

    public PropertySelector<Sgedirffi, String> getCodeBanqueSelector() {
        return codeBanqueSelector;
    }

    public PropertySelector<Sgedirffi, String> getNumeroGuichetSelector() {
        return numeroGuichetSelector;
    }

    public PropertySelector<Sgedirffi, String> getAnneRffiSelector() {
        return anneRffiSelector;
    }

    public PropertySelector<Sgedirffi, String> getMoisRffiSelector() {
        return moisRffiSelector;
    }

    public PropertySelector<Sgedirffi, String> getDecadeRffiSelector() {
        return decadeRffiSelector;
    }

    public PropertySelector<Sgedirffi, String> getBicSwiftSelector() {
        return bicSwiftSelector;
    }

    public PropertySelector<Sgedirffi, String> getNcpSelector() {
        return ncpSelector;
    }

    public PropertySelector<Sgedirffi, String> getNomRsocialeSelector() {
        return nomRsocialeSelector;
    }

    public PropertySelector<Sgedirffi, String> getNumIdentificationSelector() {
        return numIdentificationSelector;
    }

    public PropertySelector<Sgedirffi, String> getCentreRcSelector() {
        return centreRcSelector;
    }

    public PropertySelector<Sgedirffi, String> getRcSelector() {
        return rcSelector;
    }

    public PropertySelector<Sgedirffi, String> getPaysSelector() {
        return paysSelector;
    }

    public PropertySelector<Sgedirffi, String> getVilleSelector() {
        return villeSelector;
    }

    public PropertySelector<Sgedirffi, String> getAdresseSelector() {
        return adresseSelector;
    }

    public PropertySelector<Sgedirffi, String> getNomRsocialePartenaireSelector() {
        return nomRsocialePartenaireSelector;
    }

    public PropertySelector<Sgedirffi, String> getPaysPartenaireSelector() {
        return paysPartenaireSelector;
    }

    public PropertySelector<Sgedirffi, String> getCodeNoperationSelector() {
        return codeNoperationSelector;
    }

    public PropertySelector<Sgedirffi, String> getPprovenanceDestinationSelector() {
        return pprovenanceDestinationSelector;
    }

    public PropertySelector<Sgedirffi, String> getCodeDeviseSelector() {
        return codeDeviseSelector;
    }

    public PropertySelector<Sgedirffi, Double> getMontantDeviseSelector() {
        return montantDeviseSelector;
    }

    public PropertySelector<Sgedirffi, Double> getCoursAppliqueSelector() {
        return coursAppliqueSelector;
    }

    public PropertySelector<Sgedirffi, Double> getMontantAppliqueSelector() {
        return montantAppliqueSelector;
    }

    public PropertySelector<Sgedirffi, String> getNumeroAutorisationOcSelector() {
        return numeroAutorisationOcSelector;
    }

    public PropertySelector<Sgedirffi, String> getNumeroDossierSelector() {
        return numeroDossierSelector;
    }

    public PropertySelector<Sgedirffi, String> getInformationOperationSelector() {
        return informationOperationSelector;
    }

    public PropertySelector<Sgedirffi, String> getChampSupp2Selector() {
        return champSupp2Selector;
    }

    public PropertySelector<Sgedirffi, String> getChampSupp3Selector() {
        return champSupp3Selector;
    }

    public PropertySelector<Sgedirffi, String> getChampSupp4Selector() {
        return champSupp4Selector;
    }

    public PropertySelector<Sgedirffi, String> getChampSupp5Selector() {
        return champSupp5Selector;
    }

    public PropertySelector<Sgedirffi, Integer> getCodeErrSelector() {
        return codeErrSelector;
    }

    public PropertySelector<Sgedirffi, String> getMotifSelector() {
        return motifSelector;
    }

    public PropertySelector<Sgedirffi, String> getPropertiesSelector() {
        return propertiesSelector;
    }

    public PropertySelector<Sgedirffi, String> getValeurErrSelector() {
        return valeurErrSelector;
    }

    public PropertySelector<Sgedirffi, String> getLib1Selector() {
        return lib1Selector;
    }

    public PropertySelector<Sgedirffi, String> getLib2Selector() {
        return lib2Selector;
    }

    public PropertySelector<Sgedirffi, String> getLib3Selector() {
        return lib3Selector;
    }

    public PropertySelector<Sgedirffi, String> getNumeroFormuleSelector() {
        return numeroFormuleSelector;
    }

    public PropertySelector<Sgedirffi, String> getClientSelector() {
        return clientSelector;
    }

    public PropertySelector<Sgedirffi, String> getCodeLocaliteSelector() {
        return codeLocaliteSelector;
    }

    public PropertySelector<Sgedirffi, String> getMotifocSelector() {
        return motifocSelector;
    }

    public PropertySelector<Sgedirffi, String> getCodeerrodcSelector() {
        return codeerrodcSelector;
    }

    public PropertySelector<Sgedirffi, String> getAffectprofilSelector() {
        return affectprofilSelector;
    }

    // Relation selectors
    public PropertySelector<Sgedirffi, Sgedixml> getIdXmlSelector() {
        return idXmlSelector;
    }

    public PropertySelector<Sgedirffi, SgediDictodc> getTypeIdentificationSelector() {
        return typeIdentificationSelector;
    }

    public PropertySelector<Sgedirffi, SgediParams> getStatutIntSelector() {
        return statutIntSelector;
    }

    public PropertySelector<Sgedirffi, SgediDictodc> getQualiteSelector() {
        return qualiteSelector;
    }

    public PropertySelector<Sgedirffi, Userrole> getCodeRoleSelector() {
        return codeRoleSelector;
    }

    public PropertySelector<Sgedirffi, SgediDictodc> getCategorieFormuleSelector() {
        return categorieFormuleSelector;
    }

    public PropertySelector<Sgedirffi, SgediDictodc> getSensOperationSelector() {
        return sensOperationSelector;
    }

    public PropertySelector<Sgedirffi, SgediParams> getStatutEchSelector() {
        return statutEchSelector;
    }
}
