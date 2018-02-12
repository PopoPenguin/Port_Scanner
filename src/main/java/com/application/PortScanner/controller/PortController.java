package com.application.PortScanner.controller;

import com.application.PortScanner.service.PortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Kevin Neag
 */
public class PortController {

    private PortService portService;

    @Autowired
    public void setPortService(PortService portService) {
        this.portService = portService;
    }
}
