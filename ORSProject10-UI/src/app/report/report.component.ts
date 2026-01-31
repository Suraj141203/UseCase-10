import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';
import { BaseCtl } from '../base.component';

@Component({
  selector: 'app-report',
  templateUrl: './report.component.html',
  styleUrls: ['./report.component.css']
})
export class ReportComponent extends BaseCtl {

  constructor(
    public locator: ServiceLocatorService,
    public route: ActivatedRoute
  ) {
    super(locator.endpoints.REPORT, locator, route);
  }

  // ✅ Allow ONLY alphabets (A–Z, a–z, space)
allowOnlyAlphabets(event: KeyboardEvent) {
  const charCode = event.which ? event.which : event.keyCode;
  const char = String.fromCharCode(charCode);

  // Allow backspace, tab, delete
  if (charCode === 8 || charCode === 9 || charCode === 46) {
    return;
  }

  // Regex for alphabets + space
  if (!/^[a-zA-Z ]$/.test(char)) {
    event.preventDefault();
  }
}



  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;

    flag = flag && validator.isNotNullObject(form.reportName);
    flag = flag && validator.isNotNullObject(form.generatedDate);
    flag = flag && validator.isNotNullObject(form.generatedBy);
    flag = flag && validator.isNotNullObject(form.reportStatus);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.reportName = data.reportName;
    form.generatedDate = data.generatedDate;
    form.generatedBy = data.generatedBy;
    form.reportStatus = data.reportStatus;
  }
}
