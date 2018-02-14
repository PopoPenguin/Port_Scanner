package com.application.PortScanner.service;

import com.application.PortScanner.model.Port;
import com.application.PortScanner.repository.PortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Kevin Neag
 */
@Service
public class PortServiceImpl implements PortService {

    private PortRepository portRepository;

    @Autowired
    public void setPortRepository(PortRepository portRepository) {
        this.portRepository = portRepository;
    }

    @Override
    public Iterable<Port> scanPorts() {
        return null;
    }
}
