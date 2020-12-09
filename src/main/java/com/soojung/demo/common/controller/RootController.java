package com.soojung.demo.common.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController implements ErrorController {
    /**
     * The return value from this method is not used; the property `server.error.path`
     * must be set to override the default error page path.
     *
     * @return the error path
     * @deprecated since 2.3.0 in favor of setting the property `server.error.path`
     */
    @Override
    public String getErrorPath() {
        return null;
    }
}
