package tran.tuananh.movie.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tran.tuananh.movie.Service.SmsService;
import tran.tuananh.movie.Table.Request.SmsRequest;
import tran.tuananh.movie.Table.Response.Response;

import java.util.Random;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "api/v1/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @PostMapping("/send")
    public Response sendSMS(@RequestBody SmsRequest smsRequest) {
        Random random = new Random();
        smsRequest.setText(smsRequest.getText() + String.valueOf(100000 + random.nextInt(900000)));
        return smsService.sendMessage(smsRequest);
    }
}
