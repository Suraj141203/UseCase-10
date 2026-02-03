import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-inquirylist',
  templateUrl: './inquirylist.component.html',
  styleUrls: ['./inquirylist.component.css']
})
export class InquiryListComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.INQUIRY, locator, route);
  }
}