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

import ma.sgma.edi2.domain.SgediParams;
import ma.sgma.edi2.web.domain.support.GenericExcelExporter;
import ma.sgma.edi2.web.faces.ConversationContextScoped;

/**
 * Exports to excel document {@link SgediParams} search criteria and result. 
 */
@Named
@ConversationContextScoped
public class SgediParamsExcelExporter extends GenericExcelExporter<SgediParams> {
    @Inject
    protected SgediParamsSearchForm sf;

    public SgediParamsExcelExporter() {
        super("sgediParams_code", "sgediParams_libelle", "sgediParams_lib1", "sgediParams_lib2", "sgediParams_lib3");
    }

    @Override
    protected void fillResultItem(int row, SgediParams item) {
        int col = 0;
        setValue(row, col++, item.getCode());
        setValue(row, col++, item.getLibelle());
        setValue(row, col++, item.getLib1());
        setValue(row, col++, item.getLib2());
        setValue(row, col++, item.getLib3());
    }

    @Override
    public void fillSearchCriteria(int row) {
        useCriteriaSheet();

        setSelector(row++, 0, "sgediParams_code", sf.getCodeSelector());
        setSelector(row++, 0, "sgediParams_libelle", sf.getLibelleSelector());
        setSelector(row++, 0, "sgediParams_lib1", sf.getLib1Selector());
        setSelector(row++, 0, "sgediParams_lib2", sf.getLib2Selector());
        setSelector(row++, 0, "sgediParams_lib3", sf.getLib3Selector());
    }
}