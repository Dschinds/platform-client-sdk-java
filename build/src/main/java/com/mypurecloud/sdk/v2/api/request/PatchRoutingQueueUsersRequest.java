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
import com.mypurecloud.sdk.v2.model.InboundDomain;
import com.mypurecloud.sdk.v2.model.InboundRoute;
import com.mypurecloud.sdk.v2.model.InboundRouteEntityListing;
import com.mypurecloud.sdk.v2.model.InboundDomainEntityListing;
import com.mypurecloud.sdk.v2.model.EmailSetup;
import com.mypurecloud.sdk.v2.model.LanguageEntityListing;
import com.mypurecloud.sdk.v2.model.Recipient;
import com.mypurecloud.sdk.v2.model.RecipientListing;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.EstimatedWaitTimePredictions;
import com.mypurecloud.sdk.v2.model.QueueMemberEntityListing;
import com.mypurecloud.sdk.v2.model.WrapupCodeEntityListing;
import com.mypurecloud.sdk.v2.model.QueueEntityListing;
import com.mypurecloud.sdk.v2.model.UserQueueEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import com.mypurecloud.sdk.v2.model.SkillEntityListing;
import com.mypurecloud.sdk.v2.model.SMSAvailablePhoneNumberEntityListing;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumber;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberEntityListing;
import com.mypurecloud.sdk.v2.model.Utilization;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.UserLanguageEntityListing;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.QueueMember;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguagePost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.WritableEntity;
import com.mypurecloud.sdk.v2.model.WrapUpCodeReference;
import com.mypurecloud.sdk.v2.model.CreateQueueRequest;
import com.mypurecloud.sdk.v2.model.SmsAddressProvision;
import com.mypurecloud.sdk.v2.model.SmsPhoneNumberProvision;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.QueueRequest;

public class PatchRoutingQueueUsersRequest {
    
	private String queueId;
	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public PatchRoutingQueueUsersRequest withQueueId(String queueId) {
	    this.setQueueId(queueId);
	    return this;
	} 
	
	private List<QueueMember> body;
	public List<QueueMember> getBody() {
		return this.body;
	}

	public void setBody(List<QueueMember> body) {
		this.body = body;
	}

	public PatchRoutingQueueUsersRequest withBody(List<QueueMember> body) {
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

    public PatchRoutingQueueUsersRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<List<QueueMember>> withHttpInfo() {
        
        // verify the required parameter 'queueId' is set
        if (this.queueId == null) {
            throw new IllegalStateException("Missing the required parameter 'queueId' when building request for PatchRoutingQueueUsersRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchRoutingQueueUsersRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/routing/queues/{queueId}/users")
                .withPathParameter("queueId", queueId)
        
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

	
	public static Builder builder(String queueId, List<QueueMember> body) {
	    return new Builder()
	            .withRequiredParams(queueId, body);
	}
	

	public static class Builder {
		private final PatchRoutingQueueUsersRequest request;

		private Builder() {
			request = new PatchRoutingQueueUsersRequest();
		}

		
		public Builder withQueueId(String queueId) {
			request.setQueueId(queueId);
			return this;
		}
		
		public Builder withBody(List<QueueMember> body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String queueId, List<QueueMember> body) {
			request.setQueueId(queueId);
						request.setBody(body);
			
			return this;
		}
		

		public PatchRoutingQueueUsersRequest build() {
            
            // verify the required parameter 'queueId' is set
            if (request.queueId == null) {
                throw new IllegalStateException("Missing the required parameter 'queueId' when building request for PatchRoutingQueueUsersRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchRoutingQueueUsersRequest.");
            }
            
			return request;
		}
	}
}
