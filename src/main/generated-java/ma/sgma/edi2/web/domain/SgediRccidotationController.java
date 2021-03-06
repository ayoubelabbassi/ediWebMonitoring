/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-jsf2-spring-conversation:src/main/java/domain/Controller.e.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-jsf2-spring-conversation
 */
package ma.sgma.edi2.web.domain;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import ma.sgma.edi2.domain.SgediRccidotation;
import ma.sgma.edi2.printer.SgediRccidotationPrinter;
import ma.sgma.edi2.repository.SgediRccidotationRepository;
import ma.sgma.edi2.web.domain.support.GenericController;
import ma.sgma.edi2.web.permission.SgediRccidotationPermission;

/**
 * Stateless controller for {@link SgediRccidotation} conversation start.
 */
@Named
@Singleton
public class SgediRccidotationController extends GenericController<SgediRccidotation, Integer> {
    public static final String SGEDIRCCIDOTATION_EDIT_URI = "/domain/sgediRccidotationEdit.faces";
    public static final String SGEDIRCCIDOTATION_SELECT_URI = "/domain/sgediRccidotationSelect.faces";

    @Inject
    public SgediRccidotationController(SgediRccidotationRepository sgediRccidotationRepository, SgediRccidotationPermission sgediRccidotationPermission,
            SgediRccidotationPrinter sgediRccidotationPrinter) {
        super(sgediRccidotationRepository, sgediRccidotationPermission, sgediRccidotationPrinter, SGEDIRCCIDOTATION_SELECT_URI, SGEDIRCCIDOTATION_EDIT_URI);
    }
}