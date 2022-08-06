package de.baimos.blueid.sdk.api;

import de.baimos.blueid.sdk.api.response.ResponseObject;

public interface CommandExecutionResponse {
    int getResponseCode();

    ResponseObject getResponseObject();
}
