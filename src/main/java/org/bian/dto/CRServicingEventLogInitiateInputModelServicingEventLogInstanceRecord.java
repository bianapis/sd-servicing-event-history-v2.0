package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogInitiateInputModelServicingEventLogInstanceRecord
 */
public class CRServicingEventLogInitiateInputModelServicingEventLogInstanceRecord   {
  private String servicingPositionReference = null;

  private String employeeBusinessUnitReference = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_ExpjIMTGEeChad0JzLk7QA_159768178  bian-reference: PointOfService  general-info: The servicing position for the log (if the log is organized to track specific positions) 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Employee/unit assigned to the servicing position (if the log is organized to track specific servicing reps that might work at different positions) 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


}

