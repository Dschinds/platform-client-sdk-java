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
import com.mypurecloud.sdk.v2.model.AnalyticsConversation;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationMultiGetResponse;
import com.mypurecloud.sdk.v2.model.ReportingExportJobListing;
import com.mypurecloud.sdk.v2.model.ReportMetaDataEntityListing;
import com.mypurecloud.sdk.v2.model.ReportMetaData;
import com.mypurecloud.sdk.v2.model.ReportSchedule;
import com.mypurecloud.sdk.v2.model.ReportRunEntryEntityDomainListing;
import com.mypurecloud.sdk.v2.model.ReportRunEntry;
import com.mypurecloud.sdk.v2.model.ReportScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.QualifierMappingObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.ReportingExportJobRequest;
import com.mypurecloud.sdk.v2.model.ReportingExportJobResponse;
import com.mypurecloud.sdk.v2.model.RunNowResponse;
import com.mypurecloud.sdk.v2.model.PresenceQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.ObservationQueryResponse;

public class GetAnalyticsReportingScheduleHistoryRunIdRequest {
    
	private String runId;
	public String getRunId() {
		return this.runId;
	}

	public void setRunId(String runId) {
		this.runId = runId;
	}

	public GetAnalyticsReportingScheduleHistoryRunIdRequest withRunId(String runId) {
	    this.setRunId(runId);
	    return this;
	} 
	
	private String scheduleId;
	public String getScheduleId() {
		return this.scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public GetAnalyticsReportingScheduleHistoryRunIdRequest withScheduleId(String scheduleId) {
	    this.setScheduleId(scheduleId);
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

    public GetAnalyticsReportingScheduleHistoryRunIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'runId' is set
        if (this.runId == null) {
            throw new IllegalStateException("Missing the required parameter 'runId' when building request for GetAnalyticsReportingScheduleHistoryRunIdRequest.");
        }
        
        // verify the required parameter 'scheduleId' is set
        if (this.scheduleId == null) {
            throw new IllegalStateException("Missing the required parameter 'scheduleId' when building request for GetAnalyticsReportingScheduleHistoryRunIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/analytics/reporting/schedules/{scheduleId}/history/{runId}")
                .withPathParameter("runId", runId)
        
                .withPathParameter("scheduleId", scheduleId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String runId, String scheduleId) {
	    return new Builder()
	            .withRequiredParams(runId, scheduleId);
	}
	

	public static class Builder {
		private final GetAnalyticsReportingScheduleHistoryRunIdRequest request;

		private Builder() {
			request = new GetAnalyticsReportingScheduleHistoryRunIdRequest();
		}

		
		public Builder withRunId(String runId) {
			request.setRunId(runId);
			return this;
		}
		
		public Builder withScheduleId(String scheduleId) {
			request.setScheduleId(scheduleId);
			return this;
		}
		

		
		public Builder withRequiredParams(String runId, String scheduleId) {
			request.setRunId(runId);
						request.setScheduleId(scheduleId);
			
			return this;
		}
		

		public GetAnalyticsReportingScheduleHistoryRunIdRequest build() {
            
            // verify the required parameter 'runId' is set
            if (request.runId == null) {
                throw new IllegalStateException("Missing the required parameter 'runId' when building request for GetAnalyticsReportingScheduleHistoryRunIdRequest.");
            }
            
            // verify the required parameter 'scheduleId' is set
            if (request.scheduleId == null) {
                throw new IllegalStateException("Missing the required parameter 'scheduleId' when building request for GetAnalyticsReportingScheduleHistoryRunIdRequest.");
            }
            
			return request;
		}
	}
}
