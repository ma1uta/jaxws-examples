package org.sav.jaxws.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

/**
 * @author tolya
 * @since 11.02.14.
 */
public class LogSOAPHandler implements SOAPHandler<SOAPMessageContext> {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogSOAPHandler.class);

    @Override
    public Set<QName> getHeaders() {
        // Nothing to do
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        boolean isResponse = (boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        if (!isResponse) {
            SOAPMessage message = context.getMessage();
            SOAPEnvelope envelope = null;
            try {
                envelope = message.getSOAPPart().getEnvelope();
            } catch (SOAPException e) {
                LOGGER.error("Cannot get soap envelope", e);
            }
            String textContent = envelope != null ? envelope.getTextContent() : "empty message";
            LOGGER.info("content of request: {}", textContent);
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        try {
            LOGGER.error("Something work wrong with message: {0}",
                         context.getMessage().getSOAPPart().getEnvelope().getTextContent());
        } catch (SOAPException e) {
            LOGGER.error("Cannot get soap envelope", e);
        }
        return true;
    }

    @Override
    public void close(MessageContext context) {
        // Nothing to do
    }
}
