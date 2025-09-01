package com.pennyquin.openapi.api.impl;

import com.pennyquin.openapi.api.HealthApi;
import com.pennyquin.openapi.model.DailyReportRequest;
import com.pennyquin.openapi.model.ErrorResponse;
import com.pennyquin.openapi.model.SuccessResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-01T14:09:06.896297600+02:00[Europe/Berlin]", comments = "Generator version: 7.15.0")
@Controller
@RequestMapping("${openapi.healthTracker.base-path:}")
public class HealthApiController implements HealthApi {

    private final NativeWebRequest request;

    @Autowired
    public HealthApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
