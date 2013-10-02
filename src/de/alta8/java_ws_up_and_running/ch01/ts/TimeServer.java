package de.alta8.java_ws_up_and_running.ch01.ts;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface TimeServer
{
    @WebMethod
    String getTimeAsString();

    @WebMethod
    long getTimeAsElapsed();
}

