import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';

@Component({
  selector: 'app-shopping',
  templateUrl: './shopping.component.html',
  styleUrls: ['./shopping.component.css']
})
export class ShoppingComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService,
              public route: ActivatedRoute) {

    super(locator.endpoints.SHOPPING, locator, route);
  }

  validateForm(form) {

    let validator = this.serviceLocator.dataValidator;
    let flag = true;

    flag = flag && validator.isNotNullObject(form.productName);
    flag = flag && validator.isNotNullObject(form.productPrice);
    flag = flag && validator.isNotNullObject(form.shopName);
    flag = flag && validator.isNotNullObject(form.dob);

    return flag;
  }

  populateForm(form, data) {

    form.id = data.id;
    form.productName = data.productName;
    form.productPrice = data.productPrice;
    form.shopName = data.shopName;
    form.dob = data.dob;
  }

}
