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
import com.jaxio.jpa.querybyexample.TermSelector;

import ma.sgma.edi2.domain.Account;
import ma.sgma.edi2.domain.Account_;
import ma.sgma.edi2.domain.Userrole;
import ma.sgma.edi2.web.domain.support.GenericSearchForm;
import ma.sgma.edi2.web.faces.ConversationContextScoped;

/**
 * View Helper to search {@link Account}.
 * It exposes a {@link Account} instance so it can be used in search by-example-query.
 */
@Named
@ConversationContextScoped
public class AccountSearchForm extends GenericSearchForm<Account, Integer, AccountSearchForm> {
    private static final long serialVersionUID = 1L;

    // full text search (applied first)
    protected TermSelector emailTermSelector = new TermSelector(Account_.email);

    // classic search
    protected Account account = new Account();
    protected Range<Account, Date> lastConnectionRange = newRange(Account_.lastConnection);
    protected Range<Account, Date> mdpExpirationRange = newRange(Account_.mdpExpiration);
    protected PropertySelector<Account, String> usernameSelector = newPropertySelector(Account_.username);
    protected PropertySelector<Account, String> passwordSelector = newPropertySelector(Account_.password);
    protected PropertySelector<Account, Boolean> isEnabledSelector = newPropertySelector(Account_.isEnabled);
    protected PropertySelector<Account, String> emailSelector = newPropertySelector(Account_.email);
    protected PropertySelector<Account, Userrole> securityRolesSelector = newPropertySelector(false, Account_.securityRoles);

    public Account getAccount() {
        return account;
    }

    @Override
    protected Account getEntity() {
        return getAccount();
    }

    @Override
    public AccountSearchForm newInstance() {
        return new AccountSearchForm();
    }

    @Override
    public SearchParameters toSearchParameters() {
        SearchParameters sp = searchParameters();
        sp.term(termsOnAll, emailTermSelector);
        sp.range(lastConnectionRange, mdpExpirationRange);
        sp.property(usernameSelector, passwordSelector, isEnabledSelector, emailSelector);
        sp.property(securityRolesSelector);
        return sp;
    }

    @Override
    public void resetWithOther(AccountSearchForm other) {
        this.account = other.getAccount();
        this.termsOnAll = other.getTermsOnAll();
        this.emailTermSelector = other.getEmailTermSelector();
        this.lastConnectionRange = other.getLastConnectionRange();
        this.mdpExpirationRange = other.getMdpExpirationRange();
        this.usernameSelector = other.getUsernameSelector();
        this.passwordSelector = other.getPasswordSelector();
        this.isEnabledSelector = other.getIsEnabledSelector();
        this.emailSelector = other.getEmailSelector();
        this.securityRolesSelector = other.getSecurityRolesSelector();
    }

    // Term selectors    
    public TermSelector getEmailTermSelector() {
        return emailTermSelector;
    }

    // Ranges
    public Range<Account, Date> getLastConnectionRange() {
        return lastConnectionRange;
    }

    public Range<Account, Date> getMdpExpirationRange() {
        return mdpExpirationRange;
    }

    // Property selectors
    public PropertySelector<Account, String> getUsernameSelector() {
        return usernameSelector;
    }

    public PropertySelector<Account, String> getPasswordSelector() {
        return passwordSelector;
    }

    public PropertySelector<Account, Boolean> getIsEnabledSelector() {
        return isEnabledSelector;
    }

    public PropertySelector<Account, String> getEmailSelector() {
        return emailSelector;
    }

    // Relation selectors
    public PropertySelector<Account, Userrole> getSecurityRolesSelector() {
        return securityRolesSelector;
    }
}
