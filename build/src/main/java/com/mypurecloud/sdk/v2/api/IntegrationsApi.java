package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.Integration;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntegrationConfiguration;
import com.mypurecloud.sdk.v2.model.IntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.Action;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.DraftValidationResult;
import com.mypurecloud.sdk.v2.model.ActionEntityListing;
import com.mypurecloud.sdk.v2.model.CategoryEntityListing;
import com.mypurecloud.sdk.v2.model.ClientAppEntityListing;
import com.mypurecloud.sdk.v2.model.Credential;
import com.mypurecloud.sdk.v2.model.CredentialInfoListing;
import com.mypurecloud.sdk.v2.model.CredentialTypeListing;
import com.mypurecloud.sdk.v2.model.IntegrationEventEntityListing;
import com.mypurecloud.sdk.v2.model.IntegrationEvent;
import com.mypurecloud.sdk.v2.model.IntegrationType;
import com.mypurecloud.sdk.v2.model.IntegrationTypeEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateActionInput;
import com.mypurecloud.sdk.v2.model.UpdateDraftInput;
import com.mypurecloud.sdk.v2.model.CreateIntegrationRequest;
import com.mypurecloud.sdk.v2.model.PublishDraftInput;
import com.mypurecloud.sdk.v2.model.TestExecutionResult;
import com.mypurecloud.sdk.v2.model.PostActionInput;
import com.mypurecloud.sdk.v2.model.CredentialInfo;
import com.mypurecloud.sdk.v2.model.UserActionCategoryEntityListing;
import com.mypurecloud.sdk.v2.model.VendorConnectionRequest;


