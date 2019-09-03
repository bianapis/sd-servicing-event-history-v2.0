/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ServicingEventHistoryApiServiceImpl implements ServicingEventHistoryApiService {

	public SDServicingEventHistoryActivateOutputModel activate(SDServicingEventHistoryActivateInputModel request){
		return JsonReader.read("activate-SDServicingEventHistoryActivateOutputModel.json",new TypeReference<SDServicingEventHistoryActivateOutputModel>(){});
	}
	
	public BQAssignmentCaptureOutputModel captureAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentCaptureInputModel request){
		return JsonReader.read("capture-BQAssignmentCaptureOutputModel.json",new TypeReference<BQAssignmentCaptureOutputModel>(){});
	}
	
	public BQFacilityCaptureOutputModel captureFacility(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFacilityCaptureInputModel request){
		return JsonReader.read("capture-BQFacilityCaptureOutputModel.json",new TypeReference<BQFacilityCaptureOutputModel>(){});
	}
	
	public BQIssueCaptureOutputModel captureIssue(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssueCaptureInputModel request){
		return JsonReader.read("capture-BQIssueCaptureOutputModel.json",new TypeReference<BQIssueCaptureOutputModel>(){});
	}
	
	public BQSessionCaptureOutputModel captureSession(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSessionCaptureInputModel request){
		return JsonReader.read("capture-BQSessionCaptureOutputModel.json",new TypeReference<BQSessionCaptureOutputModel>(){});
	}
	
	public SDServicingEventHistoryConfigureOutputModel configure(String sdReferenceId, SDServicingEventHistoryConfigureInputModel request){
		return JsonReader.read("configure-SDServicingEventHistoryConfigureOutputModel.json",new TypeReference<SDServicingEventHistoryConfigureOutputModel>(){});
	}
	
	public CRServicingEventLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRServicingEventLogControlInputModel request){
		return JsonReader.read("control-CRServicingEventLogControlOutputModel.json",new TypeReference<CRServicingEventLogControlOutputModel>(){});
	}
	
	public SDServicingEventHistoryFeedbackOutputModel feedback(String sdReferenceId, SDServicingEventHistoryFeedbackInputModel request){
		return JsonReader.read("feedback-SDServicingEventHistoryFeedbackOutputModel.json",new TypeReference<SDServicingEventHistoryFeedbackOutputModel>(){});
	}
	
	public CRServicingEventLogInitiateOutputModel initiate(String sdReferenceId, CRServicingEventLogInitiateInputModel request){
		return JsonReader.read("initiate-CRServicingEventLogInitiateOutputModel.json",new TypeReference<CRServicingEventLogInitiateOutputModel>(){});
	}
	
	public SDServicingEventHistoryRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDServicingEventHistoryRetrieveOutputModel.json",new TypeReference<SDServicingEventHistoryRetrieveOutputModel>(){});
	}
	
	public CRServicingEventLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRServicingEventLogRetrieveOutputModel.json",new TypeReference<CRServicingEventLogRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssignmentRetrieveOutputModel.json",new TypeReference<BQAssignmentRetrieveOutputModel>(){});
	}
	
	public BQFacilityRetrieveOutputModel retrieveFacility(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFacilityRetrieveOutputModel.json",new TypeReference<BQFacilityRetrieveOutputModel>(){});
	}
	
	public BQIssueRetrieveOutputModel retrieveIssue(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQIssueRetrieveOutputModel.json",new TypeReference<BQIssueRetrieveOutputModel>(){});
	}
	
	public BQSessionRetrieveOutputModel retrieveSession(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSessionRetrieveOutputModel.json",new TypeReference<BQSessionRetrieveOutputModel>(){});
	}
	
	public CRServicingEventLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRServicingEventLogUpdateInputModel request){
		return JsonReader.read("update-CRServicingEventLogUpdateOutputModel.json",new TypeReference<CRServicingEventLogUpdateOutputModel>(){});
	}
	
	public BQAssignmentUpdateOutputModel updateAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentUpdateInputModel request){
		return JsonReader.read("update-BQAssignmentUpdateOutputModel.json",new TypeReference<BQAssignmentUpdateOutputModel>(){});
	}
	
	public BQFacilityUpdateOutputModel updateFacility(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFacilityUpdateInputModel request){
		return JsonReader.read("update-BQFacilityUpdateOutputModel.json",new TypeReference<BQFacilityUpdateOutputModel>(){});
	}
	
	public BQIssueUpdateOutputModel updateIssue(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssueUpdateInputModel request){
		return JsonReader.read("update-BQIssueUpdateOutputModel.json",new TypeReference<BQIssueUpdateOutputModel>(){});
	}
	
	public BQSessionUpdateOutputModel updateSession(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSessionUpdateInputModel request){
		return JsonReader.read("update-BQSessionUpdateOutputModel.json",new TypeReference<BQSessionUpdateOutputModel>(){});
	}
	
}
