package com.swagger.api;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.ApplicationLoadBalancerRequestEvent;
import com.amazonaws.services.lambda.runtime.events.ApplicationLoadBalancerResponseEvent;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Handler {

    // Método que genera y devuelve la especificación OpenAPI en formato JSON
    public ApplicationLoadBalancerResponseEvent handleRequest(ApplicationLoadBalancerRequestEvent input, Context context) {
        ApplicationLoadBalancerResponseEvent response = new ApplicationLoadBalancerResponseEvent();
        response.setStatusCode(200); // Código de estado HTTP para OK
        response.setBody("BODY");
        response.setHeaders(Map.of("Content-Type", "application/json")); // Define el tipo de contenido como JSON
        return response;
    }


}
