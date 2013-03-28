"use strict";

scaffoldtester.factory( "dataService", function() {
    return {
        customerPipe: AeroGear.Pipeline({
            name: "customers"
         }).pipes.customers,

        customerStore: AeroGear.DataManager({
            name: "Customer",
            type: "SessionLocal",
            settings: {
                 storageType: "localStorage"
            }
        }).stores.Customer,
        discountVoucherPipe: AeroGear.Pipeline({
            name: "discountvouchers"
         }).pipes.discountvouchers,

        discountVoucherStore: AeroGear.DataManager({
            name: "DiscountVoucher",
            type: "SessionLocal",
            settings: {
                 storageType: "localStorage"
            }
        }).stores.DiscountVoucher,
        storeOrderPipe: AeroGear.Pipeline({
            name: "storeorders"
         }).pipes.storeorders,

        storeOrderStore: AeroGear.DataManager({
            name: "StoreOrder",
            type: "SessionLocal",
            settings: {
                 storageType: "localStorage"
            }
        }).stores.StoreOrder
    };
});