/*
 * Source code generated by Celerio, a Jaxio product.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Follow us on twitter: @jaxiosoft
 * Need commercial support ? Contact us: info@jaxio.com
 * Template pack-jsf2-spring-conversation:src/main/java/faces/ConversationContextScope.p.vm.java
 * Template is part of Open Source Project: https://github.com/jaxio/pack-jsf2-spring-conversation
 */
package ma.sgma.edi2.web.faces;

import static ma.sgma.edi2.web.conversation.ConversationHolder.getCurrentConversation;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import ma.sgma.edi2.web.conversation.Conversation;
import ma.sgma.edi2.web.conversation.ConversationContext;

/**
 * Beans in the <code>conversationContext</code> scope reside in a {@link Conversation conversation}'s {@link ConversationContext}.
 * They are <code>visible</code> only when the conversation is bound to the current thread of execution and their 
 * hosting ConversationContext is on top of the conversation's contextes stack.
 * <p>
 * Such a design decision allows a conversation to have 2 <code>conversation scoped</code> beans with 
 * the same name (they just have to reside in 2 different ConversationContext).
 * This prevents bean name clash in complex navigation scenario within the same conversation.
 */
public class ConversationContextScope implements Scope {

    @Override
    public String getConversationId() {
        return getCurrentConversation().getCid();
    }

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        Conversation currentConversation = getCurrentConversation();
        Object bean = currentConversation.getCurrentContext().getBean(name, Object.class);

        if (bean == null) {
            bean = objectFactory.getObject();
            currentConversation.getCurrentContext().addBean(name, bean);
        }

        return bean;
    }

    @Override
    public Object remove(String name) {
        throw new UnsupportedOperationException("remove is done during conversation.end");
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        // no ops
    }

    @Override
    public Object resolveContextualObject(String key) {
        return getCurrentConversation().getCurrentContext().getVar(key);
    }
}