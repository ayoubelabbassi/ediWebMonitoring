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

import ma.sgma.edi2.domain.Auditlog;
import ma.sgma.edi2.domain.Auditlog_;
import ma.sgma.edi2.web.domain.support.GenericSearchForm;
import ma.sgma.edi2.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link Auditlog}.
 * It exposes a {@link Auditlog} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class AuditlogSearchForm extends GenericSearchForm<Auditlog, Integer, AuditlogSearchForm> {
    private static final long serialVersionUID = 1L;
    protected Auditlog auditlog = new Auditlog();
    protected Range<Auditlog, Date> eventDateRange = newRange(Auditlog_.eventDate);
    protected PropertySelector<Auditlog, String> authorSelector = newPropertySelector(Auditlog_.author);
    protected PropertySelector<Auditlog, String> eventSelector = newPropertySelector(Auditlog_.event);
    protected PropertySelector<Auditlog, String> stringAttribute1Selector = newPropertySelector(Auditlog_.stringAttribute1);
    protected PropertySelector<Auditlog, String> stringAttribute2Selector = newPropertySelector(Auditlog_.stringAttribute2);
    protected PropertySelector<Auditlog, String> stringAttribute3Selector = newPropertySelector(Auditlog_.stringAttribute3);

    public Auditlog getAuditlog() {
        return auditlog;
    }

    @Override
    protected Auditlog getEntity() {
        return getAuditlog();
    }

    @Override
    public AuditlogSearchForm newInstance() {
        return new AuditlogSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.range(eventDateRange);
        sp.property(authorSelector, eventSelector, stringAttribute1Selector, stringAttribute2Selector, stringAttribute3Selector);
        return sp;
    }

    @Override
    public void resetWithOther(AuditlogSearchForm other) {
        this.auditlog = other.getAuditlog();
        this.eventDateRange = other.getEventDateRange();
        this.authorSelector = other.getAuthorSelector();
        this.eventSelector = other.getEventSelector();
        this.stringAttribute1Selector = other.getStringAttribute1Selector();
        this.stringAttribute2Selector = other.getStringAttribute2Selector();
        this.stringAttribute3Selector = other.getStringAttribute3Selector();
    }

    // Ranges
    public Range<Auditlog, Date> getEventDateRange() {
        return eventDateRange;
    }

    // Property selectors
    public PropertySelector<Auditlog, String> getAuthorSelector() {
        return authorSelector;
    }

    public PropertySelector<Auditlog, String> getEventSelector() {
        return eventSelector;
    }

    public PropertySelector<Auditlog, String> getStringAttribute1Selector() {
        return stringAttribute1Selector;
    }

    public PropertySelector<Auditlog, String> getStringAttribute2Selector() {
        return stringAttribute2Selector;
    }

    public PropertySelector<Auditlog, String> getStringAttribute3Selector() {
        return stringAttribute3Selector;
    }
}
