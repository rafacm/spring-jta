/*
* Copyright 2006-2007 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.springsource.greenbeans.examples.edawithspring.etailer.store.services;

import org.springsource.greenbeans.examples.edawithspring.etailer.store.domain.LineItem;
import org.springsource.greenbeans.examples.edawithspring.etailer.store.domain.Purchase;

import java.util.Date;

public interface CustomerOrderService {

  void setLineItemPurchased(long lineItem, Date pd)  ;

  Purchase createPurchase(long customerId);

  LineItem addProductToPurchase(long purchaseId, long productId);

  Purchase getPurchaseById(long purchaseId);

  LineItem getLineItemById(long lineItemId);

  void setLineItemShipped(long lineItem, Date shippedDate);

  void setPurchaseShipped(long purchaseId, Date shippedDate) ;

  void checkout(long purchaseId );

}