import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationsActionRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteIntegrationsCredentialRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationConfigCurrentRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionDraftValidationRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionSchemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionTemplateRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsActionsDraftsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsClientappsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsCredentialRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsCredentialsRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsCredentialsTypesRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsEventlogRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsEventlogEventIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsTypeRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsTypeConfigschemaRequest;
import com.mypurecloud.sdk.v2.api.request.GetIntegrationsTypesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntegrationRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntegrationsActionRequest;
import com.mypurecloud.sdk.v2.api.request.PatchIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftPublishRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionDraftTestRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionExecuteRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionTestRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsActionsDraftsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsCredentialsRequest;
import com.mypurecloud.sdk.v2.api.request.PostIntegrationsWorkforcemanagementVendorconnectionRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationConfigCurrentRequest;
import com.mypurecloud.sdk.v2.api.request.PutIntegrationsCredentialRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IntegrationsApi {
  private final ApiClient pcapiClient;

  public IntegrationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IntegrationsApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete integration.
   * 
   * @param integrationId Integration Id (required)
   * @return Integration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integration deleteIntegration(String integrationId) throws IOException, ApiException {
    return  deleteIntegration(createDeleteIntegrationRequest(integrationId));
  }

  /**
   * Delete integration.
   * 
   * @param integrationId Integration Id (required)
   * @return Integration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integration> deleteIntegrationWithHttpInfo(String integrationId) throws IOException {
    return deleteIntegration(createDeleteIntegrationRequest(integrationId).withHttpInfo());
  }

  private DeleteIntegrationRequest createDeleteIntegrationRequest(String integrationId) {
    return DeleteIntegrationRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Delete integration.
   * 
   * @param request The request object
   * @return Integration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integration deleteIntegration(DeleteIntegrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Integration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Integration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete integration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integration> deleteIntegration(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Integration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete an Action
   * 
   * @param actionId actionId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntegrationsAction(String actionId) throws IOException, ApiException {
     deleteIntegrationsAction(createDeleteIntegrationsActionRequest(actionId));
  }

  /**
   * Delete an Action
   * 
   * @param actionId actionId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntegrationsActionWithHttpInfo(String actionId) throws IOException {
    return deleteIntegrationsAction(createDeleteIntegrationsActionRequest(actionId).withHttpInfo());
  }

  private DeleteIntegrationsActionRequest createDeleteIntegrationsActionRequest(String actionId) {
    return DeleteIntegrationsActionRequest.builder()
            .withActionId(actionId)
    
            .build();
  }

  /**
   * Delete an Action
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntegrationsAction(DeleteIntegrationsActionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an Action
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntegrationsAction(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete a Draft
   * 
   * @param actionId actionId (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntegrationsActionDraft(String actionId) throws IOException, ApiException {
     deleteIntegrationsActionDraft(createDeleteIntegrationsActionDraftRequest(actionId));
  }

  /**
   * Delete a Draft
   * 
   * @param actionId actionId (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntegrationsActionDraftWithHttpInfo(String actionId) throws IOException {
    return deleteIntegrationsActionDraft(createDeleteIntegrationsActionDraftRequest(actionId).withHttpInfo());
  }

  private DeleteIntegrationsActionDraftRequest createDeleteIntegrationsActionDraftRequest(String actionId) {
    return DeleteIntegrationsActionDraftRequest.builder()
            .withActionId(actionId)
    
            .build();
  }

  /**
   * Delete a Draft
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntegrationsActionDraft(DeleteIntegrationsActionDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntegrationsActionDraft(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete a set of credentials
   * 
   * @param credentialId Credential ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntegrationsCredential(String credentialId) throws IOException, ApiException {
     deleteIntegrationsCredential(createDeleteIntegrationsCredentialRequest(credentialId));
  }

  /**
   * Delete a set of credentials
   * 
   * @param credentialId Credential ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntegrationsCredentialWithHttpInfo(String credentialId) throws IOException {
    return deleteIntegrationsCredential(createDeleteIntegrationsCredentialRequest(credentialId).withHttpInfo());
  }

  private DeleteIntegrationsCredentialRequest createDeleteIntegrationsCredentialRequest(String credentialId) {
    return DeleteIntegrationsCredentialRequest.builder()
            .withCredentialId(credentialId)
    
            .build();
  }

  /**
   * Delete a set of credentials
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteIntegrationsCredential(DeleteIntegrationsCredentialRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a set of credentials
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteIntegrationsCredential(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get integration.
   * 
   * @param integrationId Integration Id (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return Integration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integration getIntegration(String integrationId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException, ApiException {
    return  getIntegration(createGetIntegrationRequest(integrationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage));
  }

  /**
   * Get integration.
   * 
   * @param integrationId Integration Id (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return Integration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integration> getIntegrationWithHttpInfo(String integrationId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException {
    return getIntegration(createGetIntegrationRequest(integrationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage).withHttpInfo());
  }

  private GetIntegrationRequest createGetIntegrationRequest(String integrationId, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) {
    return GetIntegrationRequest.builder()
            .withIntegrationId(integrationId)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .build();
  }

  /**
   * Get integration.
   * 
   * @param request The request object
   * @return Integration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integration getIntegration(GetIntegrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Integration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Integration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get integration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integration> getIntegration(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Integration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get integration configuration.
   * 
   * @param integrationId Integration Id (required)
   * @return IntegrationConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationConfiguration getIntegrationConfigCurrent(String integrationId) throws IOException, ApiException {
    return  getIntegrationConfigCurrent(createGetIntegrationConfigCurrentRequest(integrationId));
  }

  /**
   * Get integration configuration.
   * 
   * @param integrationId Integration Id (required)
   * @return IntegrationConfiguration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationConfiguration> getIntegrationConfigCurrentWithHttpInfo(String integrationId) throws IOException {
    return getIntegrationConfigCurrent(createGetIntegrationConfigCurrentRequest(integrationId).withHttpInfo());
  }

  private GetIntegrationConfigCurrentRequest createGetIntegrationConfigCurrentRequest(String integrationId) {
    return GetIntegrationConfigCurrentRequest.builder()
            .withIntegrationId(integrationId)
    
            .build();
  }

  /**
   * Get integration configuration.
   * 
   * @param request The request object
   * @return IntegrationConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationConfiguration getIntegrationConfigCurrent(GetIntegrationConfigCurrentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntegrationConfiguration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntegrationConfiguration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get integration configuration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationConfiguration> getIntegrationConfigCurrent(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntegrationConfiguration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationConfiguration> response = (ApiResponse<IntegrationConfiguration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationConfiguration> response = (ApiResponse<IntegrationConfiguration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List integrations
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return IntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationEntityListing getIntegrations(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException, ApiException {
    return  getIntegrations(createGetIntegrationsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage));
  }

  /**
   * List integrations
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return IntegrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationEntityListing> getIntegrationsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException {
    return getIntegrations(createGetIntegrationsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage).withHttpInfo());
  }

  private GetIntegrationsRequest createGetIntegrationsRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) {
    return GetIntegrationsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .build();
  }

  /**
   * List integrations
   * 
   * @param request The request object
   * @return IntegrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationEntityListing getIntegrations(GetIntegrationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntegrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntegrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List integrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationEntityListing> getIntegrations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntegrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationEntityListing> response = (ApiResponse<IntegrationEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationEntityListing> response = (ApiResponse<IntegrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves a single Action matching id.
   * 
   * @param actionId actionId (required)
   * @param expand Indicates a field in the response which should be expanded. (optional)
   * @param includeConfig Return config in response. (optional, default to false)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action getIntegrationsAction(String actionId, String expand, Boolean includeConfig) throws IOException, ApiException {
    return  getIntegrationsAction(createGetIntegrationsActionRequest(actionId, expand, includeConfig));
  }

  /**
   * Retrieves a single Action matching id.
   * 
   * @param actionId actionId (required)
   * @param expand Indicates a field in the response which should be expanded. (optional)
   * @param includeConfig Return config in response. (optional, default to false)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> getIntegrationsActionWithHttpInfo(String actionId, String expand, Boolean includeConfig) throws IOException {
    return getIntegrationsAction(createGetIntegrationsActionRequest(actionId, expand, includeConfig).withHttpInfo());
  }

  private GetIntegrationsActionRequest createGetIntegrationsActionRequest(String actionId, String expand, Boolean includeConfig) {
    return GetIntegrationsActionRequest.builder()
            .withActionId(actionId)
    
            .withExpand(expand)
    
            .withIncludeConfig(includeConfig)
    
            .build();
  }

  /**
   * Retrieves a single Action matching id.
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action getIntegrationsAction(GetIntegrationsActionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves a single Action matching id.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> getIntegrationsAction(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve a Draft
   * 
   * @param actionId actionId (required)
   * @param expand Indicates a field in the response which should be expanded. (optional)
   * @param includeConfig Return config in response. (optional, default to false)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action getIntegrationsActionDraft(String actionId, String expand, Boolean includeConfig) throws IOException, ApiException {
    return  getIntegrationsActionDraft(createGetIntegrationsActionDraftRequest(actionId, expand, includeConfig));
  }

  /**
   * Retrieve a Draft
   * 
   * @param actionId actionId (required)
   * @param expand Indicates a field in the response which should be expanded. (optional)
   * @param includeConfig Return config in response. (optional, default to false)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> getIntegrationsActionDraftWithHttpInfo(String actionId, String expand, Boolean includeConfig) throws IOException {
    return getIntegrationsActionDraft(createGetIntegrationsActionDraftRequest(actionId, expand, includeConfig).withHttpInfo());
  }

  private GetIntegrationsActionDraftRequest createGetIntegrationsActionDraftRequest(String actionId, String expand, Boolean includeConfig) {
    return GetIntegrationsActionDraftRequest.builder()
            .withActionId(actionId)
    
            .withExpand(expand)
    
            .withIncludeConfig(includeConfig)
    
            .build();
  }

  /**
   * Retrieve a Draft
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action getIntegrationsActionDraft(GetIntegrationsActionDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve a Draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> getIntegrationsActionDraft(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve schema for a Draft based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of schema file to be retrieved for this draft. (required)
   * @return JsonSchemaDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSchemaDocument getIntegrationsActionDraftSchema(String actionId, String fileName) throws IOException, ApiException {
    return  getIntegrationsActionDraftSchema(createGetIntegrationsActionDraftSchemaRequest(actionId, fileName));
  }

  /**
   * Retrieve schema for a Draft based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of schema file to be retrieved for this draft. (required)
   * @return JsonSchemaDocument
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSchemaDocument> getIntegrationsActionDraftSchemaWithHttpInfo(String actionId, String fileName) throws IOException {
    return getIntegrationsActionDraftSchema(createGetIntegrationsActionDraftSchemaRequest(actionId, fileName).withHttpInfo());
  }

  private GetIntegrationsActionDraftSchemaRequest createGetIntegrationsActionDraftSchemaRequest(String actionId, String fileName) {
    return GetIntegrationsActionDraftSchemaRequest.builder()
            .withActionId(actionId)
    
            .withFileName(fileName)
    
            .build();
  }

  /**
   * Retrieve schema for a Draft based on filename.
   * 
   * @param request The request object
   * @return JsonSchemaDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSchemaDocument getIntegrationsActionDraftSchema(GetIntegrationsActionDraftSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonSchemaDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonSchemaDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve schema for a Draft based on filename.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSchemaDocument> getIntegrationsActionDraftSchema(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonSchemaDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve templates for a Draft based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of template file to be retrieved for this action draft. (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getIntegrationsActionDraftTemplate(String actionId, String fileName) throws IOException, ApiException {
    return  getIntegrationsActionDraftTemplate(createGetIntegrationsActionDraftTemplateRequest(actionId, fileName));
  }

  /**
   * Retrieve templates for a Draft based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of template file to be retrieved for this action draft. (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getIntegrationsActionDraftTemplateWithHttpInfo(String actionId, String fileName) throws IOException {
    return getIntegrationsActionDraftTemplate(createGetIntegrationsActionDraftTemplateRequest(actionId, fileName).withHttpInfo());
  }

  private GetIntegrationsActionDraftTemplateRequest createGetIntegrationsActionDraftTemplateRequest(String actionId, String fileName) {
    return GetIntegrationsActionDraftTemplateRequest.builder()
            .withActionId(actionId)
    
            .withFileName(fileName)
    
            .build();
  }

  /**
   * Retrieve templates for a Draft based on filename.
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getIntegrationsActionDraftTemplate(GetIntegrationsActionDraftTemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve templates for a Draft based on filename.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getIntegrationsActionDraftTemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Validate current Draft configuration.
   * 
   * @param actionId actionId (required)
   * @return DraftValidationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DraftValidationResult getIntegrationsActionDraftValidation(String actionId) throws IOException, ApiException {
    return  getIntegrationsActionDraftValidation(createGetIntegrationsActionDraftValidationRequest(actionId));
  }

  /**
   * Validate current Draft configuration.
   * 
   * @param actionId actionId (required)
   * @return DraftValidationResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DraftValidationResult> getIntegrationsActionDraftValidationWithHttpInfo(String actionId) throws IOException {
    return getIntegrationsActionDraftValidation(createGetIntegrationsActionDraftValidationRequest(actionId).withHttpInfo());
  }

  private GetIntegrationsActionDraftValidationRequest createGetIntegrationsActionDraftValidationRequest(String actionId) {
    return GetIntegrationsActionDraftValidationRequest.builder()
            .withActionId(actionId)
    
            .build();
  }

  /**
   * Validate current Draft configuration.
   * 
   * @param request The request object
   * @return DraftValidationResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DraftValidationResult getIntegrationsActionDraftValidation(GetIntegrationsActionDraftValidationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DraftValidationResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DraftValidationResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Validate current Draft configuration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DraftValidationResult> getIntegrationsActionDraftValidation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DraftValidationResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DraftValidationResult> response = (ApiResponse<DraftValidationResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<DraftValidationResult> response = (ApiResponse<DraftValidationResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve schema for an action based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of schema file to be retrieved for this action. (required)
   * @return JsonSchemaDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSchemaDocument getIntegrationsActionSchema(String actionId, String fileName) throws IOException, ApiException {
    return  getIntegrationsActionSchema(createGetIntegrationsActionSchemaRequest(actionId, fileName));
  }

  /**
   * Retrieve schema for an action based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of schema file to be retrieved for this action. (required)
   * @return JsonSchemaDocument
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSchemaDocument> getIntegrationsActionSchemaWithHttpInfo(String actionId, String fileName) throws IOException {
    return getIntegrationsActionSchema(createGetIntegrationsActionSchemaRequest(actionId, fileName).withHttpInfo());
  }

  private GetIntegrationsActionSchemaRequest createGetIntegrationsActionSchemaRequest(String actionId, String fileName) {
    return GetIntegrationsActionSchemaRequest.builder()
            .withActionId(actionId)
    
            .withFileName(fileName)
    
            .build();
  }

  /**
   * Retrieve schema for an action based on filename.
   * 
   * @param request The request object
   * @return JsonSchemaDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSchemaDocument getIntegrationsActionSchema(GetIntegrationsActionSchemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonSchemaDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonSchemaDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve schema for an action based on filename.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSchemaDocument> getIntegrationsActionSchema(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonSchemaDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieve text of templates for an action based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of template file to be retrieved for this action. (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getIntegrationsActionTemplate(String actionId, String fileName) throws IOException, ApiException {
    return  getIntegrationsActionTemplate(createGetIntegrationsActionTemplateRequest(actionId, fileName));
  }

  /**
   * Retrieve text of templates for an action based on filename.
   * 
   * @param actionId actionId (required)
   * @param fileName Name of template file to be retrieved for this action. (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getIntegrationsActionTemplateWithHttpInfo(String actionId, String fileName) throws IOException {
    return getIntegrationsActionTemplate(createGetIntegrationsActionTemplateRequest(actionId, fileName).withHttpInfo());
  }

  private GetIntegrationsActionTemplateRequest createGetIntegrationsActionTemplateRequest(String actionId, String fileName) {
    return GetIntegrationsActionTemplateRequest.builder()
            .withActionId(actionId)
    
            .withFileName(fileName)
    
            .build();
  }

  /**
   * Retrieve text of templates for an action based on filename.
   * 
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String getIntegrationsActionTemplate(GetIntegrationsActionTemplateRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve text of templates for an action based on filename.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> getIntegrationsActionTemplate(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves all actions associated with filters passed in via query param.
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param sortBy Root level field name to sort on. (optional)
   * @param sortOrder Direction to sort &#39;sortBy&#39; field. (optional, default to asc)
   * @param category Filter by category name (optional)
   * @param name Filter by action name. Provide full or just the first part of name. (optional)
   * @param secure Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. (optional)
   * @param includeAuthActions Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions. (optional, default to false)
   * @return ActionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionEntityListing getIntegrationsActions(Integer pageSize, Integer pageNumber, String nextPage, String previousPage, String sortBy, String sortOrder, String category, String name, String secure, String includeAuthActions) throws IOException, ApiException {
    return  getIntegrationsActions(createGetIntegrationsActionsRequest(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, secure, includeAuthActions));
  }

  /**
   * Retrieves all actions associated with filters passed in via query param.
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param sortBy Root level field name to sort on. (optional)
   * @param sortOrder Direction to sort &#39;sortBy&#39; field. (optional, default to asc)
   * @param category Filter by category name (optional)
   * @param name Filter by action name. Provide full or just the first part of name. (optional)
   * @param secure Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. (optional)
   * @param includeAuthActions Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions. (optional, default to false)
   * @return ActionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionEntityListing> getIntegrationsActionsWithHttpInfo(Integer pageSize, Integer pageNumber, String nextPage, String previousPage, String sortBy, String sortOrder, String category, String name, String secure, String includeAuthActions) throws IOException {
    return getIntegrationsActions(createGetIntegrationsActionsRequest(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, secure, includeAuthActions).withHttpInfo());
  }

  private GetIntegrationsActionsRequest createGetIntegrationsActionsRequest(Integer pageSize, Integer pageNumber, String nextPage, String previousPage, String sortBy, String sortOrder, String category, String name, String secure, String includeAuthActions) {
    return GetIntegrationsActionsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .withCategory(category)
    
            .withName(name)
    
            .withSecure(secure)
    
            .withIncludeAuthActions(includeAuthActions)
    
            .build();
  }

  /**
   * Retrieves all actions associated with filters passed in via query param.
   * 
   * @param request The request object
   * @return ActionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionEntityListing getIntegrationsActions(GetIntegrationsActionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves all actions associated with filters passed in via query param.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionEntityListing> getIntegrationsActions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves all categories of available Actions
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param sortBy Root level field name to sort on. (optional)
   * @param sortOrder Direction to sort &#39;sortBy&#39; field. (optional, default to asc)
   * @param secure Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. (optional)
   * @return CategoryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryEntityListing getIntegrationsActionsCategories(Integer pageSize, Integer pageNumber, String nextPage, String previousPage, String sortBy, String sortOrder, String secure) throws IOException, ApiException {
    return  getIntegrationsActionsCategories(createGetIntegrationsActionsCategoriesRequest(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, secure));
  }

  /**
   * Retrieves all categories of available Actions
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param sortBy Root level field name to sort on. (optional)
   * @param sortOrder Direction to sort &#39;sortBy&#39; field. (optional, default to asc)
   * @param secure Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. (optional)
   * @return CategoryEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryEntityListing> getIntegrationsActionsCategoriesWithHttpInfo(Integer pageSize, Integer pageNumber, String nextPage, String previousPage, String sortBy, String sortOrder, String secure) throws IOException {
    return getIntegrationsActionsCategories(createGetIntegrationsActionsCategoriesRequest(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, secure).withHttpInfo());
  }

  private GetIntegrationsActionsCategoriesRequest createGetIntegrationsActionsCategoriesRequest(Integer pageSize, Integer pageNumber, String nextPage, String previousPage, String sortBy, String sortOrder, String secure) {
    return GetIntegrationsActionsCategoriesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .withSecure(secure)
    
            .build();
  }

  /**
   * Retrieves all categories of available Actions
   * 
   * @param request The request object
   * @return CategoryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryEntityListing getIntegrationsActionsCategories(GetIntegrationsActionsCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CategoryEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CategoryEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves all categories of available Actions
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryEntityListing> getIntegrationsActionsCategories(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CategoryEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryEntityListing> response = (ApiResponse<CategoryEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryEntityListing> response = (ApiResponse<CategoryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Retrieves all action drafts associated with the filters passed in via query param.
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param sortBy Root level field name to sort on. (optional)
   * @param sortOrder Direction to sort &#39;sortBy&#39; field. (optional, default to asc)
   * @param category Filter by category name (optional)
   * @param name Filter by action name. Provide full or just the first part of name. (optional)
   * @param secure Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. (optional)
   * @param includeAuthActions Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions. (optional, default to false)
   * @return ActionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionEntityListing getIntegrationsActionsDrafts(Integer pageSize, Integer pageNumber, String nextPage, String previousPage, String sortBy, String sortOrder, String category, String name, String secure, String includeAuthActions) throws IOException, ApiException {
    return  getIntegrationsActionsDrafts(createGetIntegrationsActionsDraftsRequest(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, secure, includeAuthActions));
  }

  /**
   * Retrieves all action drafts associated with the filters passed in via query param.
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param sortBy Root level field name to sort on. (optional)
   * @param sortOrder Direction to sort &#39;sortBy&#39; field. (optional, default to asc)
   * @param category Filter by category name (optional)
   * @param name Filter by action name. Provide full or just the first part of name. (optional)
   * @param secure Filter to only include secure actions. True will only include actions marked secured. False will include only unsecure actions. Do not use filter if you want all Actions. (optional)
   * @param includeAuthActions Whether or not to include authentication actions in the response. These actions are not directly executable. Some integrations create them and will run them as needed to refresh authentication information for other actions. (optional, default to false)
   * @return ActionEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionEntityListing> getIntegrationsActionsDraftsWithHttpInfo(Integer pageSize, Integer pageNumber, String nextPage, String previousPage, String sortBy, String sortOrder, String category, String name, String secure, String includeAuthActions) throws IOException {
    return getIntegrationsActionsDrafts(createGetIntegrationsActionsDraftsRequest(pageSize, pageNumber, nextPage, previousPage, sortBy, sortOrder, category, name, secure, includeAuthActions).withHttpInfo());
  }

  private GetIntegrationsActionsDraftsRequest createGetIntegrationsActionsDraftsRequest(Integer pageSize, Integer pageNumber, String nextPage, String previousPage, String sortBy, String sortOrder, String category, String name, String secure, String includeAuthActions) {
    return GetIntegrationsActionsDraftsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .withCategory(category)
    
            .withName(name)
    
            .withSecure(secure)
    
            .withIncludeAuthActions(includeAuthActions)
    
            .build();
  }

  /**
   * Retrieves all action drafts associated with the filters passed in via query param.
   * 
   * @param request The request object
   * @return ActionEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ActionEntityListing getIntegrationsActionsDrafts(GetIntegrationsActionsDraftsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ActionEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ActionEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves all action drafts associated with the filters passed in via query param.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ActionEntityListing> getIntegrationsActionsDrafts(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ActionEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ActionEntityListing> response = (ApiResponse<ActionEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List permitted client app integrations for the logged in user
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return ClientAppEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ClientAppEntityListing getIntegrationsClientapps(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException, ApiException {
    return  getIntegrationsClientapps(createGetIntegrationsClientappsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage));
  }

  /**
   * List permitted client app integrations for the logged in user
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return ClientAppEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ClientAppEntityListing> getIntegrationsClientappsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException {
    return getIntegrationsClientapps(createGetIntegrationsClientappsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage).withHttpInfo());
  }

  private GetIntegrationsClientappsRequest createGetIntegrationsClientappsRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) {
    return GetIntegrationsClientappsRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .build();
  }

  /**
   * List permitted client app integrations for the logged in user
   * 
   * @param request The request object
   * @return ClientAppEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ClientAppEntityListing getIntegrationsClientapps(GetIntegrationsClientappsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ClientAppEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ClientAppEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List permitted client app integrations for the logged in user
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ClientAppEntityListing> getIntegrationsClientapps(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ClientAppEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ClientAppEntityListing> response = (ApiResponse<ClientAppEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<ClientAppEntityListing> response = (ApiResponse<ClientAppEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a single credential with sensitive fields redacted
   * 
   * @param credentialId Credential ID (required)
   * @return Credential
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Credential getIntegrationsCredential(String credentialId) throws IOException, ApiException {
    return  getIntegrationsCredential(createGetIntegrationsCredentialRequest(credentialId));
  }

  /**
   * Get a single credential with sensitive fields redacted
   * 
   * @param credentialId Credential ID (required)
   * @return Credential
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Credential> getIntegrationsCredentialWithHttpInfo(String credentialId) throws IOException {
    return getIntegrationsCredential(createGetIntegrationsCredentialRequest(credentialId).withHttpInfo());
  }

  private GetIntegrationsCredentialRequest createGetIntegrationsCredentialRequest(String credentialId) {
    return GetIntegrationsCredentialRequest.builder()
            .withCredentialId(credentialId)
    
            .build();
  }

  /**
   * Get a single credential with sensitive fields redacted
   * 
   * @param request The request object
   * @return Credential
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Credential getIntegrationsCredential(GetIntegrationsCredentialRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Credential> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Credential>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single credential with sensitive fields redacted
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Credential> getIntegrationsCredential(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Credential>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Credential> response = (ApiResponse<Credential>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Credential> response = (ApiResponse<Credential>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List multiple sets of credentials
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return CredentialInfoListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CredentialInfoListing getIntegrationsCredentials(Integer pageNumber, Integer pageSize) throws IOException, ApiException {
    return  getIntegrationsCredentials(createGetIntegrationsCredentialsRequest(pageNumber, pageSize));
  }

  /**
   * List multiple sets of credentials
   * 
   * @param pageNumber Page number (optional, default to 1)
   * @param pageSize Page size (optional, default to 25)
   * @return CredentialInfoListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CredentialInfoListing> getIntegrationsCredentialsWithHttpInfo(Integer pageNumber, Integer pageSize) throws IOException {
    return getIntegrationsCredentials(createGetIntegrationsCredentialsRequest(pageNumber, pageSize).withHttpInfo());
  }

  private GetIntegrationsCredentialsRequest createGetIntegrationsCredentialsRequest(Integer pageNumber, Integer pageSize) {
    return GetIntegrationsCredentialsRequest.builder()
            .withPageNumber(pageNumber)
    
            .withPageSize(pageSize)
    
            .build();
  }

  /**
   * List multiple sets of credentials
   * 
   * @param request The request object
   * @return CredentialInfoListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CredentialInfoListing getIntegrationsCredentials(GetIntegrationsCredentialsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CredentialInfoListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CredentialInfoListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List multiple sets of credentials
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CredentialInfoListing> getIntegrationsCredentials(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CredentialInfoListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CredentialInfoListing> response = (ApiResponse<CredentialInfoListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CredentialInfoListing> response = (ApiResponse<CredentialInfoListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List all credential types
   * 
   * @return CredentialTypeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CredentialTypeListing getIntegrationsCredentialsTypes() throws IOException, ApiException {
    return  getIntegrationsCredentialsTypes(createGetIntegrationsCredentialsTypesRequest());
  }

  /**
   * List all credential types
   * 
   * @return CredentialTypeListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CredentialTypeListing> getIntegrationsCredentialsTypesWithHttpInfo() throws IOException {
    return getIntegrationsCredentialsTypes(createGetIntegrationsCredentialsTypesRequest().withHttpInfo());
  }

  private GetIntegrationsCredentialsTypesRequest createGetIntegrationsCredentialsTypesRequest() {
    return GetIntegrationsCredentialsTypesRequest.builder()
            .build();
  }

  /**
   * List all credential types
   * 
   * @param request The request object
   * @return CredentialTypeListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CredentialTypeListing getIntegrationsCredentialsTypes(GetIntegrationsCredentialsTypesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CredentialTypeListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CredentialTypeListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List all credential types
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CredentialTypeListing> getIntegrationsCredentialsTypes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CredentialTypeListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CredentialTypeListing> response = (ApiResponse<CredentialTypeListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CredentialTypeListing> response = (ApiResponse<CredentialTypeListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List all events
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param sortOrder Order by (optional, default to descending)
   * @param entityId Include only events with this entity ID (optional)
   * @return IntegrationEventEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationEventEntityListing getIntegrationsEventlog(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String entityId) throws IOException, ApiException {
    return  getIntegrationsEventlog(createGetIntegrationsEventlogRequest(pageSize, pageNumber, sortBy, sortOrder, entityId));
  }

  /**
   * List all events
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to timestamp)
   * @param sortOrder Order by (optional, default to descending)
   * @param entityId Include only events with this entity ID (optional)
   * @return IntegrationEventEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationEventEntityListing> getIntegrationsEventlogWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String entityId) throws IOException {
    return getIntegrationsEventlog(createGetIntegrationsEventlogRequest(pageSize, pageNumber, sortBy, sortOrder, entityId).withHttpInfo());
  }

  private GetIntegrationsEventlogRequest createGetIntegrationsEventlogRequest(Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, String entityId) {
    return GetIntegrationsEventlogRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .withEntityId(entityId)
    
            .build();
  }

  /**
   * List all events
   * 
   * @param request The request object
   * @return IntegrationEventEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationEventEntityListing getIntegrationsEventlog(GetIntegrationsEventlogRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntegrationEventEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntegrationEventEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List all events
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationEventEntityListing> getIntegrationsEventlog(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntegrationEventEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationEventEntityListing> response = (ApiResponse<IntegrationEventEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationEventEntityListing> response = (ApiResponse<IntegrationEventEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get a single event
   * 
   * @param eventId Event Id (required)
   * @return IntegrationEvent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationEvent getIntegrationsEventlogEventId(String eventId) throws IOException, ApiException {
    return  getIntegrationsEventlogEventId(createGetIntegrationsEventlogEventIdRequest(eventId));
  }

  /**
   * Get a single event
   * 
   * @param eventId Event Id (required)
   * @return IntegrationEvent
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationEvent> getIntegrationsEventlogEventIdWithHttpInfo(String eventId) throws IOException {
    return getIntegrationsEventlogEventId(createGetIntegrationsEventlogEventIdRequest(eventId).withHttpInfo());
  }

  private GetIntegrationsEventlogEventIdRequest createGetIntegrationsEventlogEventIdRequest(String eventId) {
    return GetIntegrationsEventlogEventIdRequest.builder()
            .withEventId(eventId)
    
            .build();
  }

  /**
   * Get a single event
   * 
   * @param request The request object
   * @return IntegrationEvent
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationEvent getIntegrationsEventlogEventId(GetIntegrationsEventlogEventIdRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntegrationEvent> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntegrationEvent>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a single event
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationEvent> getIntegrationsEventlogEventId(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntegrationEvent>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationEvent> response = (ApiResponse<IntegrationEvent>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationEvent> response = (ApiResponse<IntegrationEvent>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get integration type.
   * 
   * @param typeId Integration Type Id (required)
   * @return IntegrationType
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationType getIntegrationsType(String typeId) throws IOException, ApiException {
    return  getIntegrationsType(createGetIntegrationsTypeRequest(typeId));
  }

  /**
   * Get integration type.
   * 
   * @param typeId Integration Type Id (required)
   * @return IntegrationType
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationType> getIntegrationsTypeWithHttpInfo(String typeId) throws IOException {
    return getIntegrationsType(createGetIntegrationsTypeRequest(typeId).withHttpInfo());
  }

  private GetIntegrationsTypeRequest createGetIntegrationsTypeRequest(String typeId) {
    return GetIntegrationsTypeRequest.builder()
            .withTypeId(typeId)
    
            .build();
  }

  /**
   * Get integration type.
   * 
   * @param request The request object
   * @return IntegrationType
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationType getIntegrationsType(GetIntegrationsTypeRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntegrationType> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntegrationType>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get integration type.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationType> getIntegrationsType(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntegrationType>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationType> response = (ApiResponse<IntegrationType>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationType> response = (ApiResponse<IntegrationType>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get properties config schema for an integration type.
   * 
   * @param typeId Integration Type Id (required)
   * @param configType Config schema type (required)
   * @return JsonSchemaDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSchemaDocument getIntegrationsTypeConfigschema(String typeId, String configType) throws IOException, ApiException {
    return  getIntegrationsTypeConfigschema(createGetIntegrationsTypeConfigschemaRequest(typeId, configType));
  }

  /**
   * Get properties config schema for an integration type.
   * 
   * @param typeId Integration Type Id (required)
   * @param configType Config schema type (required)
   * @return JsonSchemaDocument
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSchemaDocument> getIntegrationsTypeConfigschemaWithHttpInfo(String typeId, String configType) throws IOException {
    return getIntegrationsTypeConfigschema(createGetIntegrationsTypeConfigschemaRequest(typeId, configType).withHttpInfo());
  }

  private GetIntegrationsTypeConfigschemaRequest createGetIntegrationsTypeConfigschemaRequest(String typeId, String configType) {
    return GetIntegrationsTypeConfigschemaRequest.builder()
            .withTypeId(typeId)
    
            .withConfigType(configType)
    
            .build();
  }

  /**
   * Get properties config schema for an integration type.
   * 
   * @param request The request object
   * @return JsonSchemaDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public JsonSchemaDocument getIntegrationsTypeConfigschema(GetIntegrationsTypeConfigschemaRequest request) throws IOException, ApiException {
    try {
      ApiResponse<JsonSchemaDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<JsonSchemaDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get properties config schema for an integration type.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<JsonSchemaDocument> getIntegrationsTypeConfigschema(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<JsonSchemaDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<JsonSchemaDocument> response = (ApiResponse<JsonSchemaDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * List integration types
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return IntegrationTypeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationTypeEntityListing getIntegrationsTypes(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException, ApiException {
    return  getIntegrationsTypes(createGetIntegrationsTypesRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage));
  }

  /**
   * List integration types
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return IntegrationTypeEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationTypeEntityListing> getIntegrationsTypesWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException {
    return getIntegrationsTypes(createGetIntegrationsTypesRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage).withHttpInfo());
  }

  private GetIntegrationsTypesRequest createGetIntegrationsTypesRequest(Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) {
    return GetIntegrationsTypesRequest.builder()
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .build();
  }

  /**
   * List integration types
   * 
   * @param request The request object
   * @return IntegrationTypeEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationTypeEntityListing getIntegrationsTypes(GetIntegrationsTypesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntegrationTypeEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntegrationTypeEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * List integration types
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationTypeEntityListing> getIntegrationsTypes(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntegrationTypeEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationTypeEntityListing> response = (ApiResponse<IntegrationTypeEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationTypeEntityListing> response = (ApiResponse<IntegrationTypeEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an integration.
   * 
   * @param integrationId Integration Id (required)
   * @param body Integration Update (optional)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return Integration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integration patchIntegration(String integrationId, Integration body, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException, ApiException {
    return  patchIntegration(createPatchIntegrationRequest(integrationId, body, pageSize, pageNumber, sortBy, expand, nextPage, previousPage));
  }

  /**
   * Update an integration.
   * 
   * @param integrationId Integration Id (required)
   * @param body Integration Update (optional)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return Integration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integration> patchIntegrationWithHttpInfo(String integrationId, Integration body, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) throws IOException {
    return patchIntegration(createPatchIntegrationRequest(integrationId, body, pageSize, pageNumber, sortBy, expand, nextPage, previousPage).withHttpInfo());
  }

  private PatchIntegrationRequest createPatchIntegrationRequest(String integrationId, Integration body, Integer pageSize, Integer pageNumber, String sortBy, List<String> expand, String nextPage, String previousPage) {
    return PatchIntegrationRequest.builder()
            .withIntegrationId(integrationId)
    
            .withBody(body)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .build();
  }

  /**
   * Update an integration.
   * 
   * @param request The request object
   * @return Integration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integration patchIntegration(PatchIntegrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Integration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Integration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an integration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integration> patchIntegration(ApiRequest<Integration> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Integration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Patch an Action
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action. (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action patchIntegrationsAction(String actionId, UpdateActionInput body) throws IOException, ApiException {
    return  patchIntegrationsAction(createPatchIntegrationsActionRequest(actionId, body));
  }

  /**
   * Patch an Action
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action. (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> patchIntegrationsActionWithHttpInfo(String actionId, UpdateActionInput body) throws IOException {
    return patchIntegrationsAction(createPatchIntegrationsActionRequest(actionId, body).withHttpInfo());
  }

  private PatchIntegrationsActionRequest createPatchIntegrationsActionRequest(String actionId, UpdateActionInput body) {
    return PatchIntegrationsActionRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Patch an Action
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action patchIntegrationsAction(PatchIntegrationsActionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Patch an Action
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> patchIntegrationsAction(ApiRequest<UpdateActionInput> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update an existing Draft
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action Draft. (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action patchIntegrationsActionDraft(String actionId, UpdateDraftInput body) throws IOException, ApiException {
    return  patchIntegrationsActionDraft(createPatchIntegrationsActionDraftRequest(actionId, body));
  }

  /**
   * Update an existing Draft
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action Draft. (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> patchIntegrationsActionDraftWithHttpInfo(String actionId, UpdateDraftInput body) throws IOException {
    return patchIntegrationsActionDraft(createPatchIntegrationsActionDraftRequest(actionId, body).withHttpInfo());
  }

  private PatchIntegrationsActionDraftRequest createPatchIntegrationsActionDraftRequest(String actionId, UpdateDraftInput body) {
    return PatchIntegrationsActionDraftRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update an existing Draft
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action patchIntegrationsActionDraft(PatchIntegrationsActionDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an existing Draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> patchIntegrationsActionDraft(ApiRequest<UpdateDraftInput> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create an integration.
   * 
   * @param body Integration (optional)
   * @return Integration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integration postIntegrations(CreateIntegrationRequest body) throws IOException, ApiException {
    return  postIntegrations(createPostIntegrationsRequest(body));
  }

  /**
   * Create an integration.
   * 
   * @param body Integration (optional)
   * @return Integration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integration> postIntegrationsWithHttpInfo(CreateIntegrationRequest body) throws IOException {
    return postIntegrations(createPostIntegrationsRequest(body).withHttpInfo());
  }

  private PostIntegrationsRequest createPostIntegrationsRequest(CreateIntegrationRequest body) {
    return PostIntegrationsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create an integration.
   * 
   * @param request The request object
   * @return Integration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Integration postIntegrations(PostIntegrationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Integration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Integration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an integration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Integration> postIntegrations(ApiRequest<CreateIntegrationRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Integration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Integration> response = (ApiResponse<Integration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new Draft from existing Action
   * 
   * @param actionId actionId (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionDraft(String actionId) throws IOException, ApiException {
    return  postIntegrationsActionDraft(createPostIntegrationsActionDraftRequest(actionId));
  }

  /**
   * Create a new Draft from existing Action
   * 
   * @param actionId actionId (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionDraftWithHttpInfo(String actionId) throws IOException {
    return postIntegrationsActionDraft(createPostIntegrationsActionDraftRequest(actionId).withHttpInfo());
  }

  private PostIntegrationsActionDraftRequest createPostIntegrationsActionDraftRequest(String actionId) {
    return PostIntegrationsActionDraftRequest.builder()
            .withActionId(actionId)
    
            .build();
  }

  /**
   * Create a new Draft from existing Action
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionDraft(PostIntegrationsActionDraftRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new Draft from existing Action
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionDraft(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Publish a Draft and make it the active Action configuration
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action. (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionDraftPublish(String actionId, PublishDraftInput body) throws IOException, ApiException {
    return  postIntegrationsActionDraftPublish(createPostIntegrationsActionDraftPublishRequest(actionId, body));
  }

  /**
   * Publish a Draft and make it the active Action configuration
   * 
   * @param actionId actionId (required)
   * @param body Input used to patch the Action. (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionDraftPublishWithHttpInfo(String actionId, PublishDraftInput body) throws IOException {
    return postIntegrationsActionDraftPublish(createPostIntegrationsActionDraftPublishRequest(actionId, body).withHttpInfo());
  }

  private PostIntegrationsActionDraftPublishRequest createPostIntegrationsActionDraftPublishRequest(String actionId, PublishDraftInput body) {
    return PostIntegrationsActionDraftPublishRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Publish a Draft and make it the active Action configuration
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionDraftPublish(PostIntegrationsActionDraftPublishRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish a Draft and make it the active Action configuration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionDraftPublish(ApiRequest<PublishDraftInput> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return TestExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestExecutionResult postIntegrationsActionDraftTest(String actionId, Object body) throws IOException, ApiException {
    return  postIntegrationsActionDraftTest(createPostIntegrationsActionDraftTestRequest(actionId, body));
  }

  /**
   * Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return TestExecutionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestExecutionResult> postIntegrationsActionDraftTestWithHttpInfo(String actionId, Object body) throws IOException {
    return postIntegrationsActionDraftTest(createPostIntegrationsActionDraftTestRequest(actionId, body).withHttpInfo());
  }

  private PostIntegrationsActionDraftTestRequest createPostIntegrationsActionDraftTestRequest(String actionId, Object body) {
    return PostIntegrationsActionDraftTestRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request The request object
   * @return TestExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestExecutionResult postIntegrationsActionDraftTest(PostIntegrationsActionDraftTestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TestExecutionResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TestExecutionResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Test the execution of a draft. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestExecutionResult> postIntegrationsActionDraftTest(ApiRequest<Object> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TestExecutionResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object postIntegrationsActionExecute(String actionId, Object body) throws IOException, ApiException {
    return  postIntegrationsActionExecute(createPostIntegrationsActionExecuteRequest(actionId, body));
  }

  /**
   * Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return Object
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> postIntegrationsActionExecuteWithHttpInfo(String actionId, Object body) throws IOException {
    return postIntegrationsActionExecute(createPostIntegrationsActionExecuteRequest(actionId, body).withHttpInfo());
  }

  private PostIntegrationsActionExecuteRequest createPostIntegrationsActionExecuteRequest(String actionId, Object body) {
    return PostIntegrationsActionExecuteRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.
   * 
   * @param request The request object
   * @return Object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Object postIntegrationsActionExecute(PostIntegrationsActionExecuteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Object> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Object>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Execute Action and return response from 3rd party.  Responses will follow the schemas defined on the Action for success and error.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Object> postIntegrationsActionExecute(ApiRequest<Object> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Object>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Object> response = (ApiResponse<Object>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return TestExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestExecutionResult postIntegrationsActionTest(String actionId, Object body) throws IOException, ApiException {
    return  postIntegrationsActionTest(createPostIntegrationsActionTestRequest(actionId, body));
  }

  /**
   * Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param actionId actionId (required)
   * @param body Map of parameters used for variable substitution. (required)
   * @return TestExecutionResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestExecutionResult> postIntegrationsActionTestWithHttpInfo(String actionId, Object body) throws IOException {
    return postIntegrationsActionTest(createPostIntegrationsActionTestRequest(actionId, body).withHttpInfo());
  }

  private PostIntegrationsActionTestRequest createPostIntegrationsActionTestRequest(String actionId, Object body) {
    return PostIntegrationsActionTestRequest.builder()
            .withActionId(actionId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request The request object
   * @return TestExecutionResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TestExecutionResult postIntegrationsActionTest(PostIntegrationsActionTestRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TestExecutionResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TestExecutionResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Test the execution of an action. Responses will show execution steps broken out with intermediate results to help in debugging.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TestExecutionResult> postIntegrationsActionTest(ApiRequest<Object> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TestExecutionResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<TestExecutionResult> response = (ApiResponse<TestExecutionResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new Action
   * 
   * @param body Input used to create Action. (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActions(PostActionInput body) throws IOException, ApiException {
    return  postIntegrationsActions(createPostIntegrationsActionsRequest(body));
  }

  /**
   * Create a new Action
   * 
   * @param body Input used to create Action. (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionsWithHttpInfo(PostActionInput body) throws IOException {
    return postIntegrationsActions(createPostIntegrationsActionsRequest(body).withHttpInfo());
  }

  private PostIntegrationsActionsRequest createPostIntegrationsActionsRequest(PostActionInput body) {
    return PostIntegrationsActionsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new Action
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActions(PostIntegrationsActionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new Action
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActions(ApiRequest<PostActionInput> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a new Draft
   * 
   * @param body Input used to create Action Draft. (required)
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionsDrafts(PostActionInput body) throws IOException, ApiException {
    return  postIntegrationsActionsDrafts(createPostIntegrationsActionsDraftsRequest(body));
  }

  /**
   * Create a new Draft
   * 
   * @param body Input used to create Action Draft. (required)
   * @return Action
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionsDraftsWithHttpInfo(PostActionInput body) throws IOException {
    return postIntegrationsActionsDrafts(createPostIntegrationsActionsDraftsRequest(body).withHttpInfo());
  }

  private PostIntegrationsActionsDraftsRequest createPostIntegrationsActionsDraftsRequest(PostActionInput body) {
    return PostIntegrationsActionsDraftsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a new Draft
   * 
   * @param request The request object
   * @return Action
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Action postIntegrationsActionsDrafts(PostIntegrationsActionsDraftsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Action> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Action>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new Draft
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Action> postIntegrationsActionsDrafts(ApiRequest<PostActionInput> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Action>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Action> response = (ApiResponse<Action>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create a set of credentials
   * 
   * @param body Credential (optional)
   * @return CredentialInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CredentialInfo postIntegrationsCredentials(Credential body) throws IOException, ApiException {
    return  postIntegrationsCredentials(createPostIntegrationsCredentialsRequest(body));
  }

  /**
   * Create a set of credentials
   * 
   * @param body Credential (optional)
   * @return CredentialInfo
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CredentialInfo> postIntegrationsCredentialsWithHttpInfo(Credential body) throws IOException {
    return postIntegrationsCredentials(createPostIntegrationsCredentialsRequest(body).withHttpInfo());
  }

  private PostIntegrationsCredentialsRequest createPostIntegrationsCredentialsRequest(Credential body) {
    return PostIntegrationsCredentialsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create a set of credentials
   * 
   * @param request The request object
   * @return CredentialInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CredentialInfo postIntegrationsCredentials(PostIntegrationsCredentialsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CredentialInfo> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CredentialInfo>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a set of credentials
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CredentialInfo> postIntegrationsCredentials(ApiRequest<Credential> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CredentialInfo>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CredentialInfo> response = (ApiResponse<CredentialInfo>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CredentialInfo> response = (ApiResponse<CredentialInfo>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Add a vendor connection
   * 
   * @param body  (optional)
   * @return UserActionCategoryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserActionCategoryEntityListing postIntegrationsWorkforcemanagementVendorconnection(VendorConnectionRequest body) throws IOException, ApiException {
    return  postIntegrationsWorkforcemanagementVendorconnection(createPostIntegrationsWorkforcemanagementVendorconnectionRequest(body));
  }

  /**
   * Add a vendor connection
   * 
   * @param body  (optional)
   * @return UserActionCategoryEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserActionCategoryEntityListing> postIntegrationsWorkforcemanagementVendorconnectionWithHttpInfo(VendorConnectionRequest body) throws IOException {
    return postIntegrationsWorkforcemanagementVendorconnection(createPostIntegrationsWorkforcemanagementVendorconnectionRequest(body).withHttpInfo());
  }

  private PostIntegrationsWorkforcemanagementVendorconnectionRequest createPostIntegrationsWorkforcemanagementVendorconnectionRequest(VendorConnectionRequest body) {
    return PostIntegrationsWorkforcemanagementVendorconnectionRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Add a vendor connection
   * 
   * @param request The request object
   * @return UserActionCategoryEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UserActionCategoryEntityListing postIntegrationsWorkforcemanagementVendorconnection(PostIntegrationsWorkforcemanagementVendorconnectionRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UserActionCategoryEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UserActionCategoryEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add a vendor connection
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UserActionCategoryEntityListing> postIntegrationsWorkforcemanagementVendorconnection(ApiRequest<VendorConnectionRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UserActionCategoryEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UserActionCategoryEntityListing> response = (ApiResponse<UserActionCategoryEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<UserActionCategoryEntityListing> response = (ApiResponse<UserActionCategoryEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update integration configuration.
   * 
   * @param integrationId Integration Id (required)
   * @param body Integration Configuration (optional)
   * @return IntegrationConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationConfiguration putIntegrationConfigCurrent(String integrationId, IntegrationConfiguration body) throws IOException, ApiException {
    return  putIntegrationConfigCurrent(createPutIntegrationConfigCurrentRequest(integrationId, body));
  }

  /**
   * Update integration configuration.
   * 
   * @param integrationId Integration Id (required)
   * @param body Integration Configuration (optional)
   * @return IntegrationConfiguration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationConfiguration> putIntegrationConfigCurrentWithHttpInfo(String integrationId, IntegrationConfiguration body) throws IOException {
    return putIntegrationConfigCurrent(createPutIntegrationConfigCurrentRequest(integrationId, body).withHttpInfo());
  }

  private PutIntegrationConfigCurrentRequest createPutIntegrationConfigCurrentRequest(String integrationId, IntegrationConfiguration body) {
    return PutIntegrationConfigCurrentRequest.builder()
            .withIntegrationId(integrationId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update integration configuration.
   * 
   * @param request The request object
   * @return IntegrationConfiguration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public IntegrationConfiguration putIntegrationConfigCurrent(PutIntegrationConfigCurrentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<IntegrationConfiguration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<IntegrationConfiguration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update integration configuration.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<IntegrationConfiguration> putIntegrationConfigCurrent(ApiRequest<IntegrationConfiguration> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<IntegrationConfiguration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationConfiguration> response = (ApiResponse<IntegrationConfiguration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<IntegrationConfiguration> response = (ApiResponse<IntegrationConfiguration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update a set of credentials
   * 
   * @param credentialId Credential ID (required)
   * @param body Credential (optional)
   * @return CredentialInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CredentialInfo putIntegrationsCredential(String credentialId, Credential body) throws IOException, ApiException {
    return  putIntegrationsCredential(createPutIntegrationsCredentialRequest(credentialId, body));
  }

  /**
   * Update a set of credentials
   * 
   * @param credentialId Credential ID (required)
   * @param body Credential (optional)
   * @return CredentialInfo
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CredentialInfo> putIntegrationsCredentialWithHttpInfo(String credentialId, Credential body) throws IOException {
    return putIntegrationsCredential(createPutIntegrationsCredentialRequest(credentialId, body).withHttpInfo());
  }

  private PutIntegrationsCredentialRequest createPutIntegrationsCredentialRequest(String credentialId, Credential body) {
    return PutIntegrationsCredentialRequest.builder()
            .withCredentialId(credentialId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update a set of credentials
   * 
   * @param request The request object
   * @return CredentialInfo
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CredentialInfo putIntegrationsCredential(PutIntegrationsCredentialRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CredentialInfo> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CredentialInfo>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a set of credentials
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CredentialInfo> putIntegrationsCredential(ApiRequest<Credential> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CredentialInfo>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CredentialInfo> response = (ApiResponse<CredentialInfo>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CredentialInfo> response = (ApiResponse<CredentialInfo>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
