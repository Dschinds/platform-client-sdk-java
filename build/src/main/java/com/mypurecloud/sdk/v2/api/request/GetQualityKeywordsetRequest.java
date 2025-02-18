package com.mypurecloud.sdk.v2.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiRequestBuilder;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.AgentActivityEntityListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.CalibrationEntityListing;
import com.mypurecloud.sdk.v2.model.QualityAuditPage;
import com.mypurecloud.sdk.v2.model.Survey;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormEntityListing;
import com.mypurecloud.sdk.v2.model.SurveyForm;
import com.mypurecloud.sdk.v2.model.SurveyFormEntityListing;
import com.mypurecloud.sdk.v2.model.KeywordSet;
import com.mypurecloud.sdk.v2.model.KeywordSetEntityListing;
import com.mypurecloud.sdk.v2.model.ScorableSurvey;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;
import com.mypurecloud.sdk.v2.model.PublishForm;
import com.mypurecloud.sdk.v2.model.SurveyScoringSet;
import com.mypurecloud.sdk.v2.model.SurveyFormAndScoringSet;

public class GetQualityKeywordsetRequest {
    
	private String keywordSetId;
	public String getKeywordSetId() {
		return this.keywordSetId;
	}

	public void setKeywordSetId(String keywordSetId) {
		this.keywordSetId = keywordSetId;
	}

	public GetQualityKeywordsetRequest withKeywordSetId(String keywordSetId) {
	    this.setKeywordSetId(keywordSetId);
	    return this;
	} 
	
	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public GetQualityKeywordsetRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'keywordSetId' is set
        if (this.keywordSetId == null) {
            throw new IllegalStateException("Missing the required parameter 'keywordSetId' when building request for GetQualityKeywordsetRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/quality/keywordsets/{keywordSetId}")
                .withPathParameter("keywordSetId", keywordSetId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String keywordSetId) {
	    return new Builder()
	            .withRequiredParams(keywordSetId);
	}
	

	public static class Builder {
		private final GetQualityKeywordsetRequest request;

		private Builder() {
			request = new GetQualityKeywordsetRequest();
		}

		
		public Builder withKeywordSetId(String keywordSetId) {
			request.setKeywordSetId(keywordSetId);
			return this;
		}
		

		
		public Builder withRequiredParams(String keywordSetId) {
			request.setKeywordSetId(keywordSetId);
			
			return this;
		}
		

		public GetQualityKeywordsetRequest build() {
            
            // verify the required parameter 'keywordSetId' is set
            if (request.keywordSetId == null) {
                throw new IllegalStateException("Missing the required parameter 'keywordSetId' when building request for GetQualityKeywordsetRequest.");
            }
            
			return request;
		}
	}
}
