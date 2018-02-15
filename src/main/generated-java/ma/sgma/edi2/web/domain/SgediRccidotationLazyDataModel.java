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

import ma.sgma.edi2.domain.SgediRccidotation;
import ma.sgma.edi2.repository.SgediRccidotationRepository;
import ma.sgma.edi2.web.domain.support.GenericLazyDataModel;
import ma.sgma.edi2.web.faces.ConversationContextScoped;

/**
 * Provide PrimeFaces {@link LazyDataModel} for {@link SgediRccidotation}
 */
@Named
@ConversationContextScoped
public class SgediRccidotationLazyDataModel extends GenericLazyDataModel<SgediRccidotation, Integer, SgediRccidotationSearchForm> {
    private static final long serialVersionUID = 1L;

    @Inject
    public SgediRccidotationLazyDataModel(SgediRccidotationRepository sgediRccidotationRepository, SgediRccidotationController sgediRccidotationController,
            SgediRccidotationSearchForm sgediRccidotationSearchForm, SgediRccidotationExcelExporter sgediRccidotationExcelExporter) {
        super(sgediRccidotationRepository, sgediRccidotationController, sgediRccidotationSearchForm, sgediRccidotationExcelExporter);
    }
}