package cast.testapp.facturacionsb.invoice.ctl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/invoices/")
public class InvoiceController {

    @PostMapping("createInvoice")
    public void createInvoice(@RequestParam String customerCode){

        cast.testapp.invoice.controller.InvoiceController invoiceController = new cast.testapp.invoice.controller.InvoiceController();
        invoiceController.createInvoice(customerCode, Collections.EMPTY_LIST);

    }

}
