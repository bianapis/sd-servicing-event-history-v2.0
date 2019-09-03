package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssueUpdateInputModelIssueInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIssueUpdateOutputModel
 */
public class BQIssueUpdateOutputModel   {
  private BQIssueUpdateInputModelIssueInstanceRecord issueInstanceRecord = null;

  private String issueUpdateActionTaskReference = null;

  private Object issueUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get issueInstanceRecord
   * @return issueInstanceRecord
  **/

  public BQIssueUpdateInputModelIssueInstanceRecord getIssueInstanceRecord() {
    return issueInstanceRecord;
  }

  public void setIssueInstanceRecord(BQIssueUpdateInputModelIssueInstanceRecord issueInstanceRecord) {
    this.issueInstanceRecord = issueInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return issueUpdateActionTaskReference
  **/

  public String getIssueUpdateActionTaskReference() {
    return issueUpdateActionTaskReference;
  }

  public void setIssueUpdateActionTaskReference(String issueUpdateActionTaskReference) {
    this.issueUpdateActionTaskReference = issueUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return issueUpdateActionTaskRecord
  **/

  public Object getIssueUpdateActionTaskRecord() {
    return issueUpdateActionTaskRecord;
  }

  public void setIssueUpdateActionTaskRecord(Object issueUpdateActionTaskRecord) {
    this.issueUpdateActionTaskRecord = issueUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

