import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';
import { BaseCtl } from '../base.component';

@Component({
  selector: 'app-address',
  templateUrl: './address.component.html',
  styleUrls: ['./address.component.css']
})
export class AddressComponent extends BaseCtl {

  constructor(
    public locator: ServiceLocatorService,
    public route: ActivatedRoute
  ) {
    super(locator.endpoints.ADDRESS, locator, route);
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

    flag = flag && validator.isNotNullObject(form.personName);
    flag = flag && validator.isNotNullObject(form.city);
    flag = flag && validator.isNotNullObject(form.state);
    flag = flag && validator.isNotNullObject(form.pincode);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.personName = data.personName;
    form.city = data.city;
    form.state = data.state;
    form.pincode = data.pincode;
  }
}
