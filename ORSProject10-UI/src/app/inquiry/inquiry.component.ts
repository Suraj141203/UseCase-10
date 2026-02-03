import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';

@Component({
  selector: 'app-inquiry',
  templateUrl: './inquiry.component.html',
  styleUrls: ['./inquiry.component.css']
})
export class InquiryComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.INQUIRY, locator, route);
  }

  validateForm(form) {
    let validator = this.serviceLocator.dataValidator;
    let flag = true;

    flag = flag && validator.isNotNullObject(form.inquirerName);
    flag = flag && validator.isNotNullObject(form.email);
    flag = flag && validator.isNotNullObject(form.inquirySubject);
    flag = flag && validator.isNotNullObject(form.inquiryStatus);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.inquirerName = data.inquirerName;
    form.email = data.email;
    form.inquirySubject = data.inquirySubject;
    form.inquiryStatus = data.inquiryStatus;
  }
}