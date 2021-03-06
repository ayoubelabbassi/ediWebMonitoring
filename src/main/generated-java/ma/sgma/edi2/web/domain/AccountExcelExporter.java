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

import ma.sgma.edi2.domain.Account;
import ma.sgma.edi2.web.domain.support.GenericExcelExporter;
import ma.sgma.edi2.web.faces.ConversationContextScoped;

/**
 * Exports to excel document {@link Account} search criteria and result. 
 */
@Named
@ConversationContextScoped
public class AccountExcelExporter extends GenericExcelExporter<Account> {
    @Inject
    protected AccountSearchForm sf;

    public AccountExcelExporter() {
        super("account_username", "account_isEnabled", "account_email");
    }

    @Override
    protected void fillResultItem(int row, Account item) {
        int col = 0;
        setValue(row, col++, item.getUsername());
        setValue(row, col++, item.getIsEnabled());
        setValue(row, col++, item.getEmail());
    }

    @Override
    public void fillSearchCriteria(int row) {
        useCriteriaSheet();
        setTermSelector(row++, 0, "account_email", sf.getEmailTermSelector());

        setSelector(row++, 0, "account_username", sf.getUsernameSelector());
        setSelector(row++, 0, "account_password", sf.getPasswordSelector());
        setSelector(row++, 0, "account_isEnabled", sf.getIsEnabledSelector());
        setRangeDate(row++, 0, "account_lastConnection", sf.getLastConnectionRange());
        setRangeDate(row++, 0, "account_mdpExpiration", sf.getMdpExpirationRange());
        setSelector(row++, 0, "account_email", sf.getEmailSelector());
        setSelectedEntities(row++, 0, "account_securityRoles", sf.getAccount().getSecurityRoles());
    }
}