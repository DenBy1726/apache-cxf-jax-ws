package com.sample.series.top.down.approach.utils;

import org.apache.cxf.interceptor.security.AuthenticationException;
import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

public class ServicePasswordCallbackHandler implements CallbackHandler {

    WSPasswordCallback wsPasswordCallback = null;

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException, AuthenticationException {

        wsPasswordCallback = (WSPasswordCallback) callbacks[0];

        if(wsPasswordCallback.getIdentifier().equals("sj")) {

            // set the password on the callback. This will be compared to the password which was sent from the client.
            wsPasswordCallback.setPassword("benchresources");
        }
    }
}