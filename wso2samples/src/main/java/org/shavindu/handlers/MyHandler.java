package org.shavindu.handlers;

import org.apache.synapse.MessageContext;
import org.apache.synapse.core.axis2.Axis2MessageContext;
import org.apache.synapse.rest.AbstractHandler;
import org.wso2.securevault.SecretResolver;

public class MyHandler extends AbstractHandler {
    private static final String SECRET_ALIAS = "super_admin_password";

    public void processSecurity(MessageContext messageContext) {
        Axis2MessageContext axis2MessageContext = (Axis2MessageContext) messageContext;

        // Create SecretResolver
        SecretResolver secretResolver = axis2MessageContext.getConfiguration().getAxisConfiguration()
                .getAxisConfiguration().getSecretResolver();

        if (secretResolver != null && secretResolver.isInitialized()) {
            // Retrieve the secret using the alias
            String secret = secretResolver.resolve(SECRET_ALIAS);

            // Use the secret as needed
            System.out.println("Resolved Password for super_admin_password = " + secret);
        } else {
            // Handle the case where the secret resolver is not initialized
            System.err.println("Secret resolver is not initialized.");
        }
    }

    @Override
    public boolean handleRequest(MessageContext messageContext) {
        System.out.println("I am in the handleRequest flow.");
        // Trying to resolve the secure vault alias from the Java Code
        System.out.println("Trying to resolve the secure vault alias from the Java Code");
        processSecurity(messageContext);
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) {
        System.out.println("I am in the handleResponse flow.");
        return true;
    }
}
