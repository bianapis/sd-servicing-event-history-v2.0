/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Track;

@BianRestController
public class ServicingEventHistoryApiController {

	@Autowired
	ServicingEventHistoryApiService service;
	
	@Track.Activate
	public BianResponse<SDServicingEventHistoryActivateOutputModel> activate(@RequestBody BianRequest<SDServicingEventHistoryActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Track.Capture
	public BianResponse<BQAssignmentCaptureOutputModel> captureAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssignmentCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureAssignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("facility")
	@Track.Capture
	public BianResponse<BQFacilityCaptureOutputModel> captureFacility(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFacilityCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureFacility(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("issue")
	@Track.Capture
	public BianResponse<BQIssueCaptureOutputModel> captureIssue(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIssueCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureIssue(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("session")
	@Track.Capture
	public BianResponse<BQSessionCaptureOutputModel> captureSession(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSessionCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureSession(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Track.Configure
	public BianResponse<SDServicingEventHistoryConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDServicingEventHistoryConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.Control
	public BianResponse<CRServicingEventLogControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRServicingEventLogControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Track.Feedback
	public BianResponse<SDServicingEventHistoryFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDServicingEventHistoryFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.Initiate
	public BianResponse<CRServicingEventLogInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRServicingEventLogInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@Track.RetrieveSD
	public BianResponse<SDServicingEventHistoryRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Track.Retrieve
	public BianResponse<CRServicingEventLogRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Track.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Track.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Track.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("assignment")
	@Track.Retrieve
	public BianResponse<BQAssignmentRetrieveOutputModel> retrieveAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("facility")
	@Track.Retrieve
	public BianResponse<BQFacilityRetrieveOutputModel> retrieveFacility(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFacility(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("issue")
	@Track.Retrieve
	public BianResponse<BQIssueRetrieveOutputModel> retrieveIssue(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIssue(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("session")
	@Track.Retrieve
	public BianResponse<BQSessionRetrieveOutputModel> retrieveSession(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSession(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Track.Update
	public BianResponse<CRServicingEventLogUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRServicingEventLogUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Track.Update
	public BianResponse<BQAssignmentUpdateOutputModel> updateAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssignmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAssignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("facility")
	@Track.Update
	public BianResponse<BQFacilityUpdateOutputModel> updateFacility(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFacilityUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFacility(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("issue")
	@Track.Update
	public BianResponse<BQIssueUpdateOutputModel> updateIssue(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIssueUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateIssue(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("session")
	@Track.Update
	public BianResponse<BQSessionUpdateOutputModel> updateSession(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSessionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSession(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
