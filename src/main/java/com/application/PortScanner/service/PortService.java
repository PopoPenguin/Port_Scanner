package com.application.PortScanner.service;

import com.application.PortScanner.model.Port;

/**
 * @author Kevin Neag
 */
public interface PortService {

    Iterable<Port> listAllPorts();

    Port getPortById(Integer id);

    Port savePort(Port port);


}
