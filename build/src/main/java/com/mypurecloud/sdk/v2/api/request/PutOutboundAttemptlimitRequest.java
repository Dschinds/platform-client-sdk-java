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
import com.mypurecloud.sdk.v2.model.Campaign;
import com.mypurecloud.sdk.v2.model.AttemptLimits;
import com.mypurecloud.sdk.v2.model.AttemptLimitsEntityListing;
import com.mypurecloud.sdk.v2.model.CallableTimeSet;
import com.mypurecloud.sdk.v2.model.CallableTimeSetEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseSet;
import com.mypurecloud.sdk.v2.model.ResponseSetEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignDiagnostics;
import com.mypurecloud.sdk.v2.model.CampaignInteractions;
import com.mypurecloud.sdk.v2.model.CampaignProgress;
import com.mypurecloud.sdk.v2.model.CampaignStats;
import com.mypurecloud.sdk.v2.model.CampaignRule;
import com.mypurecloud.sdk.v2.model.CampaignRuleEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignDivisionView;
import com.mypurecloud.sdk.v2.model.CampaignDivisionViewListing;
import com.mypurecloud.sdk.v2.model.ContactList;
import com.mypurecloud.sdk.v2.model.DialerContact;
import com.mypurecloud.sdk.v2.model.ExportUri;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import com.mypurecloud.sdk.v2.model.TimeZoneMappingPreview;
import com.mypurecloud.sdk.v2.model.ContactListFilter;
import com.mypurecloud.sdk.v2.model.ContactListFilterEntityListing;
import com.mypurecloud.sdk.v2.model.ContactListEntityListing;
import com.mypurecloud.sdk.v2.model.ContactListDivisionView;
import com.mypurecloud.sdk.v2.model.ContactListDivisionViewListing;
import com.mypurecloud.sdk.v2.model.DncList;
import com.mypurecloud.sdk.v2.model.DncListEntityListing;
import com.mypurecloud.sdk.v2.model.DncListDivisionView;
import com.mypurecloud.sdk.v2.model.DncListDivisionViewListing;
import com.mypurecloud.sdk.v2.model.EventLog;
import com.mypurecloud.sdk.v2.model.DialerEventEntityListing;
import com.mypurecloud.sdk.v2.model.RuleSet;
import com.mypurecloud.sdk.v2.model.RuleSetEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignSchedule;
import com.mypurecloud.sdk.v2.model.SequenceSchedule;
import com.mypurecloud.sdk.v2.model.CampaignSequence;
import com.mypurecloud.sdk.v2.model.CampaignSequenceEntityListing;
import com.mypurecloud.sdk.v2.model.OutboundSettings;
import com.mypurecloud.sdk.v2.model.WrapUpCodeMapping;
import com.mypurecloud.sdk.v2.model.AuditSearchResult;
import com.mypurecloud.sdk.v2.model.DialerAuditRequest;
import com.mypurecloud.sdk.v2.model.ContactCallbackRequest;
import com.mypurecloud.sdk.v2.model.WritableDialerContact;
import com.mypurecloud.sdk.v2.model.UriReference;
import com.mypurecloud.sdk.v2.model.FilterPreviewResponse;
import com.mypurecloud.sdk.v2.model.DncListCreate;
import com.mypurecloud.sdk.v2.model.Agent;

public class PutOutboundAttemptlimitRequest {
    
	private String attemptLimitsId;
	public String getAttemptLimitsId() {
		return this.attemptLimitsId;
	}

	public void setAttemptLimitsId(String attemptLimitsId) {
		this.attemptLimitsId = attemptLimitsId;
	}

	public PutOutboundAttemptlimitRequest withAttemptLimitsId(String attemptLimitsId) {
	    this.setAttemptLimitsId(attemptLimitsId);
	    return this;
	} 
	
	private AttemptLimits body;
	public AttemptLimits getBody() {
		return this.body;
	}

	public void setBody(AttemptLimits body) {
		this.body = body;
	}

	public PutOutboundAttemptlimitRequest withBody(AttemptLimits body) {
	    this.setBody(body);
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

    public PutOutboundAttemptlimitRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<AttemptLimits> withHttpInfo() {
        
        // verify the required parameter 'attemptLimitsId' is set
        if (this.attemptLimitsId == null) {
            throw new IllegalStateException("Missing the required parameter 'attemptLimitsId' when building request for PutOutboundAttemptlimitRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutOutboundAttemptlimitRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/outbound/attemptlimits/{attemptLimitsId}")
                .withPathParameter("attemptLimitsId", attemptLimitsId)
        
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

	
	public static Builder builder(String attemptLimitsId, AttemptLimits body) {
	    return new Builder()
	            .withRequiredParams(attemptLimitsId, body);
	}
	

	public static class Builder {
		private final PutOutboundAttemptlimitRequest request;

		private Builder() {
			request = new PutOutboundAttemptlimitRequest();
		}

		
		public Builder withAttemptLimitsId(String attemptLimitsId) {
			request.setAttemptLimitsId(attemptLimitsId);
			return this;
		}
		
		public Builder withBody(AttemptLimits body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String attemptLimitsId, AttemptLimits body) {
			request.setAttemptLimitsId(attemptLimitsId);
						request.setBody(body);
			
			return this;
		}
		

		public PutOutboundAttemptlimitRequest build() {
            
            // verify the required parameter 'attemptLimitsId' is set
            if (request.attemptLimitsId == null) {
                throw new IllegalStateException("Missing the required parameter 'attemptLimitsId' when building request for PutOutboundAttemptlimitRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutOutboundAttemptlimitRequest.");
            }
            
			return request;
		}
	}
}
