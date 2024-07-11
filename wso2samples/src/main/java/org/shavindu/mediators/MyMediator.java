package org.shavindu.mediators;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class MyMediator extends AbstractMediator {
    private static final Log log = LogFactory.getLog(MyMediator.class);

    @Override
    public boolean mediate(MessageContext context) {
        // Your mediation logic here
        log.info("Hi, This is Shavindu Senadheera!");
        return true;
    }
}
