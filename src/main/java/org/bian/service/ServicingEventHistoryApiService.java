/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ServicingEventHistoryApiService {

	SDServicingEventHistoryActivateOutputModel activate(SDServicingEventHistoryActivateInputModel request);
	
	BQAssignmentCaptureOutputModel captureAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentCaptureInputModel request);
	
	BQFacilityCaptureOutputModel captureFacility(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFacilityCaptureInputModel request);
	
	BQIssueCaptureOutputModel captureIssue(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssueCaptureInputModel request);
	
	BQSessionCaptureOutputModel captureSession(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSessionCaptureInputModel request);
	
	SDServicingEventHistoryConfigureOutputModel configure(String sdReferenceId, SDServicingEventHistoryConfigureInputModel request);
	
	CRServicingEventLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRServicingEventLogControlInputModel request);
	
	SDServicingEventHistoryFeedbackOutputModel feedback(String sdReferenceId, SDServicingEventHistoryFeedbackInputModel request);
	
	CRServicingEventLogInitiateOutputModel initiate(String sdReferenceId, CRServicingEventLogInitiateInputModel request);
	
	SDServicingEventHistoryRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRServicingEventLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQFacilityRetrieveOutputModel retrieveFacility(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQIssueRetrieveOutputModel retrieveIssue(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSessionRetrieveOutputModel retrieveSession(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRServicingEventLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRServicingEventLogUpdateInputModel request);
	
	BQAssignmentUpdateOutputModel updateAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentUpdateInputModel request);
	
	BQFacilityUpdateOutputModel updateFacility(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFacilityUpdateInputModel request);
	
	BQIssueUpdateOutputModel updateIssue(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssueUpdateInputModel request);
	
	BQSessionUpdateOutputModel updateSession(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSessionUpdateInputModel request);
	
}
