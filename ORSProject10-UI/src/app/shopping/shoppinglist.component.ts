import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-shoppinglist',
  templateUrl: './shoppinglist.component.html',
  styleUrls: ['./shoppinglist.component.css']
})
export class ShoppingListComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService,
              public route: ActivatedRoute) {

    super(locator.endpoints.SHOPPING, locator, route);
  }

}
