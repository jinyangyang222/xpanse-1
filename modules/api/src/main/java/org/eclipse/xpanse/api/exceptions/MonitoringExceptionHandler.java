/*
 * SPDX-License-Identifier: Apache-2.0
 * SPDX-FileCopyrightText: Huawei Inc.
 */

package org.eclipse.xpanse.api.exceptions;

import java.util.Collections;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.xpanse.modules.models.monitor.exceptions.ClientApiCallFailedException;
import org.eclipse.xpanse.modules.models.monitor.exceptions.ResourceNotFoundException;
import org.eclipse.xpanse.modules.models.monitor.exceptions.ResourceNotSupportedForMonitoringException;
import org.eclipse.xpanse.modules.models.response.Response;
import org.eclipse.xpanse.modules.models.response.ResultType;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Exception handler related to monitoring requests.
 */
@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class MonitoringExceptionHandler {

    /**
     * Exception handler for ClientApiCallFailedException.
     */
    @ExceptionHandler({ClientApiCallFailedException.class})
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @ResponseBody
    public Response handleClientApiCalledException(
            ClientApiCallFailedException ex) {
        return Response.errorResponse(ResultType.BACKEND_FAILURE,
                Collections.singletonList(ex.getMessage()));
    }

    /**
     * Exception handler for ResourceNotSupportedForMonitoringException.
     */
    @ExceptionHandler({ResourceNotSupportedForMonitoringException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response handleResourceNotSupportedForMonitoringException(
            ResourceNotSupportedForMonitoringException ex) {
        return Response.errorResponse(ResultType.RESOURCE_TYPE_INVALID_FOR_MONITORING,
                Collections.singletonList(ex.getMessage()));
    }

    /**
     * Exception handler for ResourceNotFoundException.
     */
    @ExceptionHandler({ResourceNotFoundException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response handleResourceNotFoundException(
            ResourceNotFoundException ex) {
        return Response.errorResponse(ResultType.RESOURCE_NOT_FOUND,
                Collections.singletonList(ex.getMessage()));
    }
}
