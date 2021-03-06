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

import ma.sgma.edi2.domain.Auditlog;
import ma.sgma.edi2.printer.AuditlogPrinter;
import ma.sgma.edi2.repository.AuditlogRepository;
import ma.sgma.edi2.web.domain.support.GenericController;
import ma.sgma.edi2.web.permission.AuditlogPermission;

/**
 * Stateless controller for {@link Auditlog} conversation start.
 */
@Named
@Singleton
public class AuditlogController extends GenericController<Auditlog, Integer> {
    public static final String AUDITLOG_EDIT_URI = "/domain/auditlogEdit.faces";
    public static final String AUDITLOG_SELECT_URI = "/domain/auditlogSelect.faces";

    @Inject
    public AuditlogController(AuditlogRepository auditlogRepository, AuditlogPermission auditlogPermission, AuditlogPrinter auditlogPrinter) {
        super(auditlogRepository, auditlogPermission, auditlogPrinter, AUDITLOG_SELECT_URI, AUDITLOG_EDIT_URI);
    }
}