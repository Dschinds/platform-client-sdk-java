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

public class PutQualityConversationEvaluationRequest {
    
	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public PutQualityConversationEvaluationRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 
	
	private String evaluationId;
	public String getEvaluationId() {
		return this.evaluationId;
	}

	public void setEvaluationId(String evaluationId) {
		this.evaluationId = evaluationId;
	}

	public PutQualityConversationEvaluationRequest withEvaluationId(String evaluationId) {
	    this.setEvaluationId(evaluationId);
	    return this;
	} 
	
	private Evaluation body;
	public Evaluation getBody() {
		return this.body;
	}

	public void setBody(Evaluation body) {
		this.body = body;
	}

	public PutQualityConversationEvaluationRequest withBody(Evaluation body) {
	    this.setBody(body);
	    return this;
	} 
	
	private String expand;
	public String getExpand() {
		return this.expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public PutQualityConversationEvaluationRequest withExpand(String expand) {
	    this.setExpand(expand);
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

    public PutQualityConversationEvaluationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Evaluation> withHttpInfo() {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PutQualityConversationEvaluationRequest.");
        }
        
        // verify the required parameter 'evaluationId' is set
        if (this.evaluationId == null) {
            throw new IllegalStateException("Missing the required parameter 'evaluationId' when building request for PutQualityConversationEvaluationRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutQualityConversationEvaluationRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/quality/conversations/{conversationId}/evaluations/{evaluationId}")
                .withPathParameter("conversationId", conversationId)
        
                .withPathParameter("evaluationId", evaluationId)
        
                .withQueryParameters("expand", "", expand)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String conversationId, String evaluationId, Evaluation body) {
	    return new Builder()
	            .withRequiredParams(conversationId, evaluationId, body);
	}
	

	public static class Builder {
		private final PutQualityConversationEvaluationRequest request;

		private Builder() {
			request = new PutQualityConversationEvaluationRequest();
		}

		
		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		
		public Builder withEvaluationId(String evaluationId) {
			request.setEvaluationId(evaluationId);
			return this;
		}
		
		public Builder withBody(Evaluation body) {
			request.setBody(body);
			return this;
		}
		
		public Builder withExpand(String expand) {
			request.setExpand(expand);
			return this;
		}
		

		
		public Builder withRequiredParams(String conversationId, String evaluationId, Evaluation body) {
			request.setConversationId(conversationId);
						request.setEvaluationId(evaluationId);
						request.setBody(body);
			
			return this;
		}
		

		public PutQualityConversationEvaluationRequest build() {
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PutQualityConversationEvaluationRequest.");
            }
            
            // verify the required parameter 'evaluationId' is set
            if (request.evaluationId == null) {
                throw new IllegalStateException("Missing the required parameter 'evaluationId' when building request for PutQualityConversationEvaluationRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutQualityConversationEvaluationRequest.");
            }
            
			return request;
		}
	}
}
