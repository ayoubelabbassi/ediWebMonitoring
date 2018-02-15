/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-jsf2-spring-conversation:src/main/java/domain/ExcelExporter.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-jsf2-spring-conversation
 */
package ma.sgma.edi2.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import ma.sgma.edi2.domain.Sgedirffi;
import ma.sgma.edi2.web.domain.support.GenericExcelExporter;
import ma.sgma.edi2.web.faces.ConversationContextScoped;

/**
 * Exports to excel document {@link Sgedirffi} search criteria and result. 
 */
@Named
@ConversationContextScoped
public class SgedirffiExcelExporter extends GenericExcelExporter<Sgedirffi> {
    @Inject
    protected SgedirffiSearchForm sf;

    public SgedirffiExcelExporter() {
        super("sgedirffi_codeLigne", "sgedirffi_codeBanque", "sgedirffi_numeroGuichet", "sgedirffi_anneRffi", "sgedirffi_moisRffi", "sgedirffi_decadeRffi");
    }

    @Override
    protected void fillResultItem(int row, Sgedirffi item) {
        int col = 0;
        setValue(row, col++, item.getCodeLigne());
        setValue(row, col++, item.getCodeBanque());
        setValue(row, col++, item.getNumeroGuichet());
        setValue(row, col++, item.getAnneRffi());
        setValue(row, col++, item.getMoisRffi());
        setValue(row, col++, item.getDecadeRffi());
    }

    @Override
    public void fillSearchCriteria(int row) {
        useCriteriaSheet();

        setSelector(row++, 0, "sgedirffi_codeLigne", sf.getCodeLigneSelector());
        setSelector(row++, 0, "sgedirffi_codeBanque", sf.getCodeBanqueSelector());
        setSelector(row++, 0, "sgedirffi_numeroGuichet", sf.getNumeroGuichetSelector());
        setSelector(row++, 0, "sgedirffi_anneRffi", sf.getAnneRffiSelector());
        setSelector(row++, 0, "sgedirffi_moisRffi", sf.getMoisRffiSelector());
        setSelector(row++, 0, "sgedirffi_decadeRffi", sf.getDecadeRffiSelector());
        setSelector(row++, 0, "sgedirffi_bicSwift", sf.getBicSwiftSelector());
        setSelector(row++, 0, "sgedirffi_ncp", sf.getNcpSelector());
        setSelector(row++, 0, "sgedirffi_nomRsociale", sf.getNomRsocialeSelector());
        setSelectedEntities(row++, 0, "sgedirffi_qualite", sf.getQualiteSelector().getSelected());
        setSelectedEntities(row++, 0, "sgedirffi_typeIdentification", sf.getTypeIdentificationSelector().getSelected());
        setSelector(row++, 0, "sgedirffi_numIdentification", sf.getNumIdentificationSelector());
        setSelector(row++, 0, "sgedirffi_centreRc", sf.getCentreRcSelector());
        setSelector(row++, 0, "sgedirffi_rc", sf.getRcSelector());
        setSelector(row++, 0, "sgedirffi_pays", sf.getPaysSelector());
        setSelector(row++, 0, "sgedirffi_ville", sf.getVilleSelector());
        setSelector(row++, 0, "sgedirffi_adresse", sf.getAdresseSelector());
        setSelector(row++, 0, "sgedirffi_nomRsocialePartenaire", sf.getNomRsocialePartenaireSelector());
        setSelector(row++, 0, "sgedirffi_paysPartenaire", sf.getPaysPartenaireSelector());
        setSelectedEntities(row++, 0, "sgedirffi_sensOperation", sf.getSensOperationSelector().getSelected());
        setSelectedEntities(row++, 0, "sgedirffi_categorieFormule", sf.getCategorieFormuleSelector().getSelected());
        setSelector(row++, 0, "sgedirffi_codeNoperation", sf.getCodeNoperationSelector());
        setSelector(row++, 0, "sgedirffi_pprovenanceDestination", sf.getPprovenanceDestinationSelector());
        setSelector(row++, 0, "sgedirffi_codeDevise", sf.getCodeDeviseSelector());
        setRangeNumber(row++, 0, "sgedirffi_montantDevise", sf.getMontantDeviseRange());
        setRangeNumber(row++, 0, "sgedirffi_coursApplique", sf.getCoursAppliqueRange());
        setRangeNumber(row++, 0, "sgedirffi_montantApplique", sf.getMontantAppliqueRange());
        setRangeDate(row++, 0, "sgedirffi_dateExecution", sf.getDateExecutionRange());
        setSelector(row++, 0, "sgedirffi_numeroAutorisationOc", sf.getNumeroAutorisationOcSelector());
        setSelector(row++, 0, "sgedirffi_numeroDossier", sf.getNumeroDossierSelector());
        setSelector(row++, 0, "sgedirffi_informationOperation", sf.getInformationOperationSelector());
        setSelector(row++, 0, "sgedirffi_champSupp2", sf.getChampSupp2Selector());
        setSelector(row++, 0, "sgedirffi_champSupp3", sf.getChampSupp3Selector());
        setSelector(row++, 0, "sgedirffi_champSupp4", sf.getChampSupp4Selector());
        setSelector(row++, 0, "sgedirffi_champSupp5", sf.getChampSupp5Selector());
        setSelectedEntities(row++, 0, "sgedirffi_statutInt", sf.getStatutIntSelector().getSelected());
        setSelectedEntities(row++, 0, "sgedirffi_statutEch", sf.getStatutEchSelector().getSelected());
        setRangeNumber(row++, 0, "sgedirffi_codeErr", sf.getCodeErrRange());
        setSelector(row++, 0, "sgedirffi_motif", sf.getMotifSelector());
        setSelector(row++, 0, "sgedirffi_properties", sf.getPropertiesSelector());
        setSelector(row++, 0, "sgedirffi_valeurErr", sf.getValeurErrSelector());
        setSelectedEntities(row++, 0, "sgedirffi_codeRole", sf.getCodeRoleSelector().getSelected());
        setSelectedEntities(row++, 0, "sgedirffi_idXml", sf.getIdXmlSelector().getSelected());
        setSelector(row++, 0, "sgedirffi_lib1", sf.getLib1Selector());
        setSelector(row++, 0, "sgedirffi_lib2", sf.getLib2Selector());
        setSelector(row++, 0, "sgedirffi_lib3", sf.getLib3Selector());
        setSelector(row++, 0, "sgedirffi_numeroFormule", sf.getNumeroFormuleSelector());
        setSelector(row++, 0, "sgedirffi_client", sf.getClientSelector());
        setSelector(row++, 0, "sgedirffi_codeLocalite", sf.getCodeLocaliteSelector());
        setRangeDate(row++, 0, "sgedirffi_dateComptable", sf.getDateComptableRange());
        setSelector(row++, 0, "sgedirffi_motifoc", sf.getMotifocSelector());
        setSelector(row++, 0, "sgedirffi_codeerrodc", sf.getCodeerrodcSelector());
        setSelector(row++, 0, "sgedirffi_affectprofil", sf.getAffectprofilSelector());
        setRangeDateTime(row++, 0, "sgedirffi_dateAffect", sf.getDateAffectRange());
    }
}