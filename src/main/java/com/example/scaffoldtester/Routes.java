/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.scaffoldtester;

import com.example.scaffoldtester.model.Customer;
import com.example.scaffoldtester.rest.CustomerEndpoint;
import com.example.scaffoldtester.model.DiscountVoucher;
import com.example.scaffoldtester.rest.DiscountVoucherEndpoint;
import com.example.scaffoldtester.model.StoreOrder;
import com.example.scaffoldtester.rest.StoreOrderEndpoint;

import org.jboss.aerogear.controller.router.AbstractRoutingModule;
import org.jboss.aerogear.controller.router.MediaType;
import org.jboss.aerogear.controller.router.RequestMethod;

public class Routes extends AbstractRoutingModule
{

   @Override
   public void configuration() throws Exception
   {

      route()
            .from("/customers")
            .on(RequestMethod.GET)
            .consumes(JSON)
            .produces(JSON)
            .to(CustomerEndpoint.class).listAll();
      route()
            .from("/customers")
            .on(RequestMethod.POST)
            .consumes(JSON)
            .produces(JSON)
            .to(CustomerEndpoint.class).create(param(Customer.class));
      route()
            .from("/customers/{id}")
            .on(RequestMethod.DELETE)
            .consumes(JSON)
            .produces(JSON)
            .to(CustomerEndpoint.class).deleteById(param("id", Long.class));
      route()
            .from("/customers/{id}")
            .on(RequestMethod.GET)
            .consumes(JSON)
            .produces(JSON)
            .to(CustomerEndpoint.class).findById(param("id", Long.class));
      route()
            .from("/customers/{id}")
            .on(RequestMethod.PUT)
            .consumes(JSON)
            .produces(JSON)
            .to(CustomerEndpoint.class).update(param("id", Long.class), param(Customer.class));
      route()
            .from("/discountvouchers")
            .on(RequestMethod.GET)
            .consumes(JSON)
            .produces(JSON)
            .to(DiscountVoucherEndpoint.class).listAll();
      route()
            .from("/discountvouchers")
            .on(RequestMethod.POST)
            .consumes(JSON)
            .produces(JSON)
            .to(DiscountVoucherEndpoint.class).create(param(DiscountVoucher.class));
      route()
            .from("/discountvouchers/{id}")
            .on(RequestMethod.DELETE)
            .consumes(JSON)
            .produces(JSON)
            .to(DiscountVoucherEndpoint.class).deleteById(param("id", Long.class));
      route()
            .from("/discountvouchers/{id}")
            .on(RequestMethod.GET)
            .consumes(JSON)
            .produces(JSON)
            .to(DiscountVoucherEndpoint.class).findById(param("id", Long.class));
      route()
            .from("/discountvouchers/{id}")
            .on(RequestMethod.PUT)
            .consumes(JSON)
            .produces(JSON)
            .to(DiscountVoucherEndpoint.class).update(param("id", Long.class), param(DiscountVoucher.class));
      route()
            .from("/storeorders")
            .on(RequestMethod.GET)
            .consumes(JSON)
            .produces(JSON)
            .to(StoreOrderEndpoint.class).listAll();
      route()
            .from("/storeorders")
            .on(RequestMethod.POST)
            .consumes(JSON)
            .produces(JSON)
            .to(StoreOrderEndpoint.class).create(param(StoreOrder.class));
      route()
            .from("/storeorders/{id}")
            .on(RequestMethod.DELETE)
            .consumes(JSON)
            .produces(JSON)
            .to(StoreOrderEndpoint.class).deleteById(param("id", Long.class));
      route()
            .from("/storeorders/{id}")
            .on(RequestMethod.GET)
            .consumes(JSON)
            .produces(JSON)
            .to(StoreOrderEndpoint.class).findById(param("id", Long.class));
      route()
            .from("/storeorders/{id}")
            .on(RequestMethod.PUT)
            .consumes(JSON)
            .produces(JSON)
            .to(StoreOrderEndpoint.class).update(param("id", Long.class), param(StoreOrder.class));

   }

   private Long parseLong(String param)
   {
      Long parsedLong = null;
      try
      {
         parsedLong = Long.getLong(param);
      }
      catch (NumberFormatException e)
      {
         //TODO
      }
      finally
      {
         return parsedLong;
      }
   }

}
