import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';
import { BaseCtl } from '../base.component';

@Component({
  selector: 'app-job',
  templateUrl: './job.component.html',
  styleUrls: ['./job.component.css']
})
export class JobComponent extends BaseCtl {

  constructor(
    public locator: ServiceLocatorService,
    public route: ActivatedRoute
  ) {
    super(locator.endpoints.JOB, locator, route);
  }


  // Only alphabets allowed
  allowOnlyAlphabets(event: KeyboardEvent) {
    const char = String.fromCharCode(event.keyCode);
    if (!/^[a-zA-Z ]$/.test(char)) {
      event.preventDefault();
    }
  }
  
  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;

    flag = flag && validator.isNotNullObject(form.jobTitle);
    flag = flag && validator.isNotNullObject(form.joiningDate);
    flag = flag && validator.isNotNullObject(form.experience);
    flag = flag && validator.isNotNullObject(form.department);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.jobTitle = data.jobTitle;
    form.joiningDate = data.joiningDate;
    form.experience = data.experience;
    form.department = data.department;
  }
}
