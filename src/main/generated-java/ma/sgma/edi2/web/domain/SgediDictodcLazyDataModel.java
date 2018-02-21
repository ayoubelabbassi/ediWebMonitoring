/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-jsf2-spring-conversation:src/main/java/domain/LazyDataModel.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-jsf2-spring-conversation
 */
package ma.sgma.edi2.web.domain;

import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.LazyDataModel;

import ma.sgma.edi2.domain.SgediDictodc;
import ma.sgma.edi2.repository.SgediDictodcRepository;
import ma.sgma.edi2.web.domain.support.GenericLazyDataModel;
import ma.sgma.edi2.web.faces.ConversationContextScoped;

/**
 * Provide PrimeFaces {@link LazyDataModel} for {@link SgediDictodc}
 */
@Named
@ConversationContextScoped
public class SgediDictodcLazyDataModel extends GenericLazyDataModel<SgediDictodc, Integer, SgediDictodcSearchForm> {
    private static final long serialVersionUID = 1L;

    @Inject
    public SgediDictodcLazyDataModel(SgediDictodcRepository sgediDictodcRepository, SgediDictodcController sgediDictodcController,
            SgediDictodcSearchForm sgediDictodcSearchForm, SgediDictodcExcelExporter sgediDictodcExcelExporter) {
        super(sgediDictodcRepository, sgediDictodcController, sgediDictodcSearchForm, sgediDictodcExcelExporter);
        this.setModule("DIC");
    }
}