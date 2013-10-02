package de.alta8.java_ws_up_and_running.ch01.ts;

import javax.xml.ws.Endpoint;

/* warum javax.xml.ws und nicht. javax.jws? */

public class TimeServerPublisher
{
    public static void main(String[] args)
    {
        Endpoint.publish("http://127.0.0.1:9876/ts", new TimeServerImpl());
    }
}

